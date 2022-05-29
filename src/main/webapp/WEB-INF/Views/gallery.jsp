<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%@include file = "dash.jsp"  %> 
<section id="gallery" class="gallery">
      <div class="container">
<section class="breadcrumbs">
      
    </section>
        <div class="section-title">
          <h2>Gallery</h2>
          
        </div>
      </div>

      <div class="container-fluid">
        <div class="row no-gutters">
		
          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="${pageContext.request.contextPath }/image/hospital" class="venobox" data-gall="gallery-item">
                <img src="assets/img/gallery/gallery-1.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>
			
			<c:forEach var = "list" items="${displayInfo }">
          <div class="col-lg-3 col-md-6">
            <div class="gallery-item">
              <a href="assets/img/gallery/gallery-2.jpg" class="venobox" data-gall="gallery-item">
                <img src="${pageContext.request.contextPath }/image/hospital/${list.photo}" alt="" class="img-fluid">
              </a>
            </div>
          </div>
</c:forEach>	
         

      </div>
    </section>
    <%@include file = "contact.jsp" %>
    <%@include file = "footer.jsp" %>