<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>	
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>健医产品营销管理系统</title>
    <link type="text/css" rel="stylesheet" href="${path}/statics/css/style.css" />
    <link type="text/css" rel="stylesheet" href="${path}/statics/css/public.css" />
</head>
<body>
<!--头部-->
    <header class="publicHeader">
        <h1>健医产品营销管理系统</h1>
        <div class="publicHeaderR">
            <p><span>下午好！</span><span style="color: #fff21b"> ${userOnLogin.userName }</span> , 欢迎你！</p>
            <a href="${path}/sys/logout">退出</a>
        </div>
    </header>
<!--时间-->
    <section class="publicTime">
        <span id="time">2015年1月1日 11:11  星期一</span>
        <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
    </section>
 <!--主体内容-->
 <section class="publicMian ">
     <div class="left">
         <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
         <nav class="nav">
             <ul class="list">
                 <c:if test="${userOnLogin.userRole==1}">
                 <li><a href="${path }/sys/provider"  onclick="change_bg(this)">供应商管理</a></li>


                 <li ><a href="${path}/sys/buy"  onclick="change_bg(this)">购进管理</a></li>
                 </c:if>

                 <li ><a href="${path}/sys/bill"  onclick="change_bg(this)">订单管理</a></li>

                 <%--管理员才能看--%>
                 <c:if test="${userOnLogin.userRole==1}">
                     <li><a href="${path }/sys/user"  onclick="change_bg(this)">用户管理</a></li>
                 </c:if>
                 <li><a href="${path }/sys/pwdmodify"  onclick="change_bg(this)">密码修改</a></li>
                 <li><a href="${path }/sys/logout"  onclick="change_bg(this)">退出系统</a></li>
             </ul>
             <h2 class="leftH2"><span class="span1"></span>统计列表 <span></span></h2>
             <nav>
                 <ul class="list">
                     <%--财务人员才能看--%>
                     <c:if test="${userOnLogin.userRole==3 || userOnLogin.userRole==1}">
                         <li ><a href="${path}/report/financeReport"  onclick="change_bg(this)">财务报表</a></li>
                     </c:if>
                     <li><a href="${path }/report/orderReport"  onclick="change_bg(this)">订单统计</a></li>
                     <c:if test="${userOnLogin.userRole==3 || userOnLogin.userRole==1}">
                         <li ><a href="${path}/report/saleReport">销售报表</a></li>
                     </c:if>
                 </ul>
             </nav>
     </div>
     <input type="hidden" id="path" name="path" value="${pageContext.request.contextPath }"/>
     <input type="hidden" id="referer" name="referer" value="<%=request.getHeader("Referer")%>"/>
     <script>
         function change_bg(obj){
          /*   var a=document.getElementsByClassName("nav")[0].getElementsByTagName("a");
             for(var i=0;i<a.length;i++){a[i].className="";}
             obj.className="current";*/
         }
     </script>