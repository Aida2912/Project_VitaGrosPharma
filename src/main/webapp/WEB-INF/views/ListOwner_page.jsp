
<%@ include file="./common/header.jspf"%>
<%@ include file="./common/navigation.jspf"%>


<br>
<br>


<nav class="navbar bg-light">
  <div class="container-fluid">
    <form class="d-flex" role="search" action="search">
      <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" name="searchname">
      <button class="btn btn-outline-success" type="submit">Search</button>
    </form>
  </div>
</nav>



<table class="table ">
  <thead class="table-success">
    <tr>
   
      <th >Name</th>
      <th >Address</th>
      <th >City</th>
       <th>Telephone</th>
        <th  >Pets</th>
         
         <th  >Details</th>
  
    </tr>
  </thead>
  
        <tbody>
        <c:forEach items="${owners}" var="owner">
        
        <tr>
        
        <td >${owner.firstname} ${owner.lastname} </td> 
        <th>${owner.address}</th>
        <th>${owner.city}</th>
        <td>${owner.telephone}</td>
         <td>${owner.pets.name}</td>
          
           <td><a href="/Owner-details?id=${owner.id}">View_details</a></td>
        </tr>
        </c:forEach>
        </tbody>
        
      </table><br><br><br>
      
     <div >
              
                <button class="btn btn-primary"><a href="/add_Owners" style="color:white ">Add Owner</a></button> &nbsp;&nbsp;
                <button class="btn btn-primary"><a href="/logout" style="color:white ">Logout</a></button>       
     
                 
     
     </div>
      
      
  
      

        
<%@ include file="common/footer.jspf"%>