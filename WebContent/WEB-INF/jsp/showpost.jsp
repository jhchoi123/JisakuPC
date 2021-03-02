<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">

  <title>掲示板</title>
  <link href="css/showpost.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<script src="${pageContext.request.contextPath}/js/jquery-3.5.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/axios.min.js"></script>
<script src="${pageContext.request.contextPath}/js/showpost.js"></script>

<jsp:include page="/header.jsp"/>
<form action="deletepost" method="post">
  <c:forEach var="post" items="${data}">
    <h1>${post.title}</h1>
    <h4>${post.userid}&nbsp;&nbsp;${post.date}&nbsp;&nbsp;
    <input type="hidden" name="postno" value="${post.no}">
      <c:if test="${(post.userid eq sessionScope.loginFlag.userId) or sessionScope.loginFlag.admin}">
        <input type="submit" name="delete" class="delete" value="投稿を削除">
      </c:if>
      </h4><br>
    <h3>${post.description}</h3>
    <table border="1" class="showpost">
      <tr>
        <th>画像</th>
        <th>分類</th>
        <th>商品名</th>
        <th>値段</th>
        <th>商品番号</th>
      </tr>
      <a href="javascript:history.back()" class="back">1ページ戻る</a>
      <c:forEach var="posts" items="${post.list}">
        <tr>
          <td><img id="image-${posts.productno}"
                   src="${pageContext.request.contextPath}/image/transparent.png" alt="${posts.pname}">
          </td>
          <td>${posts.type}</td>
          <td>${posts.pname}</td>
          <td>${posts.price}</td>
          <td class="product-no">${posts.productno}</td>
        </tr>
      </c:forEach>

    </table>
  </c:forEach>
</form>
</body>
</html>
