<%-- 
    Document   : index
    Created on : 28-11-2018, 13:17:58
    Author     : Lynch
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index Login</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link rel="stylesheet" href="css/style.css"/>
        <script src="js/main.js"></script>
    </head>
    <body id="LoginForm">
        <div class="container">
            <h1 class="form-heading">Michel Charnay</h1>
            <div class="login-form">
                <div class="main-div">
                    <div class="panel">
                        <h2>Login</h2>
                        <p>Por favor, ingrese su email y contraseña</p>
                    </div>
                    <form action="valida" method="post" id="Login">

                        <div class="form-group">


                            <input type="text" class="form-control" id="txt_user" name="txt_user" placeholder="Dirección Email">

                        </div>

                        <div class="form-group">

                            <input type="password" class="form-control" id="txt_contrasena" name="txt_contrasena" placeholder="Contraseña">

                        </div>
                        <!--
                        <div class="forgot">
                            <a href="reset.html">Forgot password?</a>
                        </div>
                        
                        -->
                        <button type="submit" class="btn btn-primary">Ingrear</button>
                    </form>
                </div>
                
            </div></div></div>

</body>
</html>
