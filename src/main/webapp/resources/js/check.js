
function returnCheck() {

	var cust_name = $("#cust_name").val();
	var phone = $("#phone").val();
	var cust_email = $("#cust_email").val();
	var grade = $("#grade").val();
	
	if(cust_name == null || cust_name === "") {
		alert("고객이름이 입력되지 않았습니다.");
		$("#cust_name").focus();
		return false;
	}
	
	if(phone == null || phone === "") {
		alert("전화번호가 입력되지 않았습니다.");
		$("#phone").focus();
		return false;
	}
	
	if(cust_email == null || cust_email === "") {
		alert("이메일이 입력되지 않았습니다.");
		$("#cust_email").focus();
		return false;
	}
	
	if(grade == null || grade === "") {
		alert("고객등급이 입력되지 않았습니다.");
		$("#grade").focus();
		return false;
	}
	
	if (grade == "P" || grade == "p") {
		grade = "Platinum"
	} else if (grade == "G" || grade == "g") {
		grade = "Gold"
	} else if (grade == "S" || grade == "s") {
		grade = "Silver"
	} else {
		alert("고객등급은 P,G,S 중 하나입니다")
		return false;
	}
	
}

	