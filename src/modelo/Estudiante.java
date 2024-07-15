    package modelo;
/**
 *
 * @author david
 */
public class Estudiante extends Personah{
    private int idEstudiante;
    private String numMatricula;
    private String jormnada;
    private int idPersona;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, String numMatricula, String jormnada, int idPersona, int idPesona, String nombre, String apellido, String cedula, String usuario, String clave, int telefono, String direccion, String correoElectronico, String sexo, String fechaNacimiento) {
        super(idPesona, nombre, apellido, cedula, usuario, clave, telefono, direccion, correoElectronico, sexo, fechaNacimiento);
        this.idEstudiante = idEstudiante;
        this.numMatricula = numMatricula;
        this.jormnada = jormnada;
        this.idPersona = idPersona;
    }

    public Estudiante(int idEstudiante, String numMatricula, String jormnada, int idPersona) {
        this.idEstudiante = idEstudiante;
        this.numMatricula = numMatricula;
        this.jormnada = jormnada;
        this.idPersona = idPersona;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(String numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getJormnada() {
        return jormnada;
    }

    public void setJormnada(String jormnada) {
        this.jormnada = jormnada;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    

    
    
    public String imprirmir(){
        return "------------DATOS DE PERSONA------------\n"
                + "NOMBRE: "+ getNombre()+"\n"
                + "APELLIDO: "+ getApellido()+"\n"
                + "CÉDULA: "+getCedula()+"\n"
                + "TÉLEFONO: "+getTelefono()+"\n"
                + "DIRECCIÓN: "+ getDireccion()+"\n"
                + "CORREO ELECTRÓNICO: "+getCorreoElectronico()+"\n"
                + "SEXO: "+getSexo()+"\n"
                + "FECHA DE NACIEMINTO: "+getFechaNacimiento()+"\n"
                + "----------DATOS ESTUDIANTE----------\n"
                + "ID ESTUDIANTE: "+getIdEstudiante()+"\n"
                + "NÚMERO DE MATRICULA: "+getNumMatricula()+"\n"
                + "JORNADA: "+ getJormnada()+"\n";
    }
}
