package com.smbms.service.bill;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.smbms.dao.bill.BillMapper;
import com.smbms.dao.bill.SmbmsBillMapper;
import com.smbms.pojo.Bill;
import com.smbms.pojo.MyResponseBody;
import com.smbms.pojo.Page;
import com.smbms.pojo.PageBean;
import net.sf.json.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
@Transactional
public class BillServiceImpl implements BillService {
	@Resource
	BillMapper bm;
    @Resource
    SmbmsBillMapper smbmsBillMapper;

	@Override
	public List<Bill> findAddBill() {
		// TODO Auto-generated method stub
		
		return bm.findAllBill();
	}
	@Override
	public Bill findBillById(int id) {
		// TODO Auto-generated method stub
		return bm.findBillById(id);
	}
	@Override
	public boolean billAdd(Bill b) {
		// TODO Auto-generated method stub
		if(bm.billAdd(b)>0){
			return true;
		}
		return false;
	}
	@Override
	public boolean billModify(Bill b) {
		// TODO Auto-generated method stub
		if(bm.billModify(b)>0){
			return true;
		}
		return false;
	}
	@Override
	public String billDel(int id) {
		// TODO Auto-generated method stub
		if(bm.findBillById(id)!=null){
			if(bm.billDel(id)>0){
				return "true";
			}else{
				return "false";
			}
		}
		return "notexist";
	}
	@Override
	public List<Bill> findByNameIdAndIsPayment(String productCode,
			 Integer isPayment,Integer userId,Page page) {
		// TODO Auto-generated method stub
        page.setSize(8);
        page.setTotalCount(bm.findAllCount(productCode,isPayment,userId));
		return bm.findByNameIdAndIsPayment(productCode, isPayment,userId,(page.getCurrentpage()-1)*page.getSize(), page.getSize());
	}
    @Override
    public MyResponseBody billAddFromLejian(String bills) {
        MyResponseBody myResponseBody = new MyResponseBody();
        try {
            JSONObject jsonObject = JSONObject.fromObject(bills);

            //创建日期字符串 转date处理
            if (jsonObject.get("creationDate") != null) {
                String creationDate = (String) jsonObject.get("creationDate");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = null;
                try {
                    date = sdf.parse(creationDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                jsonObject.put("creationDate", date);
            }
            Bill bill = (Bill) JSONObject.toBean(jsonObject, Bill.class);

            StringBuffer buffer = new StringBuffer();
            boolean isVaild = true;
            //订单在乐荐系统中的id
            //参数校验
            if (StringUtils.isBlank(bill.getLejianBillId())) {
                isVaild = false;
                buffer.append("订单id为空;");
            }
            //账单编码目前拿不到
//       if(StringUtils.isBlank(bill.getBillCode())){
//          isVaild=false;
//          buffer.append("账单编码为空;");
//       }
            if (bill.getProductInsurance() <= 0) {
                buffer.append("单价为空;");
                isVaild = false;
            }
            if (StringUtils.isBlank(bill.getProductUnit())) {
                buffer.append("商品单位为空;");
                isVaild = false;
            }
            if (bill.getProductCount() <= 0) {
                isVaild = false;
                buffer.append("商品数量为空;");
            }
            if (bill.getTotalPrice() <= 0) {
                isVaild = false;
                buffer.append("总金额为空;");
            }
            if (bill.getPayWay() <= 0) {
                buffer.append("支付方式为空;");
                isVaild = false;
            }
            if (bill.getIsFreeShip() <= 0) {
                buffer.append("是否包邮为空;");
                isVaild = false;
            }
            if (bill.getSeliverStatus() <= 0) {
                buffer.append("发货状态为空;");
                isVaild = false;
            }
            if (bill.getIsPayment() <= 0) {
                buffer.append("支付状态为空;");
                isVaild = false;
            }
            if (StringUtils.isBlank(bill.getLejianBillId())) {
                isVaild = false;
            }
            if (!isVaild) {
                //若非法，进行错误信息提示
                String message = buffer.toString();
                myResponseBody.setMessage("参数非法，详细情况:" + message);
                myResponseBody.setOperation(false);
                myResponseBody.setStatus("001");
            }
            if (isVaild) {
                //参数校验通过，进行入库操作
                smbmsBillMapper.insert(bill);
                myResponseBody.setOperation(true);
                myResponseBody.setStatus("004");
                myResponseBody.setMessage("操作成功");
            }
        } catch (Exception exc) {
            myResponseBody.setOperation(false);
            myResponseBody.setStatus("003");
            myResponseBody.setMessage("操作失败，服务器异常");
        }
        return myResponseBody;
    }

    @Override
    public PageBean findAllBillsByOrders(Map<String, Object> params, Page page) {

        PageHelper pageHelper = new PageHelper();
        page.setSize(5);
        pageHelper.startPage(page.getCurrentpage(), page.getSize());
        List<HashMap<String, Object>> orderReports=smbmsBillMapper.findAllBillsByOrders(params);
        PageInfo pageInfo = new PageInfo(orderReports);

        return new PageBean(page.getSize(), pageInfo.getTotal(), orderReports);
    }
}
