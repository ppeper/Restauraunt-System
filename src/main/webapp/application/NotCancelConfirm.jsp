<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<script>
   if (!confirm("노쇼 방지 예약 방침에 따라 보증금을 돌려받으실 수 없습니다. 그래도 취소하시겠습니까?")) {
       // 취소(아니오) 버튼 클릭 시 이벤트
	   location.href="../presentation/ReservationInfo.jsp";
   } else {
       // 확인(예) 버튼 클릭 시 이벤트
	   location.href="CancelAction.jsp";
   }
   </script>
</body>
</html>