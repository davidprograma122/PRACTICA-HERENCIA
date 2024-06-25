package vista;

import modelo.Administrativo;
import modelo.Docente;
import modelo.Persona;

/**
 *
 * @author david
 */
public class main {
    public static void main(String[] args) {
        Persona p1=new Persona();
//        p1.setCedula("1004735617");
//        p1.validarCedula();
        
        Docente d=new Docente();
        d.setIdPesona(1);
        d.setNombre("David");
        d.setApellido("Puetate");
        d.setCedula("1004735617");
        d.setSexo("Masculino");
        d.setEscalaSalarial("A1");
        d.setEspecialidad("Backend");
        d.setTitulo("Ingeniero en Sistemas Compuetacionales");
        d.setRegistroSenescyt("102181235");
        
        System.out.println(d.imprirmir1());
        
        
        Administrativo a=new Administrativo(2, "Secretaria", "Software", 2, "Julia", "Andrade", "1005115115", 968294841, "Ibarra", "Julia@gmail.com", "Femenino", "08/08/2000");
           System.out.println(a.imprirmirA());     
        
        
        
    }
    
}
