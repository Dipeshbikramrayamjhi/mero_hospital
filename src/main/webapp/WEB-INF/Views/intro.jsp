<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 

 <%@include file = "dash.jsp" %>

    <section id="hero" class="d-flex align-items-center">
    <div class="container">
      <h1>${displayInfo.get(1).name}</h1>
      <h2>WELCOME FOR OUR SERVICE</h2>
      <a href="${pageContext.request.contextPath }/gallery" class="btn-get-started scrollto">VIEW GALLERY</a>
    </div>
  </section><!-- End Hero -->

  <main id="main">

    <!-- ======= Why Us Section ======= -->
    <section id="why-us" class="why-us">
      <div class="container">

        <div class="row">
          <div class="col-lg-4 d-flex align-items-stretch">
            <div class="content">
              <h3>Why ${displayInfo.get(1).name}</h3>
              <p>
                ${displayInfo.get(1).description}
              </p>
              <div class="text-center">
                <a href="${pageContext.request.contextPath }/about" class="more-btn">Learn More <i class="bx bx-chevron-right"></i></a>
              </div>
            </div>
          </div>
          
        </div>
      </div>
    </section><!-- End Why Us Section -->
      <script src="/meroHospital/resources/vendor/jquery/jquery.min.js"></script>
     
    <script>
    
    $(document).ready(function(){
    	var img ="url('${pageContext.request.contextPath }/image/hospital/${displayInfo.get(1).photo}') top center";
    	
    	$('#hero').css('background',img);
    	$('#hero').css('width','100%');
    	$('#hero').css('height','90vh');
    	$('#hero').css('background-size','cover');
    	$('#hero').css('position','relative');
    	$('#hero').css('margin-bottom','-200px');
})
    </script>
    <%@include file = "contact.jsp" %>
    <%@include file = "footer.jsp" %>