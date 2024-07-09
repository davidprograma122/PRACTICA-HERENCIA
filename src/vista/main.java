package vista;

//import controlador.ConexionBDD;
import Controlador.PersonahControlador;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.Administrativo;
import modelo.CuentaAhorros;
import modelo.CuentaCorriente;
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
//        Persona p1 = new Persona();
//        p1.setCedula("1004735617");
//        p1.validarCedula();

//        Docente d = new Docente();
//        d.setIdPesona(1);
//        d.setNombre("David");
//        d.setApellido("Puetate");
//        d.setCedula("1004735617");
//        d.setSexo("Masculino");
//        d.setEscalaSalarial("A1");
//        d.setEspecialidad("Backend");
//        d.setTitulo("Ingeniero en Sistemas Compuetacionales");
//        d.setRegistroSenescyt("102181235");
//
//        System.out.println(d.imprirmir());

//        Administrativo a=new Administrativo(2, "Secretaria", "Software", 2, "Julia", "Andrade", "1005115115", 968294841, "Ibarra", "Julia@gmail.com", "Femenino", "08/08/2000");
//           System.out.println(a.imprirmir());     
//        //UPCASTING: CREAR OBJETOS DE LA CLASE PADRE
//        //USANDO CONSTRUCTORES DE LAS CLASES HIJAS
//        //NO PUEDO ACCEDER O ESCRIBIR ATRIBUTOS DE LA CLASE HIJA
//        Personah pe=new Estudiante();
//         pe.setNombre("Pepito");
//         pe.setApellido("Díaz");
//         pe.setCedula("1002003001");
//        //DOWNCASTING CAMBIAR EL TIPO DE DATO A UN OBJETO
//        Estudiante e=(Estudiante)pe;
//        System.out.println(e.imprirmir());
//        e.setIdEstudiante(1);
//        e.setNumMatricula(10001);
//               System.out.println(e.imprirmir());
//        
//    }
        // CONEXION A BASE DE DATOS
//    ConexionBDD cb=new ConexionBDD();
//    cb.conectar();
//    }
        ArrayList<CuentaAhorros> listaCuentaAhorro = new ArrayList<>();
        ArrayList<CuentaCorriente> listaCuentaCorriente = new ArrayList<>();
        Scanner es = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println("BIENVENIDO AL BANCO PEPITO PÉREZ");
            System.out.println("Cuidando tu dinero desde 1992");
            System.out.println("Elija la opción que Usted requiera ejecutar:\n"
                    + "1.Crear Cuenta\n"
                    + "2.Consultar Saldo\n"
                    + "3.Imprimir Estado de Cuenta\n"
                    + "4.Depósitos\n"
                    + "5.Retiros\n"
                    + "6.Gestion de usuarios\n"
                    + "0.Salir");
            int op1 = es.nextInt();
            if (op1 == 1) {
                System.out.println("Elija el tipo de Cuenta que quiere Crear\n"
                        + "1.Cuenta de Ahorros\n"
                        + "2.Cuenta Corriente");
                int sm1 = es.nextInt();
                if (sm1 == 1 || sm1 == 2) {
                    if (sm1 == 1) {
                        System.out.println("---FORMULARIO DE CREACIÓN DE CUENTA DE AHORROS---");
                        System.out.println("Ingrese el monto de creación de la cuenta:");
                        double monto = es.nextDouble();
                        CuentaAhorros ca = new CuentaAhorros(false, monto, 1, 0, 12, 1.35);
                        listaCuentaAhorro.add(ca);
                        ca.imprimir();
                    } else if (sm1 == 2) {
                        System.out.println("---FORMULARIO DE CREACIÓN DE CUENTA CORRIENTE---");
                        System.out.println("Ingrese el monto de creación de la cuenta:");
                        double monto = es.nextDouble();
                        CuentaCorriente cc = new CuentaCorriente(0, monto, 1, 0, 12, 1.35);
                        listaCuentaCorriente.add(cc);
                        cc.imprimir();
                    }
                } else {
                    System.out.println("Ingrese una opción del menú");
                }
            } else if (op1 == 0) {
                i = 0;
            } else if(op1== 6){
                System.out.println("Elija la opcion\n"
                        + "1.Crear persona");
                int mp=es.nextInt();
                if(mp==1){
                    System.out.println("Ingrese los siguentes datos\n");
                    Personah p=new Personah();
                    System.out.println("Ingrese su nombre\n");
                    p.setNombre(es.next());
                    System.out.println("Ingrese su apellido\n");
                    p.setApellido(es.next());
                    System.out.println("Ingrese su cedula \n");
                    p.setCedula(es.next());
                    System.out.println("ingrese un usuario\n");
                    p.setUsuario(es.next());
                    System.out.println("ingrese una conraseña\n");
                    p.setClave(es.next());
                    System.out.println("ingrese un direccion\n");
                    p.setDireccion(es.next());
                    System.out.println("ingrese un correo electronico\n");
                    p.setCorreoElectronico(es.next());
                    System.out.println("ingrese f si es femenino o m si es masculino\n");
                    p.setSexo(es.next());
                    System.out.println("ingrese su fecha de nacimiento de la fomra (dd-mm-aa)\n");
                    p.setFechaNacimiento(es.next());
                    System.out.println("ingrese su número de telefono\n");
                    p.setTelefono(es.nextInt());
                    
                    PersonahControlador pc=new PersonahControlador();
                    pc.crearPersona(p);
                    
                    
                    
                    
                    

                    
                    
                    
                }
                
            }

        } while (i == 1);

    }
}
