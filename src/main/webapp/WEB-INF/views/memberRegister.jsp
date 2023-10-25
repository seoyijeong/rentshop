<%@ page language="java" contentType="text/html; charset=UTF-8"	
	pageEncoding="UTF-8"%>
<%@ include file="inc/header.jsp"%>

<div class="container border p-3 mt-5">
<h3>고객등록화면</h3>
<form action="/registerOk" method="post" onsubmit="return returnCheck()">
  <div class="mb-3 mt-3">
    <label for="cust_no" class="form-label">고객번호:</label>
    <input type="text" class="form-control" id="cust_no" name="cust_no" value="${cust_no}" disabled>
    <input type="hidden" class="form-control" name="cust_no" value="${cust_no}">
  </div>
  <div class="mb-3">
    <label for="cust_name" class="form-label">고객이름:</label>
    <input type="text" class="form-control" id="cust_name" name="cust_name">
  </div>
  <div class="mb-3">
    <label for="phone" class="form-label">전화번호:</label>
    <input type="text" class="form-control" id="phone" name="phone">
  </div>
    <div class="mb-3">
    <label for="cust_email" class="form-label">이메일:</label>
    <input type="text" class="form-control" id="cust_email" name="cust_email">
  </div>
   <div class="mb-3">
    <label for="grade" class="form-label">고객등급(P,G,S):</label>
    <input type="text" class="form-control" id="grade" name="grade">
  </div>
  <button type="submit" class="btn btn-primary">등록</button>
  <button type="reset" class="btn btn-primary">취소</button>
</form>
</div>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="js/check.js"></script>
<jsp:include page="inc/footer.jsp"/>