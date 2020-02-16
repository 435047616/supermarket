<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/head.jsp"%>
<div class="right">
     <div class="location">
         <strong>你现在所在的位置是:</strong>
         <span>购进管理页面 >> 信息查看</span>
     </div>
     <div class="providerView">
         <p><strong>订单编号：</strong><span>${buy.buyCode }</span></p>
         <p><strong>商品名称：</strong><span>${buy.buyName }</span></p>
         <p><strong>商品备注：</strong><span>${buy.productDesc }</span></p>
         <p><strong>商品单位：</strong><span>${buy.productUnit }</span></p>
         <p><strong>商品规格：</strong><span>${buy.productStandard }</span></p>
         <p><strong>商品单价：</strong><span>${buy.productUnitPrice }</span></p>
         <p><strong>商品数量：</strong><span>${buy.productCount }</span></p>
         <p><strong>总金额：</strong><span>${buy.totalPrice }</span></p>

         <p><strong>购进人：</strong><span>${buy.createBy }</span></p>
         <p><strong>购进日期：</strong><span><fmt:formatDate value="${buy.creationDate}" pattern="yyyy-MM-dd"/></span></p>
         <p><strong>供应商：</strong><span>${buy.provider.proName }</span></p>
         <p><strong>是否付款：</strong>
             <span>
         		<c:if test="${buy.isPayment == 1}">未付款</c:if>
				<c:if test="${buy.isPayment == 2}">已付款</c:if>
			</span>

		<div class="providerAddBtn">
         	<input type="button" id="back" name="back" value="返回" >
        </div>
     </div>
 </div>
</section>
<%@include file="/WEB-INF/jsp/common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/billview.js"></script>