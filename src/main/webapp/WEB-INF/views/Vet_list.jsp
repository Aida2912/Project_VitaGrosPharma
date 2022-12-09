<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>


<br>
<br>




<table  class="table ">
  <thead class="table-success">
    <tr>
   
      <th >Name</th>
      <th>Speciality</th>
      
  
    </tr>
  </thead>
  
        <tbody>
        <c:forEach items="${vet}" var="vet">
        
        <tr>
        
         <td>${vet.firstname} ${vet.lastname}</td>
         <td>${vet.speciality.name}</td>
          
        </tr>
        </c:forEach>
        </tbody>
        
      </table>
      
   
  
      

        
<%@ include file="common/footer.jspf"%>