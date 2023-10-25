<%@ page language="java" contentType="text/html; charset=UTF-8"	
	pageEncoding="UTF-8"%>
<%@ include file="inc/header.jsp"%>

<div class="container border p-3 mt-5">
<h3>고객대여리스트</h3>
<table class="table table-bordered">
	<thead>
		<th scope="col">고객번호</th>
		<th scope="col">대여번호</th>
		<th scope="col">도서코드</th>
		<th scope="col">대여금액</th>
		<th scope="col">대여일자</th>
	</thead>
	<tbody>
	<c:forEach var="item" items="${rentList}">
		<tr>
			<td>${item.cust_no}</td>
			<td>${item.rent_no}</td>
			<td>${item.book_code}</td>
			<td>${item.rent_price}</td>
			<td>${item.rent_date}</td>
		</tr>
	</c:forEach>
	</tbody>
</table>

</div>

<jsp:include page="inc/footer.jsp"/>