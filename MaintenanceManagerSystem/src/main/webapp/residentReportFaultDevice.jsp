<%-- 
    Document   : reportFaultDevice
    Created on : Feb 7, 2023, 10:19:39 AM
    Author     : lmphi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang tạo báo thiết bị lỗi</title>
        <!-- Latest compiled and minified CSS -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- Latest compiled JavaScript -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script> 
        <script src="dist/js/BsMultiSelect.min.js"></script>
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
        <div class="container" style="padding-top: 10%; padding-bottom: 35%">
            <div class="row d-flex justify-content-center">
                <div class="col-md-6">
                    <div class="card">
                        <div class="card-header">
                            <h3>Báo cáo về thiết bị lỗi</h3>
                        </div>
                        <div class="card-body">
                            <form action="reportFaultDevice" method="Post">

                                <div class="form-group">
                                    <p>Số phòng: </p>
                                    <input type="text" class="form-control" placeholder="Ex: 101" name="RoomNum" required>
                                    <br/>
                                    <p>Họ và tên: </p>
                                    <input type="text" class="form-control" name="Name">
                                    <br/>
                                    <p>Email: </p>
                                    <input type="email" class="form-control" placeholder="abc@gmail.com" name="Email">
                                    <br/>
                                    <p>Số điện thoại: </p>
                                    <input type="text" class="form-control" name="PhoneNum" required>
                                    <br/>
                                    <p>Thiết bị bị hư: </p>
                                    <input type="text" class="form-control" placeholder="tivi, tủ lạnh" name="PhoneNum" required>
                                    <br/>
                                    <p>Vấn đề về thiết bị hư: </p>
                                    <textarea class="form-control" name="Description" required></textarea>
                                    <br/>
                                    <input type="submit" value="Sign up" class="btn btn-dark">
                                </div>
                            </form>
                        </div>
                        </body>
                        </html>
