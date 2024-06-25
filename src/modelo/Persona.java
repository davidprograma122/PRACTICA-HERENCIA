package modelo;
/**
 *
 * @author david
 */
public class Persona {
    //1-.CRACION DE ATRIBUTOS
    
    private int idPesona;
    private String nombre;
    private String apellido;
    private String cedula;
    private String direccion;
    private String correo;
    
    //2-.MÉTODOS CONSTRUCTORES

    public Persona() {
    }

    public Persona(int idPesona, String nombre, String apellido, String cedula, String direccion, String correo) {
        this.idPesona = idPesona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.correo = correo;
    }
    //3-. ENCAPSULAMIENTO

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    //4-. METODO IMPRIMIR
    public String imprimir(){
        return "--------DATOS PERSONA--------\n"+
                "Id: "+getIdPesona()+"\n"+
                "Nombre: "+getNombre()+"\n"+
                "Apellido: "+getApellido()+"\n"+
                "Cédula: "+getCedula()+"\n"+
                "Direccion: "+getDireccion()+"\n"+
                "Correo: "+getCorreo();
    }      
    //  METODO DE VALIDACION DE CEDULA
    public void validarCedula(){
        int[] listaDigitos=new int[9];
            String cedula=this.getCedula();
            if (cedula.length()>10){
                System.out.println("Ingrese una cedula");
            }else if(cedula.length() == 10){
                for (int i = 0; i < cedula.length()-1; i++) {
                    listaDigitos[i]=cedula.charAt(i);
                }
                
                
            }else{
                System.out.println("Revise el número de cedula");
            }
            
            
            
    }
  }
    
    
    

