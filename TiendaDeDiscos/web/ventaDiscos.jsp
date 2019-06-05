<%-- 
    Document   : ventaDiscos
    Created on : 02-06-2019, 11:31:27
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
        <h2>Agregue sus Discos Favoritos</h2>
        <table align="center" border ="1">
            <tr>
                <td>
                    <form action="servlet_proceso.do" method="POST">
                        <table align="center">
                            <tr>
                                <td align="center"><img src="imagenes/Blue & Lonesome.jpg" width="200" height="150"/></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_album" value="Blue & Lonesome"></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_artista" value="The Rolling Stones"></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_año" value="2016"></td>
                            </tr>
                            <tr>
                                <td align="center">
                                    <select align="center" name="opt_formato">
                                        <option>EP</option>
                                        <option>LP</option>
                                        <option>CD</option>
                                        <option>DVD</option>
                                    </select>
                                </td><br>
                            </tr>
                            <tr>
                                <td align="center">Cantidad <input type="text" name="txt_cantidad" value="0"></td>
                            </tr>
                            <tr>
                                <td align="center">PRECIO PENDIENTE</td><br>
                            </tr>
                            <tr>
                                <td align="center"><input align="center" type="submit" name="btn_agregar" value="Agregar"></td>
                            </tr>
                        </table>
                    </form>
                </td>
                <td>
                    <form action="servlet_proceso.do" method="POST">
                        <table align="center">
                            <tr>
                                <td align="center"><img src="imagenes/Sehnsucht.jpg" width="200" height="150"/></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_album" value="Sehnsucht"></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_artista" value="Rammstein"></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_año" value="1997"></td>
                            </tr>
                            <tr>
                                <td align="center">
                                    <select align="center" name="opt_formato">
                                        <option>EP</option>
                                        <option>LP</option>
                                        <option>CD</option>
                                        <option>DVD</option>
                                    </select>
                                </td><br>
                            </tr>
                            <tr>
                                <td align="center">Cantidad <input type="text" name="txt_cantidad" value="0"></td>
                            </tr>
                            <tr>
                                <td align="center">PRECIO PENDIENTE</td><br>
                            </tr>
                            <tr>
                                <td align="center"><input align="center" type="submit" name="btn_agregar" value="Agregar"></td>
                            </tr>
                        </table>
                    </form>
                </td>
                <td>
                    <form action="servlet_proceso.do" method="POST">
                        <table align="center">
                            <tr>
                                <td align="center"><img src="imagenes/Abbey Road.jpg" width="200" height="150"/></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_album" value="Abbey Road"></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_artista" value="The Beatles"></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_año" value="1969"></td>
                            </tr>
                            <tr>
                                <td align="center">
                                    <select align="center" name="opt_formato">
                                        <option>EP</option>
                                        <option>LP</option>
                                        <option>CD</option>
                                        <option>DVD</option>
                                    </select>
                                </td><br>
                            <tr>
                                <td align="center">Cantidad <input type="text" name="txt_cantidad" value="0"></td>
                            </tr>
                            <tr>
                                <td align="center">PRECIO PENDIENTE</td><br>
                            </tr>
                            <tr>
                                <td align="center"><input align="center" type="submit" name="btn_agregar" value="Agregar"></td>
                            </tr>
                        </table>
                    </form>
                </td>
            </tr>
            <tr>
                <td>
                    <form action="servlet_proceso.do" method="POST">
                        <table align="center">
                            <tr>
                                <td align="center"><img src="imagenes/Black Ice.jpg" width="200" height="150"/></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_album" value="Black Ice"></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_artista" value="AC/DC"></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_año" value="2008"></td>
                            </tr>
                            <tr>
                                <td align="center">
                                    <select align="center" name="opt_formato">
                                        <option>EP</option>
                                        <option>LP</option>
                                        <option>CD</option>
                                        <option>DVD</option>
                                    </select>
                                </td><br>
                            </tr>
                            <tr>
                                <td align="center">Cantidad <input type="text" name="txt_cantidad" value="0"></td>
                            </tr>
                            <tr>
                                <td align="center">PRECIO PENDIENTE</td><br>
                            </tr>
                            <tr>
                                <td align="center"><input align="center" type="submit" name="btn_agregar" value="Agregar"></td>
                            </tr>
                        </table>
                    </form>
                </td>
                <td>
                    <form action="servlet_proceso.do" method="POST">
                        <table align="center">
                            <tr>
                                <td align="center"><img src="imagenes/Californication.jpg" width="200" height="150"/></td>

                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_album" value="Californication"></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_artista" value="Red Hot Chilli Peppers"></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_año" value="1999"></td>
                            </tr>
                            <tr>
                                <td align="center">
                                    <select align="center" name="opt_formato">
                                        <option>EP</option>
                                        <option>LP</option>
                                        <option>CD</option>
                                        <option>DVD</option>
                                    </select>
                                </td><br>
                            </tr>
                            <tr>
                                <td align="center">Cantidad <input type="text" name="txt_cantidad" value="0"></td>
                            </tr>
                            <tr>
                                <td align="center">PRECIO PENDIENTE</td><br>
                            </tr>
                            <tr>
                                <td align="center"><input align="center" type="submit" name="btn_agregar" value="Agregar"></td>
                            </tr>
                        </table>
                    </form>
                </td>
                <td>
                    <form action="servlet_proceso.do" method="POST">
                        <table align="center">
                            <tr>
                                <td align="center"><img src="imagenes/Nervermind.jpg" width="200" height="150"/></td>                            
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_album" value="Nevermind"></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_artista" value="Nirvana"></td>
                            </tr>
                            <tr>
                                <td align="center"><input type="text" name="txt_año" value="1991"></td>
                            </tr>
                            <tr>
                                <td align="center">
                                    <select align="center" name="opt_formato">
                                        <option>EP</option>
                                        <option>LP</option>
                                        <option>CD</option>
                                        <option>DVD</option>
                                    </select>
                                </td><br>
                            </tr>
                            <tr>
                                <td align="center">Cantidad <input type="text" name="txt_cantidad" value="0"></td>
                            </tr>
                            <tr>
                                <td align="center">PRECIO PENDIENTE</td><br>
                            </tr>
                            <tr>
                                <td align="center"><input align="center" type="submit" name="btn_agregar" value="Agregar"></td>
                            </tr>
                        </table>
                    </form>
                </td>
            </tr>
        </table>
    </body>
</html>
