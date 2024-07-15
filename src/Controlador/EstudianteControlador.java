package Controlador;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import controlador.ConexionBDD;
import java.sql.ResultSet;
import modelo.Estudiante;
import modelo.Personah;

/**
 *
 * @author david
 */
public class EstudianteControlador {
    private Estudiante estudiante;
    
    //CONEXION 
    ConexionBDD conexion=new ConexionBDD();
    Connection connection=(Connection)conexion.conectar();
    PreparedStatement ejecutar;
    ResultSet resultado;
    // INSERTAR FILAS EN UNA TABLA
    public void crearEstudiante(Estudiante est){
        try {// EXCEPCION QUE LANZA LA CONSULATA
            String consultaSQL= "insert into estudiantes(numeroMatricula,jornada,idpersona)values('"+est.getNumMatricula()+"','"+est.getJormnada()+"',"+est.getIdPesona()+");";
            PreparedStatement ejecutar=(PreparedStatement)connection.prepareCall(consultaSQL);
            // DAR CLIC EN EL PLAY (ejecutar la consulta)
            int res=ejecutar.executeUpdate();
            if (res>0){
                System.out.println("El estudainte fue creado con exito");
                // CERRAR CONSULTA
                ejecutar.close();
            }else{
                System.out.println("Por favor ingrese los datos de manera correcta");
                ejecutar.close();
            }
        } catch (Exception e) {
            //captura el error y permite que la consola se siga ejecuntando
            System.out.println("Comuniquese con el administrador del sistema para que reseriba este error"+ e);
        }
    }
}
