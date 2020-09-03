<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
  <meta charset="UTF-8">
  <title>勉強時間スケジュール</title>
</head>
<body>
  <h1>ようこそ！</h1>

  <a href="<c:url value='/start' />" id="start">勉強開始！</a>
  <a href="<c:url value='/finish' />" id="finish">勉強終了！</a>

  <footer>By Horiksen</footer>
</body>
</html>