
<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>




<h1>New Pet</h1>
<br>
<div class="container">

<form:form method="post" modelAttribute="pets" >

<form:errors path="name" color="red"/>
<form:label path="name">Name</form:label>
<form:input path="name" type="text"/><br><br>

<form:errors path="dateofirth" color="red"/>
<form:label path="dateofirth">Birth Day</form:label>
<form:input path="dateofirth" type="text"/><br><br>



<form:errors path="dateofirth" color="red"/>
<form:label path="dateofirth">Type</form:label>
<form:input path="dateofirth" type="text"/><br><br>

<form:label for="pet"  path="petType">Choose a pet:</form:label>

<form:select name="pet" id="pet" path="petType">
  <option value="cat">Cat</option>
  <option value="cat">Dog</option>
  <option value="cat">cat</option>
  <option value="cat">cat</option>
</form:select>




<button  type="submit">add</button>
</form:form>
</div>


