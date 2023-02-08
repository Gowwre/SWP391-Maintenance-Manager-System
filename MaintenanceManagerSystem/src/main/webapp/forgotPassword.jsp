<%--
  Created by IntelliJ IDEA.
  User: Radriar
  Date: 2/6/2023
  Time: 4:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Forget Password</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 class="text-center mt-5">Quên Mật Khẩu</h1>
    <br>
    <form action="" method="post">
        <p class="text-center">Điền email ở dưới. Sau đó ấn "Gửi" để được nhận đường link đặt lại mật khẩu.</p>
        <br>
        <div class="form-group d-flex justify-content-center">
            <input type="email" name="emailToResetPassword" class="form-control mr-3 w-25" placeholder="Email">
            <button type="submit" class="btn btn-primary">Gửi</button>
        </div>
    </form>
</div>
</body>
</html>
