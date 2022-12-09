
;
<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>


<br>
<br>

<h1>Owner information</h1>
<div>

<table  class="table ">
  
  
    <tr>
      <th>Name</th>
      <th>${owner.firstname}${owner.lastname}</th> 
       </tr>
      
       <tr>
      <th>Address</th>
       <th>${owner.address}</th>
        </tr>
        
       <tr>
      <th>City</th>
         <th>${owner.city}</th>
    </tr>
  
  
        
      </table><br><br><br>
      
     <div >
             
                <button><a href="/update-Owner?id=${owner.id}">Edit Owner</a></button> &nbsp;&nbsp; <button><a href="new_pet">Add New Pet</a></button><br><br>
                
                
<h1>Pets and Visits</h1>
<table  class="table ">
  
  <div class="container-fluid">
    <tr>

      <th >Name</th>
      <td>${pet.name} <a href="/Pets-details?id=${pet.id}"> </a></td> 
       </tr>
      <tr>
      <th >Birth Date</th>
      <th>${pet.dateofBirth}</th>
      </tr>
      
       <tr>
      <th >Type</th>
        <td>${pet.petType.name}</td>
    </tr>
    
       
       
        
      </table><br>
                
     
     
     </div>
     
     
     
      
      
  
      

        
<%@ include file="common/footer.jspf"%>