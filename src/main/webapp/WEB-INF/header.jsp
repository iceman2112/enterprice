<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css" /><title>Order</title>
</head>
<body>
<nav class="container">
    <ul>
        <li class="nav-item"><a class="nav-link" href="<c:url value="/main" />">Main</a></li>
        <li class="nav-item"><a class="nav-link" href="<c:url value="/catalog" />"> Catalog</a></li>
        <li class="nav-item"><a class="nav-link" href="<c:url value="/product" />">Product</a></li>
        <li class="nav-item"><a class="nav-link" href="<c:url value="/cart" />">Cart</a></li>
        <li class="nav-item"><a class="nav-link" href="<c:url value="/order" />">Order</a></li>
    </ul>
</nav>