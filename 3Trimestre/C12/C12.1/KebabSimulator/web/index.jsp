<%-- 
    Document   : index
    Created on : 17 may. 2023, 15:58:11
    Author     : Javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="estilos.css">
        <title>JSP Page</title>
    </head>
    <body>
        <%
          String[] imagenes = {"kebab", "patatas", "ensalada", "agua", "refresco", "cerveza"};
        %>

        <h1>Pide un delicioso kebab a domicilio</h1>

        <form action="pedido.jsp">
          <div class="flex-container">
            <%
              for (int i = 0; i < 3; i++) {
            %>
            <div>
              <h1><%= imagenes[i] %></h1>
              <img src="imagenes/<%= imagenes[i] %>.jpg" width="200px"><br>
              <input type="number" name="comida<%= i %>" value="0" min="0">
            </div>
            <%
              }
            %>
          </div>

          <div class="flex-container">
            <%
              for (int i = 3; i < 6; i++) {
            %>
            <div>
              <h1><%= imagenes[i] %></h1>
              <img src="imagenes/<%= imagenes[i] %>.jpg" width="100px"><br>
              <input type="number" name="comida<%= i %>" value="0" min="0">
            </div>
            <%
              }
            %>
          </div>

          <br><br>
          <div class="flex-container">
            <button type="submit">Hacer pedido</button>
          </div>
        </form>
    </body>
</html>
