<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bob D Run's Web App</title>
</head>
<body>
 <h1>Enter your name</h1>
    <!-- method="GET"이면 doGet에서 처리가 가능 -->
    <form action="${pageContext.request.contextPath}/MainBobDRun" method="GET">
        <label for="userName">Name: </label>
        <input type="text" name="userName" id="userName" />
        <button type="submit">Submit</button>
    </form>
</body>
</html>