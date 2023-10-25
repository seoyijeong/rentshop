<%@ page language="java" contentType="text/html; charset=UTF-8"	
	pageEncoding="UTF-8"%>
<%@ include file="inc/header.jsp"%>

<div class="container border p-3 mt-5">
<h3>고객목록조회/수정</h3>
<table class="table table-bordered">
	<thead>
		<th scope="col">고객번호</th>
		<th scope="col">고객이름</th>
		<th scope="col">전화번호</th>
		<th scope="col">가입일자</th>
		<th scope="col">이메일</th>
		<th scope="col">고객등급</th>
	</thead>
	<tbody>
	<c:forEach var="item" items="${members}">
		<tr>
			<td><a href="/modify?cust_no=${item.cust_no}">${item.cust_no}</a></td>
			<td>${item.cust_name}</td>
			<td>${item.phone}</td>
			<td>${item.join_date}</td>
			<td>${item.cust_email}</td>
			<td>${item.grade}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>

</div>

<jsp:include page="inc/footer.jsp"/>