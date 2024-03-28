<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<center>
<body bgcolor="pink">
<h1>Edit Product Data</h1>
<form:form method="GET" action="/editu">
<table>

<tr>
<td>Customer Id:</td>
<td><form:hidden path="customerid"/></td>
</tr>

<tr>
<td>Customer Name:</td>
<td><form:input path="customername"/></td>
</tr>

<tr>
<td>Mobile Number:</td>
<td><form:input path="mobileno"/></td>
</tr>

<tr>
<td>Product Name:</td>
<td><form:input path="productname"/></td>
</tr>

<tr>
<td>Price:</td>
<td><form:input path="price"/></td>
</tr>

<tr>
<td>Quantity:</td>
<td><form:input path="quantity"/></td>
</tr>

<tr>
<td></td>
<td><input type="submit" value="Edit Save"/></td>
</tr>

</table>
</form:form>
<a href="/views">View All Product Details</a><p></p>
<a href="/req1">Add New Product Here</a>
</body>
</center>