<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>shop</title>
    <link rel="stylesheet" href="<c:url value='/css/menu.css'/>">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="menu">
	<div class="subject">
		도서 고객 및 대여관리 프로그램 ver 1.0
	</div>
    <ul>
        <li><a href="<c:url value='/register'/>">고객등록</a></li>
        <li><a href="<c:url value='/list'/>">고객목록조회/수정</a></li>
        <li><a href="<c:url value='/rentList'/>">고객대여리스트</a></li>
        <li><a href="<c:url value='/rentMoney'/>">고객대여금액조회</a></li>
        <li><a href="<c:url value='/'/>">홈으로</a></li>
    </ul>
</div>