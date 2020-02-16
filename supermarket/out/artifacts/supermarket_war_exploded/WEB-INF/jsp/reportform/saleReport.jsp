<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/head.jsp"%>

<div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>销售统计报表页面</span>
        </div>
        <div class="search">
        	<form method="get" action="${path }/report/saleReport">
				<span>日期：</span>
				<input type="text" Class="Wdate" id="startTime" name="startTime" readonly="readonly" onclick="WdatePicker();">
				至
				<input type="text" Class="Wdate" id="endTime" name="endTime" readonly="readonly" onclick="WdatePicker();">
				<span>保险类别：</span>
				<select name="productInsurance"  >
					<option <c:if test="${productInsurance == 900 }">selected="selected"</c:if> value="900">不包含</option>
					<option <c:if test="${productInsurance == 1100 }">selected="selected"</c:if> value="1100">包含</option>
				</select>
				<span>销售人：</span>
				<input name="salePeople" type="text" value="${salePeople }">
				<input	value="查 询" type="submit" id="searchbutton">
			</form>
        </div>
        <!--供应商操作表格-->
        <table class="providerTable" cellpadding="0" cellspacing="0">
            <tr class="firstTr">
				<th width="10%">销售额排名</th>
                <th width="20%">商品名</th>
                <th width="10%">保险类别</th>
                <th width="10%">日期</th>
                <th width="10%">销售人</th>
                <th width="10%">销售数量</th>
                <th width="10%">销售金额(销售单价*数量)</th>
			</tr>
            <c:forEach var="provider" items="${saleReport }" varStatus="status">
				<tr>
					<td>
					<span>${status.index + 1} </span>
					</td>
					<td>
					<span>
						<c:if test="${provider.productInsurance==900}">新型冠状病毒检测试剂(不包含)</c:if>
						<c:if test="${provider.productInsurance==1100}">新型冠状病毒检测试剂(包含)</c:if>
					</span>
					</td>
					<td>
					<span>
						<c:if test="${provider.productInsurance==900}">不包含</c:if>
						<c:if test="${provider.productInsurance==1100}">包含</c:if>
						<c:if test="${provider.productInsurance==''}"></c:if>
					</span>
					</td>
					<td>
						<span>
						<fmt:formatDate value="${provider.creationDate}" pattern="yyyy-MM-dd"/>
						</span>
						<span>${startTime }——${endTime }</span>
					</td>
					<td>
						<span>${provider.salePeople}</span>
					</td>

					<td>
						<span>${provider.saleCount}</span>
					</td>
					<td>
						<span>${provider.saleTotal}</span>
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
		<%--<c:import url="rollpage.jsp">
			<c:param name="totalCount" value="${totalCount}"/>
			<c:param name="currentPageNo" value="${currentPage}"/>
			<c:param name="totalPageCount" value="${totalPage}"/>
		</c:import>--%>
    </div>
</section>
<%@include file="/WEB-INF/jsp/common/foot.jsp" %>
<script type="text/javascript" src="${path}/statics/js/providerlist.js"></script>
