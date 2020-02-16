<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/head.jsp"%>

<div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>订单统计报表页面</span>
        </div>
        <div class="search">
        	<form method="get" action="${path }/report/orderReport">
				<span>订单号：</span>
				<input id name="id" type="text" value="${id }">
				<%--<input name="creationDate" type="text" value="${creationDate }">--%>

				发货日期:
				<input type="text" Class="Wdate" id="seliverDate" name="seliverDate" readonly="readonly" onclick="WdatePicker();">

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
			</form>
        </div>
        <!--订单统计表格-->
        <table class="providerTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
				<th width="15%">订单序号</th>
                <th width="3%">单位</th>
                <th width="5%">客户名称</th>
                <th width="10%">联系方式</th>
                <th width="10%">地址</th>
                <th width="3%">发货数量</th>
                <th width="3%">是否包邮</th>
                <th width="3%">我方运费</th>
                <th width="5%">订单金额</th>
                <th width="5%">付款情况</th>
                <th width="3%">发货情况</th>
                <th width="5%">运单号</th>
                <th width="5%">发货日期</th>
                <th width="5%">对接人</th>
                <th width="7%">备注</th>
			</tr>
            <c:forEach var="provider" items="${financeReport }" varStatus="status">
				<tr>
					<td>
					<span>${provider.billCode} </span>
					</td>
					<td>
						<span>${provider.productUnit }</span>
					</td>
					<td>
						<span>${provider.customerName }</span>
					</td>
					<td>
						<span>${provider.customerTel }</span>
					</td>
					<td>
						<span>${provider.customerAddress }</span>
					</td>


					<td>
						<span>${provider.productCount}</span>
					</td>

					<%--是否包邮--%>
					<td>
						<c:if test="${provider.isFreeShip==1}">不</c:if>
						<c:if test="${provider.isFreeShip==2}">是</c:if>
					</td>

					<%--我方运费--%>
					<td>
						<span>${provider.myFreight}</span>
					</td>

					<td>
						<span>${provider.totalPrice}</span>
					</td>

					<td>
						<c:if test="${provider.isPayment==1}">待付款</c:if>
						<c:if test="${provider.isPayment==2}">已付款</c:if>
						<c:if test="${provider.isPayment==3}">已退款</c:if>
						<c:if test="${provider.isPayment==4}">赠送</c:if>
						<c:if test="${provider.isPayment==5}">员工福利</c:if>
					</td>

					<td>
						<c:if test="${provider.seliverStatus==1}">未发货</c:if>
						<c:if test="${provider.seliverStatus==2}">已发货</c:if>

					</td>

					<td>
						<span>${provider.waybill }</span>
					</td>


					<td>
						<span>
						<fmt:formatDate value="${provider.seliverDate}" pattern="yyyy-MM-dd"/>
						</span>
					</td>

					<td>
						<span>${provider.dockPeople }</span>
					</td>

					<td>
						<span>${provider.remark }</span>
					</td>

				<%--	<td>
					<span><a class="viewProvider" href="javascript:;" proid=${provider.id } proname=${provider.proName }><img src="${path}/statics/images/read.png" alt="查看" title="查看"/></a></span>
					<span><a class="modifyProvider" href="javascript:;" proid=${provider.id } proname=${provider.proName }><img src="${path}/statics/images/xiugai.png" alt="修改" title="修改"/></a></span>
					<span><a class="deleteProvider" href="javascript:;" proid=${provider.id } proname=${provider.proName }><img src="${path}/statics/images/schu.png" alt="删除" title="删除"/></a></span>
					</td>--%>
				</tr>
			</c:forEach>
        </table>
		<input type="hidden" id="totalPageCount" value="${totalPage}"/>
		<c:import url="orderrollpage.jsp">
			<c:param name="totalCount" value="${totalCount}"/>
			<c:param name="currentPageNo" value="${currentPage}"/>
			<c:param name="totalPageCount" value="${totalPage}"/>
		</c:import>
    </div>
</section>
<%@include file="/WEB-INF/jsp/common/foot.jsp" %>
<script type="text/javascript" src="${path}/statics/js/providerlist.js"></script>
