<%-- 
    Document   : pedido
    Created on : 17 may. 2023, 15:58:38
    Author     : Javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="style.css">
        <title>Pedido</title>
    </head>
    <body>
        <%
            int[] cantidades = new int[4];
            double[] precios = {5.50, 3.20, 4.50, 1.5};
            String[] descripciones = {"Kebab", "Patatas fritas", "Ensalada", "Bebida"};

            for (int i = 0; i < 4; i++) {
              cantidades[i] = Integer.parseInt(request.getParameter("comida" + i));
            }
        %>
        <div class="container">
          <h1>Aquí tiene su pedido</h1>
          <hr>
          <div class="row">
            <div class="col">Comida/bebida</div>
            <div class="col">PVP</div>
            <div class="col">Cantidad</div>
            <div class="col">Subtotal</div>
          </div>

          <%
            for (int i = 0; i < 4; i++) {
              if (cantidades[i] > 0) {
          %>
          <div class="row">
            <div class="col"><%= descripciones[i].toUpperCase() %></div>
            <div class="col"><%= precios[i] %> €</div>
            <div class="col"><%= cantidades[i] %></div>
            <div class="col"><%= cantidades[i] * precios[i] %> €</div>
          </div>
          <%
              } // if
            } // for
          %>

          <%
            double total = 0;

            for (int i = 0; i < 4; i++) {
              total += cantidades[i] * precios[i];
            }
          %>

          <div class="row total">
            <div class="col">
              <b>Total: <%= String.format("%.2f", total) %> €</b>
            </div>
          </div>

        </div>
        
    </body>
</html>
