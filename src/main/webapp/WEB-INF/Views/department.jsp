<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
     <%@include file = "dash.jsp" %>
<section id="departments" class="departments">
      <div class="container">
<section class="breadcrumbs">
      
    </section>
        <div class="section-title">
          <h2>Departments</h2>
          <p>There are different interpretations when talking about the departments in a hospital setting. Whether you are visiting the hospital to undergo a mandatory operation or a cosmetic surgery like rhinoplasty, some view hospital departments as the inpatient or outpatient wards, while some think that departments mean each unit within the medical setting.</p>
        </div>

        <div class="row">
          <div class="col-lg-3">
            <ul class="nav nav-tabs flex-column">
            <h2>LIST OF DEPARTMENT</h2>
            <c:set var = "count" value = "1"/>
            <c:forEach var="list" items = "${displayDpt }" >
              <li class="nav-item">
                <a class="nav-link active show" data-toggle="tab" href="#tab-${count }">${list.departmentName }</a>
              </li>
              <c:set var = "count" value = "${count + 1 }"/>
              </c:forEach>
            </ul>
          </div>
          <div class="col-lg-9 mt-4 mt-lg-0">
            <div class="tab-content">
             <c:set var = "count" value = "1"/>
            <c:forEach var="list" items = "${displayDpt }" >
              <div class="tab-pane active show" id="tab-${count }">
                <div class="row">
                  <div class="col-lg-12 details order-2 order-lg-1">
                    <h3>${list.departmentName }</h3>
                    <h7>Related Disease</h7>
                    <p class="font-italic">${list.relatedDisease }</p>
                    <h7>Description</h7>
                    <p>${list.aboutDepartment}</p>
                
                  </div>
                  
                  <div class="col-lg-4 text-center order-1 order-lg-2">
                    
                  </div>
                </div>
              </div>
              <c:set var = "count" value = "${count + 1 }"/>
              </c:forEach>
            </div>
             
          </div>
        </div>

      </div>
    </section>
    <%@include file = "contact.jsp" %>
    <%@include file = "footer.jsp" %>