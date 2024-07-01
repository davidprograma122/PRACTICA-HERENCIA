package modelo;
/**
 *
 * @author david
 */
public class Docente extends Personah {
    private int idDocente;
    private String especialidad;
    private String titulo;
    private String registroSenescyt;
    private String escalaSalarial;

    public Docente() {
    }

    
    public Docente(int idDocente, String especialidad, String titulo, String registroSenescyt, String escalaSalarial) {
        this.idDocente = idDocente;
        this.especialidad = especialidad;
        this.titulo = titulo;
        this.registroSenescyt = registroSenescyt;
        this.escalaSalarial = escalaSalarial;
    }
    //CONSTRUCTOR SUPERCLASE

    public Docente(int idDocente, String especialidad, String titulo, String registroSenescyt, String escalaSalarial, int idPesona, String nombre, String apellido, String cedula, int telefono, String direccion, String correoElectronico, String sexo, String fechaNacimiento) {
        super(idPesona, nombre, apellido, cedula, telefono, direccion, correoElectronico, sexo, fechaNacimiento);
        this.idDocente = idDocente;
        this.especialidad = especialidad;
        this.titulo = titulo;
        this.registroSenescyt = registroSenescyt;
        this.escalaSalarial = escalaSalarial;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRegistroSenescyt() {
        return registroSenescyt;
    }

    public void setRegistroSenescyt(String registroSenescyt) {
        this.registroSenescyt = registroSenescyt;
    }

    public String getEscalaSalarial() {
        return escalaSalarial;
    }

    public void setEscalaSalarial(String escalaSalarial) {
        this.escalaSalarial = escalaSalarial;
    }

    
   
    public String imprirmir(){
        return ("------------DATOS DE PERSONA------------\n"
                + "NOMBRE: "+ getNombre()+"\n"
                + "APELLIDO: "+ getApellido()+"\n"
                + "CÉDULA: "+getCedula()+"\n"
                + "TÉLEFONO: "+getTelefono()+"\n"
                + "DIRECCIÓN: "+ getDireccion()+"\n"
                + "CORREO ELECTRÓNICO: "+getCorreoElectronico()+"\n"
                + "SEXO: "+getSexo()+"\n"
                + "FECHA DE NACIEMINTO: "+getFechaNacimiento()+"\n"
                + "--------------DATOS DOCENTES--------------\n"
                + "ESPECIALIDAD: "+getEspecialidad()+"\n"
                + "TITULO: "+getTitulo()+"\n"
                + "REGISTRO SENESCYT: "+getRegistroSenescyt()+"\n"
                + "ESCALA SALARIAL: "+getEspecialidad()+"\n");
    }

}
