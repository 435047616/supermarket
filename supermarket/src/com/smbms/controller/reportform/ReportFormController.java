/**
 * Copyright (C), 2015-2020, XXX有限公司
 * FileName: ReportFormController
 * Author:   Administrator
 * Date:     2020/2/12 8:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.smbms.controller.reportform;

import com.smbms.pojo.Page;
import com.smbms.pojo.PageBean;
import com.smbms.service.reportform.FinanceReportService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2020/2/12
 * @since 1.0.0
 */
@Controller
@RequestMapping("report")
public class ReportFormController {


    @Resource
    FinanceReportService financeReportService;

    /**
     * 财务统计报表
     */
    @RequestMapping("financeReport")
    public String financeReport(Model model, HttpServletRequest request) throws UnsupportedEncodingException{

        String startTime=request.getParameter("startTime");
        String endTime=request.getParameter("endTime");
        String productInsurance=request.getParameter("productInsurance");

        Page page=new Page();
        String Page=request.getParameter("currentPage");
        int currentPage=0;
        if(Page!=null){
            currentPage=Integer.parseInt(Page);
        }
        else{
            currentPage=1;
        }
//        int currentPage=1;
        page.setCurrentpage(currentPage);
        PageBean pageBean=financeReportService.financeReportByOrders(startTime,endTime,productInsurance,page);


        request.setAttribute("currentPage",currentPage);
        request.setAttribute("totalPage",pageBean.getTotalPage());
        request.setAttribute("totalCount", pageBean.getTotalSize());

        request.setAttribute("startTime",startTime);
        request.setAttribute("endTime",endTime);
        request.setAttribute("productInsurance", productInsurance);


        model.addAttribute("financeReport",pageBean.getList());
//        model.addAttribute("queryProCode", orderId);
//        model.addAttribute("queryProName", productName);

        return "reportform/financeReport";
    }
    /**
     * 订单统计报表
     */
    @RequestMapping("orderReport")
    public String orderReport(Model model, HttpServletRequest request) throws UnsupportedEncodingException{

        String id=request.getParameter("id");
        String creationDate=request.getParameter("creationDate");
        String seliverDate=request.getParameter("seliverDate");
        String isFreeShip=request.getParameter("isFreeShip");
        String seliverStatus=request.getParameter("seliverStatus");
        String isPayment=request.getParameter("isPayment");

        Page page=new Page();
        String Page=request.getParameter("currentPage");
        int currentPage=0;
        if(Page!=null){
            currentPage=Integer.parseInt(Page);
        }
        else{
            currentPage=1;
        }
//        int currentPage=1;
        page.setCurrentpage(currentPage);
        PageBean pageBean=financeReportService.orderReport(id,creationDate,seliverDate,isFreeShip,seliverStatus,isPayment,page);


        request.setAttribute("currentPage",currentPage);
        request.setAttribute("totalPage",pageBean.getTotalPage());
        request.setAttribute("totalCount", pageBean.getTotalSize());

        request.setAttribute("id",id);
        request.setAttribute("creationDate", creationDate);
        request.setAttribute("seliverDate", seliverDate);
        request.setAttribute("isFreeShip", isFreeShip);
        request.setAttribute("seliverStatus", seliverStatus);
        request.setAttribute("isPayment", isPayment);


        model.addAttribute("financeReport",pageBean.getList());
//        model.addAttribute("queryProCode", orderId);
//        model.addAttribute("queryProName", productName);

        return "reportform/orderReport";
    }
    /**
     * 销售统计报表
     */
    @RequestMapping("saleReport")
    public String saleReport(Model model, HttpServletRequest request) throws UnsupportedEncodingException{

        String startTime=request.getParameter("startTime");
        String endTime=request.getParameter("endTime");
        String productInsurance=request.getParameter("productInsurance");
        String salePeople=request.getParameter("salePeople");
        Page page=new Page();
        String Page=request.getParameter("currentPage");
        int currentPage=0;
        if(Page!=null){
            currentPage=Integer.parseInt(Page);
        }
        else{
            currentPage=1;
        }
//        int currentPage=1;
        page.setCurrentpage(currentPage);
        PageBean pageBean=financeReportService.saleReportByOrders(startTime,endTime,productInsurance,salePeople,page);


        request.setAttribute("currentPage",currentPage);
        request.setAttribute("totalPage",pageBean.getTotalPage());
        request.setAttribute("totalCount", pageBean.getTotalSize());

        request.setAttribute("startTime",startTime);
        request.setAttribute("endTime",endTime);
        request.setAttribute("productInsurance", productInsurance);
        request.setAttribute("salePeople", salePeople);


        model.addAttribute("saleReport",pageBean.getList());
//        model.addAttribute("queryProCode", orderId);
//        model.addAttribute("queryProName", productName);

        return "reportform/saleReport";
    }
}
