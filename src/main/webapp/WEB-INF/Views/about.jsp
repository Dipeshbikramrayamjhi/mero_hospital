<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<%@include file = "dash.jsp" %>

 <section id="about" class="about">
      <div class="container-fluid">
<section class="breadcrumbs">
      <h1>ABOUT</h1>
    </section>
        <div class="row">
          <div class="col-xl-5 col-lg-6 video-box d-flex justify-content-center align-items-stretch">
            <a href="https://www.youtube.com/watch?v=jDDaplaOz7Q" class="venobox play-btn mb-4" data-vbtype="video" data-autoplay="true"></a>
          </div>
			
          <div class="col-xl-7 col-lg-6 icon-boxes d-flex flex-column align-items-stretch justify-content-center py-5 px-lg-5">
            <h3>ABOUT  HOSPITAL</h3>
            <p>${displayInfo.get(1).description }Norvic is regarded as the most credible Healthcare Centre in the country, committed to Quality Health Care in the Nation’s service with personalized and compassionate patient care. It is also acclaimed for pioneering the private healthcare revolution in the country. Henceforth, Norvic is hailed as one of the top best hospitals in Kathmandu, Nepal.

Since it's inception in 1993, Norvic has risen to a leadership position and has emerged as Nepal’s foremost healthcare service provider touching the lives of more than 2 million patients across Nepal and abroad.</p>

            <div class="icon-box">
              <div class="icon"><i class="bx bx-fingerprint"></i></div>
              <h4 class="title"><a href="">WHY CHOOSE ${displayInfo.get(1).name } </a></h4>
              
              <ul class="description">
              
              <li>The first Hospital in Nepal with NABL accreditation with high-tech laboratory services and is also certified for ISO 9001:2015 standards.</li>
              <li>The first private sector hospital to introduce the Catheterization Lab in the country; it offers one of the world’s best Invasive and Non-Invasive Cardiac facilities to the nation.</li>
              <li>The first hospital in the country to have the National Accreditation Board for Testing Laboratories (NABL), certified pathology lab, that provides a wide range of full-fledged Pathological and Diagnostic facilities.</li>
              <li>The first private hospital to implement a safe health care waste management system.</li>
              </ul>
              
              
            </div>

            
          </div>
        </div>

      </div>
    </section>
     <%@include file = "contact.jsp" %>
    <%@include file = "footer.jsp" %>