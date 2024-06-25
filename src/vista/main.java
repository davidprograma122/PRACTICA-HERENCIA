package vista;

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
        d.setEspecialidad("Ingeniero en Sistemas Compuetacionales");
        d.setRegistroSenescyt("102181235");
        
        System.out.println(d.imprirmir1());
        
                
        
        
        
    }
    
}
