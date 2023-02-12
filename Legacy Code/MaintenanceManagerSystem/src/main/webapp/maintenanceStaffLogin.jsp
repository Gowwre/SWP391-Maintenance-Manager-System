<%--
  Created by IntelliJ IDEA.
  User: Radriar
  Date: 2/6/2023
  Time: 3:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <style>
        .form-group {
            margin-bottom: 1.5rem;
        }
        .btn {
            margin-top: 1rem;
            transition: all 0.2s ease-in-out;
        }
        .btn:hover {
            transform: translateY(-3px);
            box-shadow: 0 1rem 2rem rgba(0, 0, 0, 0.2);
        }
        .btn:active {
            transform: translateY(-1px);
            box-shadow: 0 0.5rem 1rem rgba(0, 0, 0, 0.2);
        }
    </style>
    <title>Login Form</title>
</head>
<body>
<section class="container mt-5">
    <section class="row">
        <article class="col-md-6 mx-auto">
            <section class="card">
                <header class="card-header">
                    <h3>Đăng Nhập</h3>
                </header>
                <section class="card-body">
                    <form action="login" method="post">
                        <section class="form-group">
                            <label for="email">Email</label>
                            <input type="email" required name="email" class="form-control" id="email">
                        </section>
                        <section class="form-group">
                            <label for="password">Mật Khẩu</label>
                            <input type="password" required name="password" class="form-control" id="password">
                        </section>
                        <button type="submit" class="btn btn-primary">Đăng Nhập</button>
                        <c:if test="${requestScope.LOGIN_ERROR != null}">
                            <br>
                            <p>${requestScope.LOGIN_ERROR}</p>
                        </c:if>
                        <footer class="text-center mt-3">
                            <a href="forgotPassword.jsp" class="btn btn-link">Quên Mật Khẩu</a>
                            <a href="#" class="btn btn-link">Đăng Ký</a>
                        </footer>
                    </form>
                </section>
            </section>
        </article>
    </section>
</section>
</body>
</html>