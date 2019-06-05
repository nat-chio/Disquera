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
public class Cliente {

    private String nombre;
    private int telefono;
    private String direccion;
    private String comuna;
    private String region;
    private String correo;
    private String clave;

    public Cliente() {

        nombre = null;
        telefono = 0;
        direccion = null;
        comuna = null;
        region = null;
        correo = null;
        clave = null;

    }

    public Cliente(String nombre, int telefono, String direccion, String comuna, String region, String correo, String clave) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comuna = comuna;
        this.region = region;
        this.correo = correo;
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) throws Exception {
        if (clave.trim().length() >= 4) {
            this.clave = clave;
        } else {
            throw new Exception("debe ingresar una clave con almenos 4 caracteres");
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.trim().length() > 0) {
            this.nombre = nombre;
        } else {
            throw new Exception("Debe ingresar un nombre");

        }

    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) throws Exception {
        if (direccion.trim().length() > 0) {
            this.direccion = direccion;
        } else {
            throw new Exception("Debe ingresar una direccion");
        }
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) throws Exception {
        if (comuna.trim().length() > 0) {
            this.comuna = comuna;
        } else {
            throw new Exception("Debe ingresar una comuna");
        }
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) throws Exception {
        if (region.trim().length() > 0) {
            this.region = region;
        } else {
            throw new Exception("Debe ingresar una region");
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) throws Exception {
        if (correo.trim().length() > 0) {
            this.correo = correo;
        } else {
            throw new Exception("Debe ingresar un correo");
        }
    }

}
