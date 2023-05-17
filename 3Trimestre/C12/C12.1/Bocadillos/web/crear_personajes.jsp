<%-- 
    Document   : crear_personajes
    Created on : 13 may. 2023, 22:24:29
    Author     : Javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="clases.Personajes"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" />
        <title>Creación de Personajes</title>
    </head>
    <body>
        <%
        String nombre1 = request.getParameter("nombre1");
        String frase1 = request.getParameter("frase1");
        String nombre2 = request.getParameter("nombre2");
        String frase2 = request.getParameter("frase2");
        String nombre3 = request.getParameter("nombre3");
        String frase3 = request.getParameter("frase3");
        
        Personajes p1 = new Personajes(nombre1, "imagen1.jpg", frase1);
        Personajes p2 = new Personajes(nombre2, "imagen2.jpg", frase2);
        Personajes p3 = new Personajes(nombre3, "imagen3.jpg", frase3);
        
        
        Personajes[] personajes = {p1, p2, p3};
        %>
        <div class="content_dialogo">
            <div class="personaje">
                <img class="foto_izq" src="<%=p1.getImagen() %>"/>
                <div class="bocadillo_der1">
                    <%=p1.getSaludo() %>
                    <%=p1.getBocadillo() %>
                    <%=p1.generarDialogo() %>
                </div>
            </div>
            <div class="personaje">
                <img class="foto_izq" src="<%=p2.getImagen() %>"/>
                <div class="bocadillo_der2">
                    <%=p2.getSaludo() %>
                    <%=p2.getBocadillo() %>
                    <%=p2.generarDialogo() %>
                </div>
            </div>
            <div class="personaje">
                <img class="foto_izq" src="<%=p3.getImagen() %>"/>
                <div class="bocadillo_der3">
                    <%=p3.getSaludo() %>
                    <%=p3.getBocadillo() %>
                    <%=p3.generarDialogo() %>
                </div>
            </div>
        </div>
    </body>
</html>
