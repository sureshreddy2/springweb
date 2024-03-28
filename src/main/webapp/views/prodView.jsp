<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<center>
<h1 style="color:Orange">Product  Details</h1>
<table border="2" width="70%" cellpadding="2">

<tr>
<th>Customer ID</th>
<th>Customer Name</th>
<th>Mobile Number</th>
<th>Product Name</th>
<th>Price</th>
<th>Quantity</th>
<th>Total</th>
<th>Discount</th>
<th>Gst Amount</th>
<th>Invoice Bill</th>
<th>Edit</th>
<th>Delete</th>
</tr>

<c:forEach var="prod" items="${prods}">
<tr>
<td>${prod.customerid}</td>
<td>${prod.customername}</td>
<td>${prod.mobileno}</td>
<td>${prod.productname}</td>
<td>${prod.price}</td>
<td>${prod.quantity}</td>
<td>${prod.total}</td>
<td>${prod.discount}</td>
<td>${prod.gst_amt}</td>
<td>${prod.invoice_bill}</td>
<td><a href="/editprod/${prod.customerid}">Edit</a></td>
<td><a href="/delete/${prod.customerid}">Delete</a></td>
</tr>
</c:forEach>

</table>
</center>