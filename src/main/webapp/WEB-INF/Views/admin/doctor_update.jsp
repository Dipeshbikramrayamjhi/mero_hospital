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
 <div class="col-md-5">
  
  <h2><i class="glyphicon glyphicon-user"></i> DOCTOR  UPDATE INFORMATION FORM</h2>

<form action="" method="post" class="form-group" enctype = "multipart/form-data"> 
<input type="text" name="did" class="form-control" value = "${singlelist.did }"  hidden	>
<div class="form-group">
<label>Doctor Name</label>
<input type="text" name="doctorName" class="form-control" value = "${singlelist.doctorName }">
</div>
<div class="form-group">
<label>Photo</label>
<img alt="${singlelist.doctorPhoto }" src="${pageContext.request.contextPath }/image/doctor/${singlelist.doctorPhoto }" height = "100px">
<input type="file" name="doctorPhoto" class="form-control" value="${singlelist.doctorPhoto }" >
</div>
<div class="form-group">
<label>Graduation / Degree</label>
<input type="text" name="graduation" class="form-control" value = "${singlelist.graduation }">
</div>
<div class="form-group">
<label>Specialist</label>
<input type="text" name="specialist" class="form-control" value = "${singlelist.specialist }">
</div>
<div class="form-group">
<label>Department Name</label>
<select name="dpt_id"  class="form-control"  >
<c:forEach var="dpt" items="${dptlist}">
<option value = "${dpt.did}" 
<c:if test = "${dpt.departmentName.equals(singlelist.department) }"> Selected </c:if>
 >${dpt.departmentName}</option>
</c:forEach>
</select>
</div>
<div class="form-group">
<label>Work Experience</label>
<textarea name="workExperience" class="form-control" rows="9">${singlelist.workExperience }</textarea> 
</div>
<div class="form-group">
<label>Awards Information</label>
<input type="text" name="awardInfo" class="form-control"value = "${singlelist.awardInfo }">
</div>
<div class="form-group">
<button type="submit" name="submit" value="submit" class="btn btn-primary">UPDATE</button>
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