<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎页面</title>
</head>
<body>
	<form>
		<table width="100%" border=1>
        <tr>
            <td></td>
            <td>商品外观</td>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>商品描述</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${productList}" var="item" varStatus="status">
            <tr>
                <td><input type="checkbox" name="ids" value="${item.id}"></td>
                <td><img src="/${item.pic}" width="100" height="50"></td>
                <input type="hidden" value="${item.id }">
                <td><input type="text" value="${item.name }"/></td>
                <td><input type="text" value="${item.price }"></td>
         
                <td><input type="text"  value="${item.detail }"></td>
                <td><a href="${pageContext.request.contextPath }/product/getProduct.action?id=${item.id}">修改</a></td>
            </tr>
        </c:forEach>
    </table>
	</form>
</body>
</html>