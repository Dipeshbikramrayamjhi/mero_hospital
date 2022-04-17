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
 <div class="col-md-12">
  
  <h2><i class="glyphicon glyphicon-user"></i>DOCTOR INFORMATION DISPLAY</h2>

<table class="table table-striped table-dark">
  <thead>
    <tr>
      <th scope="col">S.N</th>
      <th scope="col">PHOTO</th>
      <th scope="col">NAME</th>
      <th scope="col">GRADUATION / DEGREE</th>
      <th scope="col">SPECIALIST</th>
      <th scope="col">DEPARTMENT</th>
      <th scope="col">WORK EXPERIENCE</th>
      <th scope="col">AWARDS INFORMATION</th>
      <th scope="col">DELETE</th>
      <th scope="col">EDIT</th>
      
    </tr>
  </thead>
  <!-- <tbody>
 < c:forEach var="list" items="${infolist}">
<tr>
<td>${list.iid}</td>
<td>${list.photo}</td>
<td>${list.name }</td>
<td>${list.address }</td>
<td>${list.contactNumber }</td>
<td>${list.email }</td>
<td>${list.description }</td>
<td><a href="info_display?delete=${list.iid}">DELETE</a></td>
<td><a href="info_update?update=${list.iid}">UPDATE</a></td>
</tr>
</c:forEach>
  </tbody> -->
  </table>
</div>
</div>
</div>
</div>
 <%@include file = "footer.jsp" %>
</div>
</div>

</body>
</html>