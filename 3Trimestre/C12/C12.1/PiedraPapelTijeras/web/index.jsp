<%-- 
    Document   : index
    Created on : 15 may. 2023, 19:20:15
    Author     : Javier
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Clases.Personajes"%>
<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css" />
        <title>Juego piedra papel tijeras</title>
    </head>
    <body>
        <div class="contenedor">
            <h1 class="titulo">Piedra, Papel, Tijera</h1>
            
            <div class="jugadas">
                <%-- Crear objetos de los jugadores --%>
                <% Personajes jugador1 = new Personajes("Jugador 1", "imagen1.jpg"); %>
                <% Personajes jugador2 = new Personajes("Jugador 2", "imagen2.jpg"); %>
                
                <%-- Variables para contar los puntos --%>
                <% int puntosJugador1 = 0; %>
                <% int puntosJugador2 = 0; %>
                
                <%-- Realizar las jugadas --%>
                <% while (puntosJugador1 < 5 && puntosJugador2 < 5) { %>
                    <%-- Obtener las jugadas de cada jugador --%>
                    <% String jugadaJugador1 = jugador1.generarJugada(); %>
                    <% String jugadaJugador2 = jugador2.generarJugada(); %>
                    
                    <%-- Determinar el resultado de la jugada --%>
                    <% String resultado = ""; %>
                    <% if (jugadaJugador1.equals("Piedra") && jugadaJugador2.equals("Tijera")) { %>
                        <% resultado = "Jugador 1 gana"; %>
                        <% puntosJugador1++; %>
                    <% } else if (jugadaJugador1.equals("Tijera") && jugadaJugador2.equals("Piedra")) { %>
                        <% resultado = "Jugador 2 gana"; %>
                        <% puntosJugador2++; %>
                    <% } else if (jugadaJugador1.equals("Papel") && jugadaJugador2.equals("Piedra")) { %>
                        <% resultado = "Jugador 1 gana"; %>
                        <% puntosJugador1++; %>
                    <% } else if (jugadaJugador1.equals("Piedra") && jugadaJugador2.equals("Papel")) { %>
                        <% resultado = "Jugador 2 gana"; %>
                        <% puntosJugador2++; %>
                    <% } else if (jugadaJugador1.equals("Tijera") && jugadaJugador2.equals("Papel")) { %>
                        <% resultado = "Jugador 1 gana"; %>
                        <% puntosJugador1++; %>
                    <% } else if (jugadaJugador1.equals("Papel") && jugadaJugador2.equals("Tijera")) { %>
                        <% resultado = "Jugador 2 gana"; %>
                        <% puntosJugador2++; %>
                    <% } else { %>
                        <% resultado = "Empate"; %>
                    <% } %>
                    
                    <%-- Mostrar la jugada y el resultado --%>
                    <div class="jugada">
                        <div class="jugador1">
                            <img class="imagen" src="<%= jugador1.getImagen() %>"/>
                            <p><%= jugador1.getNombre() %> - <%= jugadaJugador1 %></p>
                            <p>Puntos: <%=puntosJugador1 %></p>
                        </div>
                        <div class="resultado"><%= resultado %></div>
                        <div class="jugador2">
                            <img class="imagen" src="<%= jugador2.getImagen() %>"/>
                            <p><%= jugador2.getNombre() %> - <%= jugadaJugador2 %></p>
                            <p>Puntos: <%=puntosJugador2 %></p>
                        </div>
                        
                    </div>
                    
                    <%-- Separador entre jugadas --%>
                    <% if (puntosJugador1 < 5 || puntosJugador2 < 5) { %>
                        <hr class="separador">
                    <% } %>
                    
                <% } %>
                
                <%-- Mostrar los puntos acumulados --%>
                <div class="puntos">
                    <p><%= jugador1.getNombre() %>: <%= puntosJugador1 %> puntos</p>
                    <p><%= jugador2.getNombre() %>: <%= puntosJugador2 %> puntos</p>
                </div>
                
                <%-- Determinar al ganador --%>
                <% if (puntosJugador1 == 5) { %>
                    <h2 class="ganador"><%= jugador1.getNombre() %> es el ganador!</h2>
                    <img class="celebracion" src="celebracion1.gif" alt="Celebración">
                <% } else if (puntosJugador2 == 5) { %>
                    <h2 class="ganador"><%= jugador2.getNombre() %> es el ganador!</h2>
                    <img class="celebracion" src="celebracion2.gif" alt="Celebración">
                <% } %>
                
            </div>
        </div>
    </body>
</html>
