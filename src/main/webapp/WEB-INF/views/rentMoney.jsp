<%@ page language="java" contentType="text/html; charset=UTF-8"	
	pageEncoding="UTF-8"%>
<%@ include file="inc/header.jsp"%>

<div class="container border p-3 mt-5">
<h3>고객대여금액조회</h3>
<table class="table table-bordered">
	<thead>
		<th scope="col">고객번호</th>
		<th scope="col">대여번호</th>
		<th scope="col">고객등급</th>
		<th scope="col">총대여금액</th>
	</thead>
	<tbody>
	<c:forEach var="item" items="${rentMoney}">
		<tr>
			<td>${item.cust_no}</td>
			<td>${item.cust_name}</td>
			<td>${item.grade}</td>
			<td>${item.total_price}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>

</div>

<jsp:include page="inc/footer.jsp"/>