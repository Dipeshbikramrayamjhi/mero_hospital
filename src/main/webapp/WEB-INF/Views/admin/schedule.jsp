<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
 <link href="${pageContext.request.contextPath }/assests/bootsrap/css/bootstrap.min.css" rel="stylesheet">
 <link href="${pageContext.request.contextPath }/assests/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="${pageContext.request.contextPath }/assests/css/sb-admin-2.min.css" rel="stylesheet">
 
<meta charset="ISO-8859-1">
<title>Doctor Information form</title>
</head>
<body>
<div id="wrapper">

       <!-- sidebar  is  here-->
       <%@include file = "sidebar.jsp" %>
       <!-- side is ended here -->

        <!-- Content Wrapper -->
        <div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

               <!-- top bar start is here -->
              <jsp:include page = "topbar.jsp"></jsp:include> 
               <!-- top bar end here -->

                <!-- Begin Page Content -->
 <div class="container-fluid">
 <div class="row">
 <div class="col-md-5">
  
  <h2><i class="glyphicon glyphicon-user"></i> SCHEDULE INFORMATION FORM</h2>

<form action="" method="post" class="form-group">
<div class="form-group">
<label>Department</label>
<select name="department"  class="form-control" id = "dptid">
<option selected disabled>Choose</option>
<c:forEach var = "list" items ="${displayDpt}">
<option value="${list.did}">${list.departmentName}</option>
</c:forEach>
</select>
</div>
<div class="form-group">
<label>Doctor</label>
<div id="dridDiv">

<select name="department"  class="form-control" id ="drid">
<option>choose</option>
</select>
</div>
</div>
<div class="form-group">
<label>Start Date</label>
<input type="date" name="graduation" class="form-control">
</div>
<div class="form-group">
<label>End Date</label>
<input type="date" name="specialist" class="form-control">
</div>
<div class="form-group">
<label>Start Time</label>
<input type="time" name="department" class="form-control">
</div>
<div class="form-group">
<label>End Time</label>
<input type="time" class="form-control">
</div>
<div class="form-group">
<button type="submit" name="submit" value="submit" class="btn btn-primary">Submit</button>
</div>


</form>
</div>
</div>
</div>
</div>
 <%@include file = "footer.jsp" %>
</div>
</div>
<script>
$(document).ready(function(){
	$('#dptid').on('change',function(){
		var dptid = $('#dptid').val();
		var data1 = {dptid:dptid}
		$.ajax({
			type:'GET',
			contentType:'application/json',
			data:data1,
			url: 'http://localhost:8080/meroHospital/admin/ajax',
			success:function(data3){
				var docs = data3.result
				console.log( docs.length);
				select = document.getElementById('drid');

				for (var i = 0; i<=docs.length; i++){
				    var opt = document.createElement('option');
				    opt.value = docs[i].did;
				    opt.innerHTML = docs[i].doctorName;
				    select.appendChild(opt);
				}
				 
			         
			     
			}
		})
	})
	
})
</script>

</body>

</html>