<%@ page contentType="text/html;charset=UTF-8" language="java"
         pageEncoding="UTF-8" %>
<html>
<head>
  <title>Product Spec : ${data.name}</title>
</head>
<body>
<script src="${pageContext.request.contextPath}/js/jquery-3.5.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/productspec.js"></script>
<script>
    $(function () {
        productspec("${data.no}", ${data.price});
    });
</script>

<h1>${data.name}</h1>
<div id="product-spec">
  <div id="product-spec-pid">PID : ${data.no}</div>
  <br>
  <div id="product-spec-name">NAME : ${data.name}</div>
  <br>
  <div id="product-spec-price">PRICE : ${data.price}</div>
  <br>
  <div id="product-spec-brand">BRAND : ${data.brand}</div>
  <br>
  <div id="product-spec-type">TYPE : ${data.type}</div>
  <br>
  <div id="product-spec-rakuten-url"></div>
</div>
</body>
</html>