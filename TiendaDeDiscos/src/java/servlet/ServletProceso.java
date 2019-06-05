/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Album;
import negocio.Cliente;
import negocio.Venta;

/**
 *
 * @author Nacho
 */
public class ServletProceso extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {
                Album al = new Album();
                Cliente cli = new Cliente();
                Venta ve = new Venta();
                al.setArtista(request.getParameter("txt_artista"));
                al.setNombreAlbum(request.getParameter("txt_album"));
                al.setAñoEdicion(Integer.valueOf(request.getParameter("txt_año")));
                al.setFormato(request.getParameter("txt_formato"));

                cli.setNombre(request.getParameter("txt_nombre"));
                cli.setCorreo(request.getParameter("txt_correo"));
                cli.setRegion(request.getParameter("txt_region"));
                cli.setComuna(request.getParameter("txt_comuna"));
                cli.setDireccion(request.getParameter("txt_direccion"));
                cli.setTelefono(Integer.valueOf(request.getParameter("txt_telefono")));
                ve.setAlbum(al);
                ve.setCliente(cli);
                if (request.getSession().getAttribute("sesionDisquera") == null) {
                    ArrayList<Venta> lista = new ArrayList();
                    request.getSession().setAttribute("sesionDisquera", lista);
                }
                ArrayList<Venta> lista = new ArrayList();
                request.getSession().setAttribute("sesionDisquera", lista);
                lista.add(ve);
                
                request.getSession().setAttribute("sesionDisquera", lista);
                response.sendRedirect("ventaDiscos.jsp?ingresado="+"ok");

            } catch (Exception e) {
                response.sendRedirect("error.jsp?error=" + e.getMessage());
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
