<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/head.jsp"%>

<div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>购进管理页面 >> 购进修改页面</span>
        </div>
        <div class="providerAdd">
          <form id="buyForm" name="buyForm" method="post" action="${pageContext.request.contextPath }/sys/dobuymodify">
				<input type="hidden" name="id" value="${buy.id }">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div class="">
                    <label for="billCode">订单编码：</label>
                    <input type="text" name="buyCode" id="billCode" value="${buy.buyCode }" readonly="readonly">
                </div>
                <div>
                    <label for="buyName">商品名称：</label>
                    <input type="text" name="buyName" id="buyName" value="${buy.buyName }">
					<font color="red"></font>
                </div>
                  <div>
                      <label for="productDesc">商品备注：</label>
                      <input type="text" name="productDesc" id="productDesc" value="${buy.productDesc }">
                      <font color="red"></font>
                  </div>
                  <div>
                      <label for="productUnit">商品单位：</label>
                      <input type="text" name="productUnit" id="productUnit" value="${buy.productUnit }">
                      <font color="red"></font>
                  </div>
                  <div>
                      <label for="productStandard">商品规格：</label>
                      <input type="text" name="productStandard" id="productStandard" value="${buy.productStandard }">
                      <font color="red"></font>
                  </div>
                  <div>
                      <label for="productUnitPrice">商品单价：</label>
                      <input type="text" name="productUnitPrice" id="productUnitPrice" value="${buy.productUnitPrice }">
                      <font color="red"></font>
                  </div>
                <div>
                    <label for="productCount">商品数量：</label>
                    <input type="text" name="productCount" id="productCount" value="${buy.productCount }">
					<font color="red"></font>
                </div>
                <div>
                    <label for="totalPrice">总金额：</label>
                    <input type="text" name="totalPrice" id="totalPrice" value="${buy.totalPrice }">
					<font color="red"></font>
                </div>
              <div>
                  <label for="createBy">购进人：</label>
                  <input type="text" name="createBy" id="createBy" value="${buy.createBy }">
                  <font color="red"></font>
              </div>
              <div>
                  <label for="data">购进日期：</label>
                   <input type="text" Class="Wdate" id="creationDate" name="creationDate" value=<fmt:formatDate value="${buy.creationDate}" pattern="yyyy-MM-dd"/>
                    readonly="readonly" onclick="WdatePicker();">
                  <span><fmt:formatDate value="${buy.creationDate}" pattern="yyyy-MM-dd"/></span>
                  <font color="red"></font>
              </div>
                <div>
                    <label for="providerId">供应商：</label>
                    <input type="hidden" value="${buy.providerId}" id="pid" />
					<select name="providerId" id="providerId">
		        	</select>
					<font color="red"></font>
                </div>
                <div>
                    <label >是否付款：</label>
                    <c:if test="${buy.isPayment == 1 }">
						<input type="radio" name="isPayment" value="1" checked="checked">未付款
						<input type="radio" name="isPayment" value="2" >已付款
					</c:if>
					<c:if test="${buy.isPayment == 2 }">
						<input type="radio" name="isPayment" value="1">未付款
						<input type="radio" name="isPayment" value="2" checked="checked">已付款
					</c:if>
                </div>
                <div class="providerAddBtn">
                  <input type="button" name="save" id="save" value="保存">
				  <input type="button" id="back" name="back" value="返回" >
              	</div>
            </form>
        </div>

    </div>
</section>

<%@include file="/WEB-INF/jsp/common/foot.jsp" %>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/buymodify.js"></script>