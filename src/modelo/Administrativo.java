package modelo;
/**
 *
 * @author david
 */
public class Administrativo extends Personah {
    private int idAdministrativo;
    private String cargo;
    private String area;

    public Administrativo() {
    }

    public Administrativo(int idAdministrativo, String cargo, String area, int idPesona, String nombre, String apellido, String cedula, String usuario, String clave, int telefono, String direccion, String correoElectronico, String sexo, String fechaNacimiento) {
        super(idPesona, nombre, apellido, cedula, usuario, clave, telefono, direccion, correoElectronico, sexo, fechaNacimiento);
        this.idAdministrativo = idAdministrativo;
        this.cargo = cargo;
        this.area = area;
    }
     
    public int getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(int idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
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
                + "------------DATOS ADMINISTRATIVO-----------\n"
                + "CARGO: "+getCargo()+"\n"
                + "AREA: "+getApellido()+"\n");
    }
  
}
