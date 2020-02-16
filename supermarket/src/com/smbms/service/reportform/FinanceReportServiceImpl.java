/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: FinanceReportServiceImpl
 * Author:   Administrator
 * Date:     2020/2/12 9:52
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.smbms.service.reportform;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.smbms.pojo.Page;
import com.smbms.pojo.PageBean;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.smbms.dao.bill.SmbmsBillMapper;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/2/12
 * @since 1.0.0
 */
@Service
@Transactional
public class FinanceReportServiceImpl implements  FinanceReportService {


    @Resource
    SmbmsBillMapper SmbmsBillMapper;
    @Override
    public PageBean financeReportByOrders(String startTime, String endTime, String productInsurance, Page page) {

        //条件集合
        Map<String,Object> orders=new HashMap<String,Object>();

        if(StringUtils.isNotBlank(startTime)){
            orders.put("startTime",startTime);
        }

        if(StringUtils.isNotBlank(endTime)){
            orders.put("endTime",endTime);
        }

        if(StringUtils.isNotBlank(productInsurance)){
            orders.put("productInsurance",Integer.parseInt(productInsurance));
            if("900".equals(productInsurance)){
                orders.put("buyName","新型冠状病毒检测试剂-不含保险");
            }else if("1100".equals(productInsurance)){
                orders.put("buyName","新型冠状病毒检测试剂-含保险");
            }
        }


        PageHelper pageHelper = new PageHelper();
        page.setSize(5);
        pageHelper.startPage(page.getCurrentpage(), page.getSize());
        //购进数量汇总
        List<HashMap<String, Object>>  financeBuyReports=SmbmsBillMapper.financeBuyReportByOrders(orders);

        //销售数量汇总
        List<HashMap<String, Object>> financesaleReport=SmbmsBillMapper.financeSaleReportByOrders(orders);

        List<HashMap<String,Object>> financeReports=new ArrayList<>();

        //不含保险的map
        HashMap<String,Object> map1=new HashMap<>();
        //含保险的map
        HashMap<String,Object> map2=new HashMap<>();
        for(HashMap<String, Object> map:financeBuyReports){
               String buyName= (String) map.get("buyName");
               if("新型冠状病毒检测试剂-不含保险".equals(buyName)){
                   for(HashMap<String, Object> saleMap:financesaleReport){
                       if(saleMap.get("productInsurance")!=null&&saleMap.get("productInsurance").equals(900)){
                           map1.put("buyName",buyName);
                           map1.put("saleCount",saleMap.get("saleCount"));
                           map1.put("saleTotal",saleMap.get("saleTotal"));
                           map1.put("productInsurance",saleMap.get("productInsurance"));

                           map1.put("buyCount",map.get("buyCount"));
                           map1.put("buyTotal",map.get("buyTotal"));
                       }
                   }
               }else if("新型冠状病毒检测试剂-含保险".equals(buyName)){
                   for(HashMap<String, Object> saleMap:financesaleReport){
                       if(saleMap.get("productInsurance")!=null&&saleMap.get("productInsurance").equals(1100)){
                           map2.put("buyName",buyName);
                           map2.put("saleCount",saleMap.get("saleCount"));
                           map2.put("saleTotal",saleMap.get("saleTotal"));
                           map2.put("productInsurance",saleMap.get("productInsurance"));
                           map2.put("buyCount",map.get("buyCount"));
                           map2.put("buyTotal",map.get("buyTotal"));
                       }
                   }
               }
           }
        if(map1.keySet().size()>0){
            financeReports.add( map1);
        }
        if(map2.keySet().size()>0){
            financeReports.add( map2);
        }
        PageInfo pageInfo = new PageInfo(financeReports);
        PageBean pageBean=new PageBean();
        return new PageBean(page.getSize(), pageInfo.getTotal(), financeReports);
    }

    @Override
    public PageBean orderReport(String id, String creationDate, String seliverDate, String isFreeShip, String seliverStatus, String isPayment, Page page) {
        //条件集合
        Map<String,Object> orders=new HashMap<String,Object>();

        if(StringUtils.isNotBlank(id)){
            orders.put("id",id);
        }

        if(StringUtils.isNotBlank(creationDate)){
            orders.put("creationDate",creationDate);
        }
        if(StringUtils.isNotBlank(seliverDate)){
            orders.put("seliverDate",seliverDate);
        }
        if(StringUtils.isNotBlank(isFreeShip)){
            orders.put("isFreeShip",Integer.parseInt(isFreeShip));
        }
        if(StringUtils.isNotBlank(seliverStatus)){
            orders.put("seliverStatus",Integer.parseInt(seliverStatus));
        }
        if(StringUtils.isNotBlank(isPayment)){
            orders.put("isPayment",Integer.parseInt(isPayment));
        }

        PageHelper pageHelper = new PageHelper();
        page.setSize(5);
        pageHelper.startPage(page.getCurrentpage(), page.getSize());
        List<HashMap<String, Object>> orderReports=SmbmsBillMapper.orderReportByOrders(orders);
        PageInfo pageInfo = new PageInfo(orderReports);

        PageBean pageBean=new PageBean();
        return new PageBean(page.getSize(), pageInfo.getTotal(), orderReports);
    }
    @Override
    public PageBean saleReportByOrders(String startTime, String endTime, String productInsurance, String salePeople, Page page) {
        //条件集合
        Map<String,Object> orders=new HashMap<String,Object>();

        if(StringUtils.isNotBlank(startTime)){
            orders.put("startTime",startTime);
        }

        if(StringUtils.isNotBlank(endTime)){
            orders.put("endTime",endTime);
        }

        if(StringUtils.isNotBlank(productInsurance)){
            orders.put("productInsurance",Integer.parseInt(productInsurance));
        }
        if(StringUtils.isNotBlank(salePeople)){
            orders.put("salePeople",salePeople);
        }

        PageHelper pageHelper = new PageHelper();
        page.setSize(10);
        pageHelper.startPage(page.getCurrentpage(), page.getSize());
        List<HashMap<String, Object>> saleReports=SmbmsBillMapper.saleReportByOrders(orders);
        PageInfo pageInfo = new PageInfo(saleReports);

        PageBean pageBean=new PageBean();
        return new PageBean(page.getSize(), pageInfo.getTotal(), saleReports);
    }
}
