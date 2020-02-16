<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/head.jsp"%>

<div class="right">
       <div class="location">
           <strong>你现在所在的位置是:</strong>
           <span>订单管理页面</span>
       </div>
       <div class="search">
       <form method="get" action="${path}/sys/bill">
           <span>订单号：</span>
           <input id name="id" type="text" value="${id }">
           <%--<input name="creationDate" type="text" value="${creationDate }">--%>
           创建日期:
           <input type="text" Class="Wdate" id="creationDate" name="creationDate" readonly="readonly" onclick="WdatePicker();">
           发货日期:
           <input type="text" Class="Wdate" id="seliverDate" name="seliverDate" readonly="readonly" onclick="WdatePicker();">
            对接人：
           <input type="text"  id="dockPeople" name="dockPeople" value="${dockPeople}">
           销售对接人：
           <input type="text"  id="saleDock" name="saleDock" value="${saleDock}">

            付款方式：
           <select name="payWay"  >
               <option  value="">全部</option>
               <option  value="1">支付宝</option>
               <option  value="2">微信</option>
               <option  value="3">银行转账</option>
               <option  value="4">赠送</option>
               <option  value="5">员工福利</option>
               <option  value="6">其他</option>
           </select>
       <%--<input name="seliverDate" type="text" value="${seliverDate }">--%>

           <span>是否包邮：</span>
           <select name="isFreeShip"  >
               <option  <c:if test="${isFreeShip == '' }">selected="selected"</c:if> value="">全部</option>
               <option <c:if test="${isFreeShip == 1 }">selected="selected"</c:if> value="1">不包邮</option>
               <option <c:if test="${isFreeShip == 2 }">selected="selected"</c:if> value="2">包邮</option>
           </select>
           </br>
           <span>发货情况：
					<select name="seliverStatus"  >
					<option  <c:if test="${seliverStatus == '' }">selected="selected"</c:if> value="">全部</option>
					<option <c:if test="${seliverStatus == 2 }">selected="selected"</c:if> value="2">已发货</option>
					<option <c:if test="${seliverStatus == 1 }">selected="selected"</c:if> value="1">未发货</option>
					</select>
                </span>

           <span>付款情况核对：</span>
           <select name="isPayment"  >
               <option  <c:if test="${isPayment == '' }">selected="selected"</c:if> value="">全部</option>
               <option <c:if test="${isPayment == 1 }">selected="selected"</c:if> value="1">待付款</option>
               <option <c:if test="${isPayment == 2 }">selected="selected"</c:if> value="2">已付款</option>
               <option <c:if test="${isPayment == 3 }">selected="selected"</c:if> value="3">已退款</option>
               <option <c:if test="${isPayment == 4 }">selected="selected"</c:if> value="4">赠送</option>
               <option <c:if test="${isPayment == 5 }">selected="selected"</c:if> value="5">员工福利</option>
           </select>
			
			 <input	value="查 询" type="submit" id="searchbutton">
               <c:if test="${userOnLogin.userRole==1||userOnLogin.userRole==2}">
                   <a href="${path}/sys/billadd">添加订单</a>
               </c:if>
		</form>
       </div>
       <!--账单表格 样式和供应商公用-->
      <table class="providerTable" cellpadding="0" cellspacing="0">
          <tr class="firstTr">
              <th width="10%">订单编码</th>
              <th width="20%">商品编码</th>
              <th width="10%">订单金额</th>
              <th width="10%">是否付款</th>
              <th width="10%">创建时间</th>
              <th width="30%">操作</th>
          </tr>
          <c:forEach var="bill" items="${billList }" varStatus="status">
				<tr>
					<td>
					<span>${bill.billCode }</span>
					</td>
					<td>
					<span>${bill.productCode }</span>
					</td>
					<td>
					<span>${bill.totalPrice}</span>
					</td>
					<td>
					<span>
						<c:if test="${bill.isPayment == 1}">待付款</c:if>
						<c:if test="${bill.isPayment == 2}">已付款</c:if>
                        <c:if test="${bill.isPayment == 3}">已退款</c:if>
						<c:if test="${bill.isPayment == 4}">赠送</c:if>
                        <c:if test="${bill.isPayment == 5}">员工福利</c:if>
					</span>
					</td>
					<td>
					<span>
					<fmt:formatDate value="${bill.creationDate}" pattern="yyyy-MM-dd"/>
					</span>
					</td>
					<td>
					<span><a class="viewBill" href="${path }/sys/billview?billid=${bill.id }"><img src="${path}/statics/images/read.png" alt="查看" title="查看"/></a></span>
					<span><a class="modifyBill" href="${path }/sys/billmodify?billid=${bill.id }"><img src="${path}/statics/images/xiugai.png" alt="修改" title="修改"/></a></span>
					<span><a class="deleteBill" href="javascript:;" billid=${bill.id } billcc=${bill.billCode }><img src="${path}/statics/images/schu.png" alt="删除" title="删除"/></a></span>
					</td>
				</tr>
			</c:forEach>
      </table>
    <input type="hidden" id="totalPageCount" value="${totalPage}"/>
    <c:import url="billRollpage.jsp">
        <c:param name="totalCount" value="${totalCount}"/>
        <c:param name="currentPageNo" value="${currentPage}"/>
        <c:param name="totalPageCount" value="${totalPage}"/>
    </c:import>
  </div>
</section>

<!--点击删除按钮后弹出的页面-->
<div class="zhezhao"></div>
<div class="remove" id="removeBi">
    <div class="removerChid">
        <h2>提示</h2>
        <div class="removeMain">
            <p>你确定要删除该订单吗？</p>
            <a href="#" id="yes">确定</a>
            <a href="#" id="no">取消</a>
        </div>
    </div>
</div>

<%@include file="/WEB-INF/jsp/common/foot.jsp" %>
<script type="text/javascript" src="${path}/statics/js/billlist.js"></script>