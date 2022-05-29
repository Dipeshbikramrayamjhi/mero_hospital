<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<title>Department Information  form</title>
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
 <div class="col-md-4">
  
  <h2><i class="glyphicon glyphicon-user"></i>DEPARTMENT UPDATE FORM</h2>

<form action="" method="post" class="form-group">
<input type="text" name="did" class="form-control" value = "${singlelist.did }" HIDDEN>
<div class="form-group">
<label>Department Name</label>
<input type="text" name="departmentName" class="form-control" value = "${singlelist.departmentName }">
</div>
<div class="form-group">
<label>Related Disease</label>
<input type="text" name="relatedDisease" class="form-control" value = "${singlelist.relatedDisease }">
</div>
<div class="form-group">
<label>About The Department</label>
<textarea name="aboutDepartment" class="form-control" rows="9">${singlelist.aboutDepartment}</textarea> 
</div>
<div class="form-group">
<button type="submit" name="submit" value="submit" class="btn btn-primary">UPDATE</button>
</div>
</form>
</div>

 
</div>
 <%@include file = "footer.jsp" %>
</div>
</div>

</body>
</html>