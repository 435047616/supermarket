<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/head.jsp"%>

<div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>订单管理页面 >> 订单修改页面</span>
        </div>
        <div class="providerAdd">
          <form id="billForm" name="billForm" method="post" action="${pageContext.request.contextPath }/sys/dobillmodify">
				<input type="hidden" name="id" value="${bill.id }">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div class="">
                    <label for="billCode">订单编码：</label>
                    <input type="text" name="billCode" id="billCode" value="${bill.billCode }" readonly="readonly"> 
                </div>
                <div>
                    <label for="productCode">商品编码：</label>
                    <input type="text" name="productCode" id="productCode" value="${bill.productCode }">
                    <font color="red"></font>
                </div>
              <div>
                  <label for="productInsurance">商品单价：</label>
                  <input type="text" name="productInsurance" id="productInsurance" value="${bill.productInsurance }">
                  <font color="red"></font>
              </div>
              <div>
                  <label for="productDesc">商品描述：</label>
                  <input type="text" name="productDesc" id="productDesc" value="${bill.productDesc }">
                  <font color="red"></font>
              </div>
                <div>
                    <label for="productUnit">商品单位：</label>
                    <input type="text" name="productUnit" id="productUnit" value="${bill.productUnit }"> 
					<font color="red"></font>
                </div>
                <div>
                    <label for="productCount">商品数量：</label>
                    <input type="text" name="productCount" id="productCount" value="${bill.productCount }"> 
					<font color="red"></font>
                </div>
                <div>
                    <label for="totalPrice">总金额：</label>
                    <input type="text" name="totalPrice" id="totalPrice" value="${bill.totalPrice }"> 
					<font color="red"></font>
                </div>

                <div>
                  <label for="customerName">客户名称：</label>
                  <input type="text" name="customerName" id="customerName" value="${bill.customerName }">
                  <font color="red"></font>
                </div>
                 <div>
                  <label for="customerAddress">客户地址：</label>
                  <input type="text" name="customerAddress" id="customerAddress" value="${bill.customerAddress }">
                  <font color="red"></font>
                </div>
                <div>
                  <label for="customerTel">联系方式：</label>
                  <input type="text" name="customerTel" id="customerTel" value="${bill.customerTel }">
                  <font color="red"></font>
                 </div>
                 <div>
                  <label for="dockPeople">对接人：</label>
                  <input type="text" name="dockPeople" id="dockPeople" value="${bill.dockPeople }">
                  <font color="red"></font>
                 </div>
                 <div>
                  <label for="saleDock">销售对接人：</label>
                  <input type="text" name="saleDock" id="saleDock" value="${bill.saleDock }">
                  <font color="red"></font>
                 </div>
                  <div>
                      <label for="payWay">付款方式：</label>
                      <select name="payWay" id="payWay">
                          <c:choose>
                              <c:when test="${bill.payWay == 1 }">
                                  <option value="1" selected="selected">支付宝</option>
                                  <option value="2">微信</option>
                                  <option value="3">银行转账</option>
                                  <option value="4">赠送</option>
                                  <option value="5">员工福利</option>
                                  <option value="6">其他</option>
                              </c:when>
                              <c:when test="${bill.payWay == 2 }">
                                  <option value="1" >支付宝</option>
                                  <option value="2" selected="selected">微信</option>
                                  <option value="3">银行转账</option>
                                  <option value="4">赠送</option>
                                  <option value="5">员工福利</option>
                                  <option value="6">其他</option>
                              </c:when>
                              <c:when test="${bill.payWay == 3 }">
                                  <option value="1">支付宝</option>
                                  <option value="2">微信</option>
                                  <option value="3" selected="selected">银行转账</option>
                                  <option value="4">赠送</option>
                                  <option value="5">员工福利</option>
                                  <option value="6">其他</option>
                              </c:when>
                              <c:when test="${bill.payWay == 4 }">
                                  <option value="1" >支付宝</option>
                                  <option value="2">微信</option>
                                  <option value="3">银行转账</option>
                                  <option value="4" selected="selected">赠送</option>
                                  <option value="5">员工福利</option>
                                  <option value="6">其他</option>
                              </c:when>
                              <c:when test="${bill.payWay == 5 }">
                                  <option value="1" >支付宝</option>
                                  <option value="2">微信</option>
                                  <option value="3">银行转账</option>
                                  <option value="4" >赠送</option>
                                  <option value="5" selected="selected">员工福利</option>
                                  <option value="6">其他</option>
                              </c:when>
                              <c:otherwise>
                                  <option value="1" >支付宝</option>
                                  <option value="2">微信</option>
                                  <option value="3">银行转账</option>
                                  <option value="4">赠送</option>
                                  <option value="5">员工福利</option>
                                  <option value="6" selected="selected">其他</option>
                              </c:otherwise>
                          </c:choose>
                      </select>
                      <font color="red"></font>
                  </div>
                 <div>
                  <label for="transactionNum">交易单号/对方户名：</label>
                  <input type="text" name="transactionNum" id="transactionNum" value="${bill.transactionNum }">
                  <font color="red"></font>
                </div>
                <div>
                  <label for="payNum">付款金额：</label>
                  <input type="text" name="payNum" id="payNum" value="${bill.payNum }">
                  <font color="red"></font>
                </div>
                <div>
                  <label for="isFreeShip">是否包邮：</label>
                    <select name="isFreeShip" id="isFreeShip">
                        <c:choose>
                            <c:when test="${bill.isFreeShip == 1 }">
                                <option value="1" selected="selected">不包邮</option>
                                <option value="2">包邮</option>
                            </c:when>
                            <c:otherwise>
                                <option value="1">不包邮</option>
                                <option value="2" selected="selected">包邮</option>
                            </c:otherwise>
                        </c:choose>
                    </select>
                  <font color="red"></font>
                 </div>
               <div>
                  <label for="myFreight">我方运费：</label>
                  <input type="text" name="myFreight" id="myFreight" value="${bill.myFreight }">
                  <font color="red"></font>
               </div>
              <div>
                  <label for="isFreeShip">发货状态：</label>
                  <select name="seliverStatus" id="seliverStatus">
                      <c:choose>
                          <c:when test="${bill.seliverStatus == 1 }">
                              <option value="1" selected="selected">已发货</option>
                              <option value="2">未发货</option>
                          </c:when>
                          <c:otherwise>
                              <option value="1">已发货</option>
                              <option value="2" selected="selected">未发货</option>
                          </c:otherwise>
                      </c:choose>
                  </select>
                  <font color="red"></font>
              </div>
               <div>
                  <label >支付状态：</label>
                  <c:if test="${bill.isPayment == 1 }">
                      <input type="radio" name="isPayment" value="1" checked="checked">未付款
                      <input type="radio" name="isPayment" value="2" >已付款
                      <input type="radio" name="isPayment" value="3" >已退款
                      <input type="radio" name="isPayment" value="4" >赠送
                      <input type="radio" name="isPayment" value="5" >员工福利
                  </c:if>
                  <c:if test="${bill.isPayment == 2 }">
                      <input type="radio" name="isPayment" value="1">未付款
                      <input type="radio" name="isPayment" value="2" checked="checked">已付款
                      <input type="radio" name="isPayment" value="3" >已退款
                      <input type="radio" name="isPayment" value="4" >赠送
                      <input type="radio" name="isPayment" value="5" >员工福利
                  </c:if>
                   <c:if test="${bill.isPayment == 3 }">
                       <input type="radio" name="isPayment" value="1">未付款
                       <input type="radio" name="isPayment" value="2" >已付款
                       <input type="radio" name="isPayment" value="3" checked="checked">已退款
                       <input type="radio" name="isPayment" value="4" >赠送
                       <input type="radio" name="isPayment" value="5" >员工福利
                   </c:if>
                   <c:if test="${bill.isPayment == 4 }">
                       <input type="radio" name="isPayment" value="1">未付款
                       <input type="radio" name="isPayment" value="2" >已付款
                       <input type="radio" name="isPayment" value="3" >已退款
                       <input type="radio" name="isPayment" value="4" checked="checked">赠送
                       <input type="radio" name="isPayment" value="5" >员工福利
                   </c:if>
                   <c:if test="${bill.isPayment == 5 }">
                       <input type="radio" name="isPayment" value="1">未付款
                       <input type="radio" name="isPayment" value="2" >已付款
                       <input type="radio" name="isPayment" value="3" >已退款
                       <input type="radio" name="isPayment" value="4" >赠送
                       <input type="radio" name="isPayment" value="5" checked="checked">员工福利
                   </c:if>
               </div>
              <div>
                  <label for="waybill">运单号：</label>
                  <input type="text" name="waybill" id="waybill" value="${bill.waybill }">
                  <font color="red"></font>
              </div>
              <div>
                  <label for="data">发货日期：</label>
                  <input type="text" Class="Wdate" id="seliverDate" name="seliverDate" value=<fmt:formatDate value="${bill.seliverDate}" pattern="yyyy-MM-dd"/>
                          onclick="WdatePicker();">
                  <font color="red"></font>
              </div>
               <div>
                  <label for="remark">备注：</label>
                  <input type="text" name="remark" id="remark" value="${bill.remark }">
                  <font color="red"></font>
               </div>
              <div>
                  <label for="createdBy">创建者：</label>
                  <input type="text" name="createdBy" id="createdBy" value="${bill.createdBy }">
                  <font color="red"></font>
              </div>
              <div>
                  <label for="data">创建时间：</label>
                  <input type="text" Class="Wdate" id="creationDate" name="creationDate" value=<fmt:formatDate value="${bill.creationDate}" pattern="yyyy-MM-dd"/>
                          readonly="readonly" onclick="WdatePicker();">
                  <span><fmt:formatDate value="${user.creationDate}" pattern="yyyy-MM-dd"/></span>
                  <font color="red"></font>
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
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/billmodify.js"></script>