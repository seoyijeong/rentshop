<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>shop</title>
	<link rel="stylesheet" href="<c:url value='/css/menu.css'/>">
</head>
<body>
	<jsp:include page="inc/header.jsp" />
	<div class="container border p-5 home">
		<h3>도서 고객 및 대여관리 프로그램</h3>
		<hr>
		<ul>
			<li>프로그램 작성순서</li>
			<li>1. 고객정보 테이블을 생성 한다.</li>
			<li>2. 대여정보 테이블을 생성 한다.</li>
			<li>3. 고객정보, 대여정보 테이블에 제시된 데이터를 생성한다.</li>
			<li>4. 고객정보 입력 화면 프로그램을 작성한다.</li>
			<li>5. 고객정보 조회 프로그램을 작성한다.</li>
			<li>6. 고객별 대여금액을 조회하는 프로그램을 작성한다</li>
		</ul>
	</div>
	<jsp:include page="inc/footer.jsp" />
</body>
</html>