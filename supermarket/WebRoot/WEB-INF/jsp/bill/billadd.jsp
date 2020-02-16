<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/head.jsp"%>

<div class="right">
     <div class="location">
         <strong>你现在所在的位置是:</strong>
         <span>订单管理页面 >> 订单添加页面</span>
     </div>
     <div class="providerAdd">
         <form id="billForm" name="billForm" method="post" action="${path}/sys/dobilladd">
             <!--div的class 为error是验证错误，ok是验证成功-->
             <input type="hidden" name="method" value="add">
             <div class="">
                 <label for="billCode">订单编码：</label>
                 <input type="text" name="billCode" class="text" id="billCode" readonly="readonly" value="">
				 <!-- 放置提示信息 -->
				 <font color="red"></font>
             </div>
             <div>
                 <label for="productCode">商品名称：</label>
                 <select name="productCode" id="productCode">
                 </select>
				 <font color="red"></font>
             </div>
             <div>
                 <label for="productInsurance">商品单价：</label>
                 <input type="text" name="productInsurance" id="productInsurance">
                 <font color="red"></font>
                 <%--<select name="productInsurance" id="productInsurance">
                     <option value="900" selected="selected">不含保险900</option>
                     <option value="1100">含保险1100</option>
                 </select>--%>
             </div>
             <div>
                 <label for="productDesc">商品描述：</label>
                 <input type="text" name="productDesc" id="productDesc" value="">
                 <font color="red"></font>
             </div>
             <div>
                 <label for="productUnit">商品单位：</label>
                 <input type="text" name="productUnit" id="productUnit" value=""> 
				 <font color="red"></font>
             </div>
             <div>
                 <label for="productCount">商品数量：</label>
                 <input type="text" name="productCount" id="productCount" value=""> 
				 <font color="red"></font>
             </div>
             <div>
                 <label for="totalPrice">总金额：</label>
                 <input type="text" name="totalPrice" id="totalPrice" value="" readonly="readonly">
				 <font color="red"></font>
             </div>

             <div>
                 <label for="customerName">客户名称：</label>
                 <input type="text" name="customerName" id="customerName" value="">
                 <font color="red"></font>
             </div>
             <div>
                 <label for="customerAddress">客户地址：</label>
                 <input type="text" name="customerAddress" id="customerAddress" value="">
                 <font color="red"></font>
             </div>
             <div>
                 <label for="customerTel">联系方式：</label>
                 <input type="text" name="customerTel" id="customerTel" value="">
                 <font color="red"></font>
             </div>
             <div>
                 <label for="dockPeople">对接人：</label>
                 <input type="text" name="dockPeople" id="dockPeople" value="">
                 <font color="red"></font>
             </div>
             <div>
                 <label for="saleDock">销售对接人：</label>
                 <input type="text" name="saleDock" id="saleDock" value="">
                 <font color="red"></font>
             </div>
             <div>
                 <label for="payWay">付款方式：</label>
                 <select name="payWay" id="payWay">
                     <option value="1" selected="selected">支付宝</option>
                     <option value="2">微信</option>
                     <option value="3">银行转账</option>
                     <option value="4">赠送</option>
                     <option value="5">员工福利</option>
                     <option value="6">其他</option>
                 </select>
             </div>
             <div>
                 <label for="transactionNum">交易单号/对方户名：</label>
                 <input type="text" name="transactionNum" id="transactionNum" value="">
                 <font color="red"></font>
             </div>
             <div>
                 <label for="payNum">付款金额：</label>
                 <input type="text" name="payNum" id="payNum" value="">
                 <font color="red"></font>
             </div>
             <div>
                 <label for="isFreeShip">是否包邮：</label>
                 <select name="isFreeShip" id="isFreeShip">
                     <option value="1" selected="selected">不包邮</option>
                     <option value="2">包邮</option>
                 </select>
             </div>
             <div>
                 <label for="myFreight">我方运费：</label>
                 <input type="text" name="myFreight" id="myFreight" value="">
                 <font color="red"></font>
             </div>
             <div>
                 <label for="seliverStatus">发货状态：</label>
                 <select name="seliverStatus" id="seliverStatus">
                     <option value="1" selected="selected">已发货</option>
                     <option value="2">未发货</option>
                 </select>
             </div>
             <div>
                 <label >支付状态：</label>
                 <input type="radio" name="isPayment" value="1" checked="checked">待付款
                 <input type="radio" name="isPayment" value="2" >已付款
                 <input type="radio" name="isPayment" value="3" >已退款
                 <input type="radio" name="isPayment" value="4" >赠送
                 <input type="radio" name="isPayment" value="5" >员工福利
             </div>
             <div>
                 <label for="waybill">运单号：</label>
                 <input type="text" name="waybill" id="waybill" value="">
                 <font color="red"></font>
             </div>
             <div>
                 <label for="seliverDate">发货日期：</label>
                 <input type="text" Class="Wdate" id="seliverDate" name="seliverDate" readonly="readonly" onclick="WdatePicker();">
                 <font color="red"></font>
             </div>
             <div>
                 <label for="remark">备注：</label>
                 <input type="text" name="remark" id="remark" value="">
                 <font color="red"></font>
             </div>
             <div>
                 <label for="createdBy">创建者：</label>
                 <input type="text" name="createdBy" id="createdBy" value="${userOnLogin.userName }">
                 <font color="red"></font>
             </div>

             <div class="providerAddBtn">
                  <input type="button" name="add" id="add" value="保存">
				  <input type="button" id="back" name="back" value="返回" >
             </div>
         </form>
     </div>
 </div>
</section>
<%@include file="/WEB-INF/jsp/common/foot.jsp" %>
<script type="text/javascript" src="${path}/statics/js/billadd.js"></script>
