package Controlador;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import modelo.Personah;
import controlador.ConexionBDD;
//import static java.awt.Event.INSERT;
import java.sql.ResultSet;
/**
 *
 * @author david
 */
public class PersonahControlador {
    // ATRIBUTO DEL MODELO
    private Personah persona;
    //CONEXION 
    ConexionBDD conexion=new ConexionBDD();
    Connection connection=(Connection)conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    // INSERTAR FILAS EN UNA TABLA
    public void crearPersona(Personah p){
        try {// EXCEPCION QUE LANZA LA CONSULATA
            String consultaSQL= "INSERT INTO persona(nombres,apellidos, cedula, usuario,clave,direccion,correoElectronico,sexo,fechaNacimiento,telefono) VALUES ('"+p.getNombre()+"','"+p.getApellido()+"','"+p.getCedula()+"','"+p.getUsuario()+"','"+p.getClave()+"','"+p.getDireccion()+"','"+p.getCorreoElectronico()+"','"+p.getSexo()+"','"+p.getFechaNacimiento()+"',"+p.getTelefono()+");";
            ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            // DAR CLIC EN EL PLAY (ejecutar la consulta)
            int res=ejecutar.executeUpdate();
            if (res>0){
                System.out.println("La persona ha sido creada con exito");
                // CERRAR CONSULTA
                ejecutar.close();
            }else{
                System.out.println("Por favor ingrese correctamente los datos solicitados");
                ejecutar.close();
            }
        } catch (Exception e) {
            //captura el error y permite que la consola se siga ejecuntando
            System.out.println("Error"+ e);
        }
    }
}
