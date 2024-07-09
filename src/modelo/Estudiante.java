    package modelo;
/**
 *
 * @author david
 */
public class Estudiante extends Personah{
    private int idEstudiante;
    private int numMatricula;
    private String horario;
    private String jormnada;

    public Estudiante() {
    }

    public Estudiante(int idEstudiante, int numMatricula, String horario, String jormnada, int idPesona, String nombre, String apellido, String cedula, String usuario, String clave, int telefono, String direccion, String correoElectronico, String sexo, String fechaNacimiento) {
        super(idPesona, nombre, apellido, cedula, usuario, clave, telefono, direccion, correoElectronico, sexo, fechaNacimiento);
        this.idEstudiante = idEstudiante;
        this.numMatricula = numMatricula;
        this.horario = horario;
        this.jormnada = jormnada;
    }



    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getJormnada() {
        return jormnada;
    }

    public void setJormnada(String jormnada) {
        this.jormnada = jormnada;
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
                + "HORARIO: "+getHorario()+"\n"
                + "JORNADA: "+ getJormnada()+"\n";
    }
}
