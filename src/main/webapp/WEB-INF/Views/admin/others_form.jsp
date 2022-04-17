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
<title>Others Checkup Information  form</title>
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
  
  <h2><i class="glyphicon glyphicon-user"></i>OTHERS CHECKUP INFORMATION FORM</h2>

<form action="" method="post" class="form-group">

<div class="form-group">
<label>Cheakup Name</label>
<input type="text" name="othersName" class="form-control">
</div>
<div class="form-group">
<label>Description About Checkup </label>
<textarea name="aboutCheckup" class="form-control" rows="9"></textarea> 
</div>
<div class="form-group">
<button type="submit" name="submit" value="submit" class="btn btn-primary">Submit</button>
</div>
</form>
</div>
<div class="col-md-7">
  
  <h2><i class="glyphicon glyphicon-user"></i>OTHERS CHECKUP INFORMATION DISPLAY</h2>

<table class="table table-striped table-dark">
  <thead>
    <tr>
      <th scope="col">S.N</th>
      <th scope="col">NAME</th>
      <th scope="col">DESCRIPTION</th>
     <th scope="col">DELETE</th>
      <th scope="col">EDIT</th>
      
    </tr>
  </thead>
  <tbody>

< c:forEach var="list" items="${display}">
<tr>
<td>${list.oid}</td>
<td>${list.othersName}</td>
<td>${list.aboutCheckup}</td>
<td><a href="#?delete=${list.oid}">DELETE</a></td>
<td><a href="#?update=${list.oid}">UPDATE</a></td>
</tr>
</c:forEach>
  </tbody>
  </table>
</div>
</div>
</div>
</div>
 
</div>
</div>
</div>
 <%@include file = "footer.jsp" %>
</div>
</div>

</body>
</html>