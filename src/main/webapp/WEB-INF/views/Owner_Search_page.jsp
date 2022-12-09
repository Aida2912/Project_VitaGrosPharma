<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>


<br>
<br>



<table class="table ">
  <thead class="table-success">
  
  
    <tr>
   
      <th >Name</th>
      
      <th >Address</th>
      <th >City</th>
       <th>Telephone</th>
        <th>Pets</th>
         
        
  
    </tr>
  </thead>
   <c:forEach items="${owners}" var="owner">
  
        <tbody>
       
        <tr>
        
        
        <th>${owner.address}</th>
        <th>${owner.city}</th>
        <td>${owner.telephone}</td>
         <td>${owner.pets.name}</td>
          
          
        </tr>
         </c:forEach>
        
        </tbody>
        
      </table><br><br><br>


