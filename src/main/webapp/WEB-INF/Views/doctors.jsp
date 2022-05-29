<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@include file = "dash.jsp"  %>
<section id="doctors" class="doctors">
      <div class="container">
<section class="breadcrumbs">
      
    </section>
        <div class="section-title">
          <h2>Doctors</h2>
          <p>We Provide you a experience Doctors</p>
        </div>
        <div class = row>
        <div class="col-md-4">
		<form class="form-group">
		<div class="form-group">
		<Label>Speciality</Label>
		<select class="form-control">
		<option>All department</option>
		</select>
		</div>
		</form>
		</div>
		<div class="col-md-4">
		<form class="form-group">
		<div class="form-group">
		<Label>Name of Doctor</Label>
		<input type ="text" name="searchDoctor" class="form-control" placeholder="Search By Name">
		 <div class="form-group">
             <button type="submit" class="btn btn-primary">
              Search
             </button>
          </div>
		</div>
		</form>
		</div>
		</div>
        <div class="row">
<c:forEach var="list" items = "${displayDoctor }" >
          <div class="col-lg-6">
            <div class="member d-flex align-items-start">
              <div class="pic"><img src="${pageContext.request.contextPath }/image/doctor/${list.doctorPhoto}" alt="${list.doctorPhoto}" class="img-thumbnail" ></div>
              <div class="member-info">
              
                <h4>${list.doctorName }</h4>
                <span>${list.department.departmentName }</span>
                <p>Specialist: ${list.specialist }</p>
                <button type="button" class="btn btn-info" data-toggle="modal" data-target="#showDrInfo" data-delete="${list.did }">
					View Profile
				</button>
                <button class="btn btn-warning"><a href="${pageContext.request.contextPath }/appointment" >Make an Appointment</a></button>
              </div>
            </div>
          </div>
</c:forEach>
         

        </div>

      </div>
    </section>
    <%@include file = "contact.jsp" %>
    <%@include file = "footer.jsp" %>
    <!-- Modal -->
<div class="modal fade" id="showDrInfo" tabindex="-1" role="dialog" aria-labelledby="exampleModalCenterTitle" aria-hidden="true">
  <div class="modal-dialog modal-dialog-centered" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLongTitle">Personal Info </h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <div class="row">
        <c:forEach var="list1" items = "${viewDrInfo}" >
        	<div class="col-md-5">
	        	
	        	<p>Name of Doctor</p>
        	</div>
        	<div class="col-md-5">
	        	<p>Address: kathmandu</p>
	        		 <p>Address: kathmandu</p>
	        	
	        		        	<p>Address: kathmandu</p>
	        	
        	</div>
        </c:forEach>
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-warning" id="delBtn"><a href="${pageContext.request.contextPath }/appointment" >Make an Appointment</a></button>
      </div>
    </div>
  </div>
</div>
<script>
$("#showDrInfo").on("show.bs.modal",function(e)
{
var showid = $(e.relatedTarget).data('delete');
$("#showDrInfo").attr('onClick','location.href = "${pageContext.request.contextPath}/doctors/' + showid + '"');
});
</script>