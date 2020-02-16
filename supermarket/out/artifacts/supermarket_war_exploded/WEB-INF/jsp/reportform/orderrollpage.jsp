<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	
</script>
</head>
<body>
	
 		<div class="page-bar">
			<ul class="page-num-ul clearfix">
				<li>共${totalCount }条记录&nbsp;&nbsp; ${currentPage }/${totalPage }页</li>
				<c:if test="${currentPage > 1}">
					<a href="${pageContext.request.contextPath}/report/orderReport?currentPage=1&&id=${id}&productName=${productName}&creationDate=${creationDate}&seliverDate=${seliverDate}&isFreeShip=${isFreeShip}&seliverStatus=${seliverStatus}&isPayment=${isPayment}">首页</a>
					<a href="${pageContext.request.contextPath}/report/orderReport?currentPage=${currentPage-1 }&&id=${id}&productName=${productName}&creationDate=${creationDate}&seliverDate=${seliverDate}&isFreeShip=${isFreeShip}&seliverStatus=${seliverStatus}&isPayment=${isPayment}">上一页</a>
				</c:if>
				<c:if test="${currentPage < totalPage }">
					<a href="${pageContext.request.contextPath}/report/orderReport?currentPage=${currentPage+1 }&&id=${id}&productName=${productName}&creationDate=${creationDate}&seliverDate=${seliverDate}&isFreeShip=${isFreeShip}&seliverStatus=${seliverStatus}&isPayment=${isPayment}">下一页</a>
					<a href="${pageContext.request.contextPath}/report/orderReport?currentPage=${totalPage }&&id=${id}&productName=${productName}&creationDate=${creationDate}&seliverDate=${seliverDate}&isFreeShip=${isFreeShip}&seliverStatus=${seliverStatus}&isPayment=${isPayment}">最后一页</a>
				</c:if>
				&nbsp;&nbsp;
			</ul>
			<form id="jump" action="${pageContext.request.contextPath }/report/orderReport">
				<span class="page-go-form"><label>跳转至</label>
				<input type="text" name="currentPage" id="inputPage" class="page-key" />页
					<input type="hidden" name="id" value="${id}"/>
					<input type="hidden" name="productName" value="${productName}"/>
					<input type="hidden" name="creationDate" value="${creationDate}"/>
					<input type="hidden" name="seliverDate" value="${seliverDate}"/>
					<input type="hidden" name="isFreeShip" value="${isFreeShip}"/>
					<input type="hidden" name="seliverStatus" value="${seliverStatus}"/>
					<input type="hidden" name="isPayment" value="${isPayment}"/>
					<!-- <button type="button" class="page-btn" onClick='jump_to(document.forms[0],document.getElementById("inputPage").value)'>GO</button> -->
				<button type="button" class="page-btn" onclick="jump_to()">GO</button>
		    </form>
		</span>
		</div> 
</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/statics/js/rollpage.js"></script>
</html>