package com.smbms.controller.buy;

import com.smbms.pojo.Buy;
import com.smbms.pojo.Provider;
import com.smbms.pojo.User;
import com.smbms.service.buy.BuyService;
import com.smbms.service.provider.ProviderService;
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
import java.util.HashMap;
import java.util.List;

@Controller
public class BuyController {
    @Resource
    BuyService bs;
    @Resource
    ProviderService ps;
    @RequestMapping("/sys/buy")
    /*
     * 全部订单界面
     */
    /************************************************中文转码*********************************************************************/
    public String buy(Model model, HttpServletRequest request) throws UnsupportedEncodingException {
        String buyName=request.getParameter("buyName");
        String pid=request.getParameter("providerId");
        String pisPayment=request.getParameter("isPayment");
        Integer providerId=null;
        Integer isPayment=null;
        if(buyName!=null){

            //productName=new String(productName.getBytes("iso-8859-1"), "utf-8");
            request.setAttribute("buyName",buyName);
        }
        if(pid != null && pid != ""){
            providerId=Integer.parseInt(pid);
            if(providerId==0){
                providerId=null;
            }
            request.setAttribute("providerId", providerId);
        }
        if(pisPayment!=null&&pisPayment!=""){
            isPayment=Integer.parseInt(pisPayment);
            if(isPayment==0){
                isPayment=null;
            }
            request.setAttribute("isPayment", isPayment);
        }
        List<HashMap<String,Object>> list=bs.findByNameIdAndIsPayment(buyName, providerId, isPayment);
        List<Provider> providerList=ps.findAllProvider();
        model.addAttribute("buyList", list);
        model.addAttribute("providerList", providerList);
        return "buy/buylist";
    }
    /*
     * 查看订单的详细信息
     */
    @RequestMapping("/sys/buyview")
    public String proviews(HttpSession session, @RequestParam String buyid){
        int id=Integer.parseInt(buyid);
        HashMap<String,Object> b=bs.findBuyById(id);
        session.setAttribute("buy", b);
        return "buy/buyview";
    }
    /*
     * 获取供应商列表
     */
    @RequestMapping("/sys/buyselect")
    @ResponseBody
    public List<Provider> buySelect(){
        List<Provider> list=ps.findAllProvider();
        return list;
    }
    /*
     * 订单修改界面
     */
    @RequestMapping("/sys/buymodify")
    public String buymodify(HttpSession session,@RequestParam String buyid){
        int id=Integer.parseInt(buyid);
        HashMap<String,Object> buy=bs.findBuyById(id);
        //System.out.println("------------------:"+buy.getProvider().getId());
        session.setAttribute("buy", buy);
        return "buy/buymodify";
    }
    /*
     * 保存订单修改信息
     */
    @RequestMapping("/sys/dobuymodify")
    public String dobuymodify(HttpServletRequest request){

        HttpSession session=request.getSession();
        User u = (User)session.getAttribute("userOnLogin");

        int id=Integer.parseInt(request.getParameter("id"));
        String buyCode=request.getParameter("buyCode");
        String productDesc = request.getParameter("productDesc");
        String productUnit = request.getParameter("productUnit");
        String productStandard = request.getParameter("productStandard");
        String productUnitPrice = request.getParameter("productUnitPrice");
        int productCount=Integer.parseInt(request.getParameter("productCount"));
        double totalPrice=Double.valueOf(request.getParameter("totalPrice"));
        SimpleDateFormat sdf =new SimpleDateFormat( "yyyy-MM-dd");
        int isPayment=Integer.parseInt(request.getParameter("isPayment"));
        int providerId=Integer.valueOf(request.getParameter("providerId"));

        Buy buy=new Buy();
        buy.setBuyCode(buyCode);
        buy.setProductDesc(productDesc);
        buy.setProductUnit(productUnit);
        buy.setProductStandard(productStandard);
        buy.setProductUnitPrice(productUnitPrice);
        buy.setProductCount(productCount);
        buy.setTotalPrice(totalPrice);
        buy.setCreateBy(u.getId().toString());
        try {
            buy.setCreationDate(sdf.parse(request.getParameter("creationDate")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        buy.setProviderId(providerId);
        buy.setIsPayment(isPayment);
        buy.setId(id);
        if(bs.buyModify(buy)){
            return "redirect:/sys/buy";
        }
        return "redirect:/sys/buymodify";
    }
    /*
     * 删除订单
     */
    @RequestMapping("/sys/buydel")
    @ResponseBody
    public HashMap<String, String> buydel(HttpServletRequest request){
        int id=Integer.valueOf(request.getParameter("buyid"));
        HashMap<String, String> map=new HashMap<String, String>();
        map.put("delResult", bs.buyDel(id));
        return map;
    }
    /*
     * 获取供应商列表
     */
    @RequestMapping("/sys/billSelect")
    @ResponseBody
    public List<Provider> billSelect(){
        List<Provider> list=ps.findAllProvider();
        return list;
    }
    /*
     * 添加商品界面
     */
    @RequestMapping("/sys/buyadd")
    public String buyAdd(){
        return "buy/buyadd";
    }
    /*
     * 添加订单信息
     */
    @RequestMapping("/sys/dobuyadd")
    public String dobuyadd(HttpServletRequest request){
        System.out.println("进入添加页面");
        String buyCode=request.getParameter("buyCode");
        String productDesc=request.getParameter("productDesc");
        String productUnit=request.getParameter("productUnit");
        String productStandard=request.getParameter("productStandard");
        String productUnitPrice=request.getParameter("productUnitPrice");
        int productCount=Integer.parseInt(request.getParameter("productCount"));
        double totalPrice=Double.valueOf(request.getParameter("totalPrice"));
        String createBy=request.getParameter("createBy");
        java.text.SimpleDateFormat sdf = new  java.text.SimpleDateFormat("yyyy-MM-dd");
        int isPayment=Integer.parseInt(request.getParameter("isPayment"));
        int providerId=Integer.valueOf(request.getParameter("providerId"));
        int productId=Integer.valueOf(request.getParameter("productId"));

        Buy buy=new Buy();
        buy.setBuyCode(buyCode);
        buy.setProductDesc(productDesc);
        buy.setProductUnit(productUnit);
        buy.setProductStandard(productStandard);
        buy.setProductUnitPrice(productUnitPrice);
        buy.setProductCount(productCount);
        buy.setTotalPrice(totalPrice);
        buy.setCreateBy(createBy);
        buy.setProductId(productId);
        try {
            buy.setCreationDate(sdf.parse(request.getParameter("creationDate")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        buy.setIsPayment(isPayment);
        buy.setProviderId(providerId);

        if(bs.buyAdd(buy)){
            return "redirect:/sys/buy";
        }else{
            return "redirect:/sys/buyadd";
        }
    }
}
