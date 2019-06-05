<%-- 
    Document   : carritoCompras
    Created on : 02-06-2019, 11:31:42
    Author     : Nacho
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="negocio.Venta"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>CLIENTE</th>
                    <th>TELEFONO</th>
                    <th>DIRECCIÓN</th>
                    <th>COMUNA</th>
                    <th>REGIÓN</th>
                    <th>CORREO</th>
                    <th>ARTISTA</th>
                    <th>ALBUM</th>
                    <th>AÑO EDICIÓN</th>
                    <th>FORMATO</th>
                    <th>PRECIO UNIDAD</th>
                    <th>FECHA VENTA</th>
                    <th>CANTIDAD</th>
                    <th>FORMA DE PAGO</th>
                    <th>VALOR A PAGAR</th>
                </tr>
            </thead>
            <tbody>
                <%
                    if (request.getSession().getAttribute("sesionMedica") == null) {
                        out.println("No existen registros");
                    } else {
                        ArrayList<Venta> lista = (ArrayList<Venta>) request.getSession().getAttribute("sesionMedica");
                        for (Venta v: lista) {
                %>
                <tr>
                    <td><%=v.getCliente().getNombre()%></td>
                    <td><%=v.getCliente().getTelefono()%></td>
                    <td><%=v.getCliente().getDireccion()%></td>
                    <td><%=v.getCliente().getComuna()%></td>
                    <td><%=v.getCliente().getRegion()%></td>
                    <td><%=v.getCliente().getCorreo()%></td>
                    <td><%=v.getAlbum().getArtista()%></td>
                    <td><%=v.getAlbum().getNombreAlbum()%></td>
                    <td><%=v.getAlbum().getAñoEdicion()%></td>
                    <td><%=v.getAlbum().getFormato()%></td>
                    <td><%=v.getAlbum().getPrecio()%></td>
                    <td><%=v.getFechaVenta()%></td>
                    <td><%=v.getCantidad()%></td>
                    <td><%=v.getFormaPago()%></td>
                    <td><%=v.calcularTotal()%></td>
                </tr>
                <%
                        }//fin for
                    }//fin else
                %>
            </tbody>
        </table>
    </body>
</html>
