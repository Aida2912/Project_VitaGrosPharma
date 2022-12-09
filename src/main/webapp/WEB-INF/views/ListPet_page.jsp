
<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>


<br>
<br>

<table  class="table ">

  <thead class="table-success">
    <tr>
   
      <th >Name</th>
      <th >DateofBirth</th>
      <th >Type</th>
      <th >Description</th>
     
      
     
      
      
     
  
    </tr>
  </thead>
  
        <tbody>
        <c:forEach items="${pets}" var="pet">
        
        <tr>
          
        <td>${pet.name} <a href="/Pets-details?id=${pet.id}"> </a></td> 
        <th>${pet.dateofBirth}</th>
        <td>${pet.petType.name}</td>
        <td>${pet.visits.description}</td>
        
        </tr>
        </c:forEach>
        </tbody>
        
      </table><br><br><br>
      
     <div >
                <button class="btn btn-primary"><a href="new_pet"  style="color:white ">Add Pet</a></button> &nbsp;&nbsp;
                 <button class="btn btn-primary"><a href="/logout" style="color:white ">Logout</a></button>       
     
     
     </div>
      
      
  
      

        
<%@ include file="common/footer.jspf"%>