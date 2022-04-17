 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<head>
<link href="${pageContext.request.contextPath }/assests/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
    <link href="${pageContext.request.contextPath }/assests/css/sb-admin-2.min.css" rel="stylesheet">

</head>

 <!-- Sidebar -->
        <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

            <!-- Sidebar - Brand -->
            <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
                <div class="sidebar-brand-icon rotate-n-15">
                    <i class="fa fa-heartbeat"></i>
                </div>
                <div class="sidebar-brand-text mx-3">Mero Hospital</div>
            </a>

            <!-- Divider -->
            <hr class="sidebar-divider my-0">

            <!-- Nav Item - Dashboard -->
            <li class="nav-item active">
                <a class="nav-link" href="dashboard">
                    <i class="fa fa-plus-square"></i>
                    <span>Dashboard</span></a>
            </li>

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading -->
            <div class="sidebar-heading">
               MENU
            </div>

            <!-- Nav Item - Pages Collapse Menu -->
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseTwo"
                    aria-expanded="true" aria-controls="collapseTwo">
                    <i class="fa fa-h-square"></i>
                    <span>Hospital Information</span>
                </a>
                <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Hospital Info Operation:</h6>
                        <a class="collapse-item" href="${pageContext.request.contextPath }/admin/info_form">INSERT FORM</a>
                        <a class="collapse-item" href="${pageContext.request.contextPath }/admin/info_display">DISPLAY DETAIL</a>
                    </div>
                </div>
            </li>

              <li class="nav-item">
                <a class="nav-link collapsed" href="${pageContext.request.contextPath }/admin/department">
                    <i class="fa fa-user-md"></i>
                    <span>Department Information </span>
                </a>
                <!-- <div id="department" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Department Info Operation:</h6>
                        <a class="collapse-item" href="${pageContext.request.contextPath }/admin/department">INSERT FORM</a>
                        <!-- <a class="collapse-item" href="${pageContext.request.contextPath }/admin/department_display">DISPLAY DETAIL</a> 
                    </div>
                </div> -->
                 
               
            </li>
                    
            
           
            
             <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities"
                    aria-expanded="false" aria-controls="collapseUtilities">
                    <i class="fa fa-user-md"></i>
                    <span>Doctor Information </span>
                </a>
                 <div id="collapseUtilities" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Doctor Info Operation:</h6>
                        <a class="collapse-item" href="${pageContext.request.contextPath }/admin/doctor_form">INSERT FORM</a>
                        <a class="collapse-item" href="${pageContext.request.contextPath }/admin/doctor_display">DISPLAY DETAIL</a>
                    </div>
                </div>
               
            </li>
            
            <li class="nav-item">
                <a class="nav-link collapsed" href="#" >
                    <i class="fa fa-wheelchair"></i>
                    <span>Appointment Information </span>
                </a>
               
            </li>
            
             <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#checkup"
                    aria-expanded="false" aria-controls="collapseUtilities">
                    <i class="fa fa-heart"></i>
                    <span>Other Checkup </span>
                </a>
               <div id="checkup" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Others Info Operation:</h6>
                        <a class="collapse-item" href="${pageContext.request.contextPath }/admin/others_form">OTHERS CHECKUP</a>
                        <a class="collapse-item" href="${pageContext.request.contextPath }/admin/others_display">APPOINTMENT DISPLAY</a>
                    </div>
                </div>
            </li>
            
             <li class="nav-item">
                <a class="nav-link collapsed" href="#" >
                    <i class="fa fa-question-circle"></i>
                    <span>Enquire </span>
                </a>
               
            </li>
            

            <!-- Divider -->
            <hr class="sidebar-divider">

            <!-- Heading
            <div class="sidebar-heading">
                Addons
            </div> -->
            

            <!-- Nav Item - Pages Collapse Menu -->
        <!--  <li class="nav-item">
                <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapsePages"
                    aria-expanded="true" aria-controls="collapsePages">
                    <i class="fas fa-fw fa-folder"></i>
                    <span>Pages</span>
                </a>
                <div id="collapsePages" class="collapse" aria-labelledby="headingPages" data-parent="#accordionSidebar">
                    <div class="bg-white py-2 collapse-inner rounded">
                        <h6 class="collapse-header">Login Screens:</h6>
                        <a class="collapse-item" href="login.html">Login</a>
                        <a class="collapse-item" href="register.html">Register</a>
                        <a class="collapse-item" href="forgot-password.html">Forgot Password</a>
                        <div class="collapse-divider"></div>
                        <h6 class="collapse-header">Other Pages:</h6>
                        <a class="collapse-item" href="404.html">404 Page</a>
                        <a class="collapse-item" href="blank.html">Blank Page</a>
                    </div>
                </div>
            </li>
         -->   
           

            <!-- Divider -->
            <hr class="sidebar-divider d-none d-md-block">

            <!-- Sidebar Toggler (Sidebar) -->
            <div class="text-center d-none d-md-inline">
                <button class="rounded-circle border-0" id="sidebarToggle"></button>
            </div>

            <!-- Sidebar Message -->
           

        </ul>
        <!-- End of Sidebar -->