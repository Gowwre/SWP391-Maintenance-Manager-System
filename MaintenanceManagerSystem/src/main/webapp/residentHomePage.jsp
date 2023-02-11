<%-- 
    Document   : residentHomePage
    Created on : Feb 6, 2023, 1:31:17 PM
    Author     : lmphi
--%>

    <%@page contentType="text/html" pageEncoding="UTF-8"%>
        <!DOCTYPE html>
        <html>

        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>Trang chủ</title>
            <!-- Latest compiled and minified CSS -->
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">

            <!-- Latest compiled JavaScript -->
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        </head>

        <body>
            <nav class="navbar navbar-expand-lg navbar-dark bg-dark p-3">
                <div class="container-fluid">
                    <a class="navbar-brand" href="residentHomePage.jsp">Logo</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                </div>
            </nav>
            <div class="container mt-5 d-grid">
                <div class="row">
                    <div class="border col text-center">
                        <h2>Người ở chung cư</h2>
                        <br/>
                        <div class="d-grid">
                            <p><a class="btn btn-primary btn-block" style="width: 300px" href="viewAllRooms.jsp">Xem các phòng</a></p>
                            <p><a class="btn btn-primary btn-block" style="width: 300px" href="residentReportFaultDevice.jsp">Tạo báo cáo thiết bị lỗi</a></p>
                        </div>
                    </div>
                    <div class="border col text-center border">
                        <h2>Đăng nhập</h2>
                        <br/>
                        <div class="d-grid">
                            <p><a class="btn btn-primary btn-block" style="width: 300px" href="maintenanceManagerLogin.jsp">Đăng nhập với tư cách người quản lý</a></p>
                            <p><a class="btn btn-primary btn-block" style="width: 300px" href="maintenanceStaffLogin.jsp">Đăng nhập với tư cách nhân viên sửa chữa</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </body>

        </html>