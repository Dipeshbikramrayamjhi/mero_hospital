<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
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
<title>Hosiptal INFO form</title>
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
  
  <h2><i class="glyphicon glyphicon-user"></i>Subject Insert</h2>

<form action="" method="post" class="form-group" enctype="multipart/form-data">
<div class="form-group">

<div class="form-group">
<label>Program Name</label>
<select name="pid" class="form-control">
<option selected disabled >CHOOSE</option>
</select>
</div>
<div class="form-group">
<label>SEMESTER</label>
<select name="semid" class="form-control">
<option selected disabled>CHOOSE</option>
</select>
</div>
<div class="form-group">
<label for="sub_code"> subject Code</label>
<input type="text" name="sub_code" class="form-control">
</div>
<div class="form-group">
<label for="sname"> subject Name</label>
<input type="text" name="sname" class="form-control">
</div>
<div class="form-group">
<label for="scredit_hour"> subject Credit hour</label>
<input type="number" name="scredit_hour" class="form-control">
</div>
<div class="form-group">
<button type="submit" name="submit" value="submit" class="btn btn-primary">submit</button>
</div>
</div>

</form>
</div>
</div>
</div>
</div>
 <%@include file = "footer.jsp" %>
</div>
</div>

</body>
</html>