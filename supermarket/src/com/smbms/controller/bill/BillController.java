package com.smbms.controller.bill;

import com.smbms.pojo.*;
import com.smbms.service.bill.BillService;
import com.smbms.service.buy.BuyService;
import com.smbms.service.provider.ProviderService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;


@Controller
public class BillController {
	@Resource
	BillService bs;
    @Resource
    ProviderService ps;
    @Resource
    BuyService buyService;
	@RequestMapping("/sys/bill")
	/*
	 * 全部订单界面
	 */
	/************************************************中文转码*********************************************************************/
	public String bill(Model model,HttpServletRequest request) throws UnsupportedEncodingException{
		String productCode=request.getParameter("productCode");
		String pisPayment=request.getParameter("isPayment");
		Integer isPayment=null;
		if(productCode!=null){

			request.setAttribute("productCode",productCode);
		}

		if(pisPayment!=null&&pisPayment!=""){
			isPayment=Integer.parseInt(pisPayment);
			if(isPayment==0){
				isPayment=null;
			}
			request.setAttribute("isPayment", isPayment);
		}


        Page page=new Page();
        String Page=request.getParameter("currentPage");
        int currentPage=0;
        if(Page!=null){
            currentPage=Integer.parseInt(Page);
        }
        else{
            currentPage=1;
        }
        page.setCurrentpage(currentPage);
        request.setAttribute("currentPage",currentPage);



        //权限控制，销售人员只能看到自己创建的订单
        User user= (User) request.getSession().getAttribute("userOnLogin");
        Integer id = null;
        if(user!=null){
            int role=user.getUserRole();
            if(role==2){
                id=user.getId();
            }
        }
		List<Bill> list=bs.findByNameIdAndIsPayment(productCode, isPayment,id,page);
        request.setAttribute("totalPage",page.getTotalPage());
        request.setAttribute("totalCount", page.getTotalCount());
		model.addAttribute("billList", list);
		return "bill/billlist";
	}
	/*
	 * 查看订单的详细信息
	 */
	@RequestMapping("/sys/billview")
	public String proview(HttpSession session,@RequestParam String billid){
		int id=Integer.parseInt(billid);
		Bill b=bs.findBillById(id);
		session.setAttribute("bill", b);
		return "bill/billview";
	}
	/*
	 * 获取商品列表
	 */
	@RequestMapping("/sys/buySelect")
	@ResponseBody
	public List<Buy> buyselect(){
		List<Buy> list=buyService.findAddBuy();
		return list;
	}
    /*
     * 获取供应商列表
     */
    @RequestMapping("/sys/billselect")
    @ResponseBody
    public List<Provider> billSelect(){
        List<Provider> list=ps.findAllProvider();
        return list;
    }

	/*
	 * 订单修改界面
	 */
	@RequestMapping("/sys/billmodify")
	public String billmodify(HttpSession session,@RequestParam String billid){
		int id=Integer.parseInt(billid);
		Bill bill=bs.findBillById(id);
		session.setAttribute("bill", bill);
		return "bill/billmodify";
	}
	/*
	 * 保存订单修改信息
	 */
	@RequestMapping("/sys/dobillmodify")
	public String dobillmodify(HttpServletRequest request){
		int id=Integer.parseInt(request.getParameter("id"));
        String billCode=request.getParameter("billCode");
        String productCode=request.getParameter("productCode");
        double productInsurance=Integer.parseInt(request.getParameter("productInsurance"));
        String productDesc=request.getParameter("productDesc");
		String productUnit=request.getParameter("productUnit");
		int productCount=Integer.parseInt(request.getParameter("productCount"));
		double totalPrice=Double.valueOf(request.getParameter("totalPrice"));

        String customerName=request.getParameter("customerName");
        String customerAddress=request.getParameter("customerAddress");
        String customerTel=request.getParameter("customerTel");
        String dockPeople=request.getParameter("dockPeople");
        String saleDock=request.getParameter("saleDock");
        int payWay=Integer.parseInt(request.getParameter("payWay"));
        String transactionNum=request.getParameter("transactionNum");
        int payNum=Integer.parseInt(request.getParameter("payNum"));
        int isFreeShip=Integer.parseInt(request.getParameter("isFreeShip"));
        String myFreight=request.getParameter("myFreight");
        int seliverStatus=Integer.parseInt(request.getParameter("seliverStatus"));
        int isPayment=Integer.parseInt(request.getParameter("isPayment"));
        String waybill=request.getParameter("waybill");
        SimpleDateFormat sdf =new SimpleDateFormat( "yyyy-MM-dd");
        String remark=request.getParameter("remark");


		Bill bill=new Bill();
		bill.setBillCode(billCode);
		bill.setProductCode(productCode);
        bill.setProductInsurance(productInsurance);
        bill.setProductDesc(productDesc);
		bill.setProductUnit(productUnit);
		bill.setProductCount(productCount);
		bill.setTotalPrice(totalPrice);
        bill.setCustomerName(customerName);
        bill.setCustomerAddress(customerAddress);
        bill.setCustomerTel(customerTel);
        bill.setDockPeople(dockPeople);
        bill.setSaleDock(saleDock);
        bill.setPayWay(payWay);
        bill.setTransactionNum(transactionNum);
        bill.setPayNum(payNum);
        bill.setIsFreeShip(isFreeShip);
        bill.setMyFreight(myFreight);
        bill.setSeliverStatus(seliverStatus);
        bill.setRemark(remark);

		bill.setIsPayment(isPayment);
		bill.setWaybill(waybill);
        try {
            bill.setSeliverDate(sdf.parse(request.getParameter("seliverDate")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
		bill.setId(id);
		if(bs.billModify(bill)){
			return "redirect:/sys/bill";
		}
		return "redirect:/sys/billmodify";
	}
	/*
	 * 删除订单
	 */
	@RequestMapping("/sys/billdel")
	@ResponseBody
	public HashMap<String, String> billdel(HttpServletRequest request){
		int id=Integer.valueOf(request.getParameter("billid"));
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("delResult", bs.billDel(id));
		return map;
	}
	/*
	 * 添加订单界面
	 */
	@RequestMapping("/sys/billadd")
	public String billAdd(){
		return "bill/billadd";
	}
	/*
	 * 保存添加订单信息
	 */
	@RequestMapping("/sys/dobilladd")
	public String dobilladd(HttpServletRequest request){
        HttpSession session=request.getSession();
        User u = (User)session.getAttribute("userOnLogin");

		String billCode=request.getParameter("billCode");
        String productCode=request.getParameter("productCode");
        double productInsurance=Double.parseDouble(request.getParameter("productInsurance"));
        String productDesc=request.getParameter("productDesc");
		String productUnit=request.getParameter("productUnit");
		int productCount=Integer.parseInt(request.getParameter("productCount"));
		double totalPrice=Double.valueOf(request.getParameter("totalPrice"));

        String customerName=request.getParameter("customerName");
        String customerAddress=request.getParameter("customerAddress");
        String customerTel=request.getParameter("customerTel");
        String dockPeople=request.getParameter("dockPeople");
        String saleDock=request.getParameter("saleDock");
        int payWay=Integer.parseInt(request.getParameter("payWay"));
        String transactionNum=request.getParameter("transactionNum");
        int payNum=Integer.parseInt(request.getParameter("payNum"));
        int isFreeShip=Integer.parseInt(request.getParameter("isFreeShip"));
        String myFreight=request.getParameter("myFreight");
        int seliverStatus=Integer.parseInt(request.getParameter("seliverStatus"));
        int isPayment=Integer.parseInt(request.getParameter("isPayment"));
        String waybill=request.getParameter("waybill");
        SimpleDateFormat sdf =new SimpleDateFormat( "yyyy-MM-dd");
        Date seliverDate= null;
        try {
            seliverDate = sdf.parse(request.getParameter("seliverDate"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String remark=request.getParameter("remark");

		Bill bill=new Bill();
		bill.setBillCode(billCode);
		bill.setProductCode(productCode);
        bill.setProductInsurance(productInsurance);
        bill.setProductDesc(productDesc);
		bill.setProductUnit(productUnit);
		bill.setProductCount(productCount);
		bill.setTotalPrice(totalPrice);

        bill.setCustomerName(customerName);
        bill.setCustomerAddress(customerAddress);
        bill.setCustomerTel(customerTel);
        bill.setDockPeople(dockPeople);
        bill.setSaleDock(saleDock);
        bill.setPayWay(payWay);
        bill.setTransactionNum(transactionNum);
        bill.setPayNum(payNum);
        bill.setIsFreeShip(isFreeShip);
        bill.setMyFreight(myFreight);
        bill.setSeliverStatus(seliverStatus);
        bill.setRemark(remark);
        bill.setCreatedBy(u.getId());

        try {
            bill.setCreationDate(sdf.parse(sdf.format(new Date())));
            bill.setSeliverDate(seliverDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

		bill.setIsPayment(isPayment);
		bill.setWaybill(waybill);

		if(bs.billAdd(bill)){
			return "redirect:/sys/bill";
		}else{
			return "redirect:/sys/billadd";
		}
	}
    /**
     * 乐荐系统 远程接口增加订单
     * @param request
     * @return
     */
    @ResponseBody
    @RequestMapping("/sys/billadd/lejian")
    public MyResponseBody billAddFromLejian (HttpServletRequest request){
        String bills=request.getParameter("bills");
        if(StringUtils.isBlank(bills)){
            return new MyResponseBody("001","操作失败，参数缺失",false);
        }

        MyResponseBody  myResponseBody=bs.billAddFromLejian(bills);
        return myResponseBody;
    }
}
