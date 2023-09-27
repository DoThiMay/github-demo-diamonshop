<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>CHI - NHANH</title>
</head>
<body>
<h1>${Offices.size() }</h1>
<c:forEach var="abc" items="${Offices}">
			<div>${abc.getId()}</div>
			<div>${abc.getTenchi_nhanh()}</div>
			<div style="text-align: center">${abc.getDia_chi()}</div>
			<div style="text-align: center">${abc.getGio_mo()}
			<div style="text-align: center">${abc.getGio_dong()}</div>
	</c:forEach>
</body>
</html>