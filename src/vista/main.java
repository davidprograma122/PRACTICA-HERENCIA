package vista;

import modelo.Administrativo;
import modelo.Docente;
import modelo.Estudiante;
import modelo.Persona;
import modelo.Personah;

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
        
        System.out.println(d.imprirmir());
        
        
        Administrativo a=new Administrativo(2, "Secretaria", "Software", 2, "Julia", "Andrade", "1005115115", 968294841, "Ibarra", "Julia@gmail.com", "Femenino", "08/08/2000");
           System.out.println(a.imprirmir());     
        //UPCASTING: CREAR OBJETOS DE LA CLASE PADRE
        //USANDO CONSTRUCTORES DE LAS CLASES HIJAS
        //NO PUEDO ACCEDER O ESCRIBIR ATRIBUTOS DE LA CLASE HIJA
        Personah pe=new Estudiante();
         pe.setNombre("Pepito");
         pe.setApellido("Díaz");
         pe.setCedula("1002003001");
        //DOWNCASTING CAMBIAR EL TIPO DE DATO A UN OBJETO
        Estudiante e=(Estudiante)pe;
        System.out.println(e.imprirmir());
        e.setIdEstudiante(1);
        e.setNumMatricula(10001);
               System.out.println(e.imprirmir());
        
    }
    
}
