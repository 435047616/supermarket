<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/2/11 0011
  Time: 下午 1:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/jsp/common/head.jsp"%>

<div class="right">
    <div class="location">
        <strong>你现在所在的位置是:</strong>
        <span>购进管理页面</span>
    </div>
    <div class="search">
        <form method="get" action="${path}/sys/buy">
            <span>商品名称：</span>
            <input name="buyName" type="text" value="${buyName }">

            <span>供应商：</span>
            <select name="providerId">
                <c:if test="${providerList != null }">
                    <option value="0">--请选择--</option>
                    <c:forEach var="provider" items="${providerList}">
                        <option <c:if test="${provider.id == providerId }">selected="selected"</c:if>
                                value="${provider.id}">${provider.proName}</option>
                    </c:forEach>
                </c:if>
            </select>

            <span>是否付款：</span>
            <select name="isPayment">
                <option value="0">--请选择--</option>
                <option value="1" ${isPayment == 1 ? "selected=\"selected\"":"" }>未付款</option>
                <option value="2" ${isPayment == 2 ? "selected=\"selected\"":"" }>已付款</option>
            </select>

            <input	value="查 询" type="submit" id="searchbutton">
            <a href="${path}/sys/buyadd">添加商品</a>
        </form>
    </div>
    <!--账单表格 样式和供应商公用-->
    <table class="providerTable" cellpadding="0" cellspacing="0">
        <tr class="firstTr">
            <th width="5%">订单编码</th>
            <th width="20%">商品名称</th>
            <th width="10%">供应商</th>
            <th width="5%">规格</th>
            <th width="5%">单价</th>
            <th width="5%">数量</th>
            <th width="10%">订单金额</th>
            <th width="10%">是否付款</th>
            <th width="10%">创建时间</th>
            <th width="30%">操作</th>
        </tr>
        <c:forEach var="buy" items="${buyList }" varStatus="status">
            <tr>
                <td>
                    <span>${buy.buyCode }</span>
                </td>
                <td>
                    <span>${buy.buyName }</span>
                </td>
                <td>
                    <span>${buy.provider.proName}</span>
                </td>
                <td>
                    <span>${buy.productStandard}</span>
                </td>
                <td>
                    <span>${buy.productUnitPrice}</span>
                </td>
                <td>
                    <span>${buy.productCount}</span>
                </td>
                <td>
                    <span>${buy.totalPrice}</span>
                </td>
                <td>
					<span>
						<c:if test="${buy.isPayment == 1}">未付款</c:if>
						<c:if test="${buy.isPayment == 2}">已付款</c:if>
					</span>
                </td>
                <td>
					<span>
					<fmt:formatDate value="${buy.creationDate}" pattern="yyyy-MM-dd"/>
					</span>
                </td>
                <td>
                    <span><a class="viewBuy" href="${path }/sys/buyview?buyid=${buy.id }"><img src="${path}/statics/images/read.png" alt="查看" title="查看"/></a></span>
                    <span><a class="modifyBuy" href="${path }/sys/buymodify?buyid=${buy.id }"><img src="${path}/statics/images/xiugai.png" alt="修改" title="修改"/></a></span>
                    <span><a class="deleteBuy" href="javascript:;" buyid=${buy.id } billcc=${buy.buyCode }><img src="${path}/statics/images/schu.png" alt="删除" title="删除"/></a></span>
                </td>
            </tr>
        </c:forEach>
    </table>
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
<script type="text/javascript" src="${path}/statics/js/buylist.js"></script>