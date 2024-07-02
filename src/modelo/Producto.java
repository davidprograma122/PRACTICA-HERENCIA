package modelo;

import java.util.Date;

/**
 *
 * @author david
 */
public class Producto {
    private String numeroLote;
    private Date fechaCaducidad;

    public Producto(String numeroLote, Date fechaCaducidad) {
        this.numeroLote = numeroLote;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }
    
    public void imprimir(){
        System.out.println("------DATOS PRODUCTO------\n"
                + "NÚMERO lOTE: "+getNumeroLote()+"\n"
                + "FECHA DE CADUCIDAD: "+getFechaCaducidad()+"\n");
    
    }
}