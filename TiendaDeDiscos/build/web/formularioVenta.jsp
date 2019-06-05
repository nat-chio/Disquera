<%-- 
    Document   : formularioVenta
    Created on : 02-06-2019, 13:15:43
    Author     : Nacho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="servlet_preceso.do" method="POST">
            <table border="1">
                <tr>
                    <td>Nombre: </td>
                    <td><input type="text" name="txt_nombre"></td>
                </tr>
                <tr>
                    <td>Correo: </td>
                    <td><input type="text" name="txt_correo"></td>
                </tr>
                <tr>
                    <td>Región: </td>
                    <td><input type="text" name="txt_region"></td>
                </tr>
                <tr>
                    <td>Comuna:</td>
                    <td><input type="text" name="txt_comuna"></td>
                </tr>
                <tr>
                    <td>Dirección: </td>
                    <td><input type="text" name="txt_direccion"></td>
                </tr>
                <tr>
                    <td>Telefono: </td>
                    <td><input type="text" name="txt_telefono"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" name="btn_comprar" value="Comprar"></td>
                </tr>
            </table>
        </form>
    </body>
</html>
