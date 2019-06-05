/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author alumnossur
 */
public class Venta {

    private Album album;
    private Cliente cliente;
    private String fechaVenta;
    private int cantidad;
    private String formaPago;

    public Venta() {

        album = new Album();
        cliente = new Cliente();
        fechaVenta = null;
        cantidad = 0;
        formaPago = null;

    }

    public Venta(Album album, Cliente cliente, String fechaVenta, int cantidad, String formaPago) {
        this.album = album;
        this.cliente = cliente;
        this.fechaVenta = fechaVenta;
        this.cantidad = cantidad;
        this.formaPago = formaPago;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public int calcularTotal(){
        int total = 0;
        total = cantidad * album.getPrecio();
        return total;
    }
}
