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
public class Album {
    
    private String artista;
    private String nombreAlbum;
    private int añoEdicion;
    private String formato;
    private int precio;
    
    public Album(){
    
        artista = null;
        nombreAlbum = null;
        añoEdicion = 0;
        formato = null;
        precio = 0;   
        }

    public Album(String artista, String nombreAlbum, int añoEdicion, String formato, int precio) {
        this.artista = artista;
        this.nombreAlbum = nombreAlbum;
        this.añoEdicion = añoEdicion;
        this.formato = formato;
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) throws Exception{
        if (artista.trim().length()>0)
        {
            this.artista = artista;
        }
        else
        {
            throw new Exception("Debe ingresar un artista");
                    
        }
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    
    
}
