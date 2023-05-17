<%-- 
    Document   : index
    Created on : 13 may. 2023, 21:46:14
    Author     : Javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clases.bocadillos"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="formulario.css" />
         <link href="https://fonts.googleapis.com/css?family=Montserrat" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body>
       
            <div class="form-container">
                 <h1>Creación de Personajes</h1>
                <form action="crear_personajes.jsp" method="post">
                    <label for="nombre1">Nombre del personaje 1:</label>
                    <input type="text" name="nombre1" id="nombre1"><br>

                    <label for="frase1">Frase del personaje 1:</label>
                    <input type="text" name="frase1" id="frase1"><br>

                    <label for="nombre2">Nombre del personaje 2:</label>
                    <input type="text" name="nombre2" id="nombre2"><br>

                    <label for="frase2">Frase del personaje 2:</label>
                    <input type="text" name="frase2" id="frase2"><br>

                    <label for="nombre3">Nombre del personaje 3:</label>
                    <input type="text" name="nombre3" id="nombre3"><br>

                    <label for="frase3">Frase del personaje 3:</label>
                    <input type="text" name="frase3" id="frase3"><br>

                    <input type="submit" value="Crear personajes">
                </form>
            </div>

    </body>
</html>
