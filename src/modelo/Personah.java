package modelo;
/**
 *
 * @author david
 */
public class Personah {
    private int idPesona;
    private String nombre;
    private String apellido;
    private String cedula;
    private int telefono;
    private String direccion;
    private String correoElectronico;
    private String sexo;
    private String fechaNacimiento;

    public Personah() {
    }

    public Personah(int idPesona, String nombre, String apellido, String cedula, int telefono, String direccion, String correoElectronico, String sexo, String fechaNacimiento) {
        this.idPesona = idPesona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdPesona() {
        return idPesona;
    }

    public void setIdPesona(int idPesona) {
        this.idPesona = idPesona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
                + "FECHA DE NACIEMINTO: "+getFechaNacimiento()+"\n");
    }

}
