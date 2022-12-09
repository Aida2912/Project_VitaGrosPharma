
<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>




<h1 >New Owner</h1>
<br>
<div class="container">

<form:form method="post" modelAttribute="owners"  >


<div class="col-sm-8">
<form:errors path="firstname" color="red"/>
<form:label path="firstname">FirstName</form:label>
<form:input  path="firstname" type="text" style="width:100% "/><br><br>
</div>

<div class="mb-3-row"></div>

<div class="col-sm-8">
<form:errors path="lastname" color="red"/>
<form:label path="lastname">LastName</form:label>
<form:input path="lastname" type="text" style="width:100% "/><br><br>
</div>

<div class="col-sm-8">
<form:errors path="address" color="red"/>
<form:label path="address">Address</form:label>
<form:input path="address" type="text" style="width:100% "/><br><br>
</div>

<div class="col-sm-8">
<form:errors path="city" color="red"/>
<form:label path="city">City</form:label>
<form:input path="city" type="text"  style="width:100% "/><br><br>
</div>

<div class="col-sm-8">
<form:errors path="telephone" color="red"/>
<form:label path="telephone">Telephone</form:label><br><br>
<form:input path="telephone"  type="number"  style="width:100% "  /><br><br>
</div>
<button class="btn btn-primary" type="submit" style="color:white ">Add Owner</button>

</form:form>
</div>


