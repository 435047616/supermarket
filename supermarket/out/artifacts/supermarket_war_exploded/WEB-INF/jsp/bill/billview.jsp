<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/head.jsp"%>
<div class="right">
     <div class="location">
         <strong>你现在所在的位置是:</strong>
         <span>订单管理页面 >> 信息查看</span>
     </div>
     <div class="providerView">
         <p><strong>订单编号：</strong><span>${bill.billCode }</span></p>
         <p><strong>商品编码：</strong><span>${bill.productCode }</span></p>
         <p><strong>商品单位：</strong><span>${bill.productUnit }</span></p>
         <p><strong>商品数量：</strong><span>${bill.productCount }</span></p>
         <p><strong>总金额：</strong><span>${bill.totalPrice }</span></p>

         <p><strong>客户名称：</strong><span>${bill.customerName }</span></p>
         <p><strong>客户地址：</strong><span>${bill.customerAddress }</span></p>
         <p><strong>联系方式：</strong><span>${bill.customerTel }</span></p>
         <p><strong>对接人：</strong><span>${bill.dockPeople }</span></p>
         <p><strong>销售对接人：</strong><span>${bill.saleDock }</span></p>
         <p><strong>付款方式：</strong>
             <span>
                 <c:if test="${bill.payWay == 1}">支付宝</c:if>
				 <c:if test="${bill.payWay == 2}">微信</c:if>
                 <c:if test="${bill.payWay == 3}">银行转账</c:if>
                 <c:if test="${bill.payWay == 4}">赠送</c:if>
                 <c:if test="${bill.payWay == 5}">员工福利</c:if>
                 <c:if test="${bill.payWay == 6}">其他</c:if>
             </span>
         </p>
         <p><strong>交易单号/对方户名：</strong><span>${bill.transactionNum }</span></p>
         <p><strong>付款金额：</strong><span>${bill.payNum }</span></p>
         <p><strong>是否包邮：</strong>
             <span>
                  <c:if test="${bill.isFreeShip == 1}">不包邮</c:if>
                  <c:if test="${bill.isFreeShip == 2}">包邮</c:if>
             </span>
         </p>
         <p><strong>我方运费：</strong><span>${bill.myFreight }</span></p>
         <p><strong>发货状态：</strong>
             <span>
                  <c:if test="${bill.seliverStatus == 1}">已发货</c:if>
                  <c:if test="${bill.seliverStatus == 2}">未发货</c:if>
             </span>
         </p>
         <p><strong>支付状态：</strong>
             <span>
         		<c:if test="${bill.isPayment == 1}">未付款</c:if>
				<c:if test="${bill.isPayment == 2}">已付款</c:if>
                <c:if test="${bill.isPayment == 3}">已退款</c:if>
                <c:if test="${bill.isPayment == 4}">赠送</c:if>
                <c:if test="${bill.isPayment == 5}">员工福利</c:if>
			</span>
         </p>
         <p><strong>备注：</strong><span>${bill.remark }</span></p>
         <p><strong>创建者：</strong><span>${bill.createdBy }</span></p>
         <p><strong>运单号：</strong><span>${bill.waybill }</span></p>
         <p><strong>发货日期：</strong><span><fmt:formatDate value="${bill.seliverDate}" pattern="yyyy-MM-dd"/></span></p>
         <p><strong>创建时间：</strong><span><fmt:formatDate value="${bill.creationDate}" pattern="yyyy-MM-dd"/></span></p>

		<div class="providerAddBtn">
         	<input type="button" id="back" name="back" value="返回" >
        </div>
     </div>
 </div>
</section>
<%@include file="/WEB-INF/jsp/common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/billview.js"></script>