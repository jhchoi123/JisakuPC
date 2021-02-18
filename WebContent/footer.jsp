<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <link href="css/footer.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<footer>
  <table width="100%">
    <tr>
      <td width="25%" align="center">
        <div id="build">
          <a href="addbuild">見積り</a>
        </div>
      </td>
      <td width="25%" align="center">
        <div id="post">
          <a href="post">投稿</a>
        </div>
      </td>
      <c:choose>
        <c:when test="${sessionScope.loginFlag.correctUser}">
          <td width="50%" align="center">
            <div id="user-info">
              <a href="mypage">${sessionScope.loginFlag.userId} 様</a>
            </div>
          </td>
        </c:when>
        <c:otherwise>
          <td width="25%" align="center">
            <div id="login">
              <a href="login">ログイン</a>
            </div>
          </td>
          <td width="25%">
            <div id="signup">
              <a href="signup">新規登録</a>
            </div>
          </td>
        </c:otherwise>
      </c:choose>

    </tr>
  </table>
</footer>
</body>
</html>