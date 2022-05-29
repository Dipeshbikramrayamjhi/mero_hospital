<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@include file = "dash.jsp"  %>  
<section id="services" class="services">
      <div class="container">
	  <section class="breadcrumbs">
      
    </section>
        <div class="section-title">
          <h2>Download Report Lab</h2>
          <p>Please download yours Lab Report</p>
        </div>
		<div>
		<c:forEach var="list" items="${displayReport}">
		<img src = "${pageContext.request.contextPath }/image/labReport/${list.lapReport}" alt="${list.lapReport}" height="250px">
		</c:forEach>
		</div>
        

      </div>
    </section>
    <%@include file = "contact.jsp" %>
    <%@include file = "footer.jsp" %>