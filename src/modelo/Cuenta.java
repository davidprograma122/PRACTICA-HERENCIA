package modelo;
/**
 *
 * @author david
 */
public class Cuenta {
    private double saldo;
    private int numConsiganciones;
    private int numRetiros;
    private double tasaAnual;
    private double tasaMensual;
    private double comisionMensual;

    public Cuenta() {
    }

    public Cuenta(double saldo,double tasaAnual) {
        this.saldo = saldo;
        this.numConsiganciones =numConsiganciones ;
        this.numRetiros = numRetiros;
        this.tasaAnual = tasaAnual;
        this.tasaMensual = tasaMensual;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConsiganciones() {
        return numConsiganciones;
    }

    public void setNumConsiganciones(int numConsiganciones) {
        this.numConsiganciones = numConsiganciones;
    }

    public int getNumRetiros() {
        return numRetiros;
    }

    public void setNumRetiros(int numRetiros) {
        this.numRetiros = numRetiros;
    }

    public double getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public double getTasaMensual() {
        return tasaMensual;
    }

    public void setTasaMensual(double tasaMensual) {
        this.tasaMensual = tasaMensual;
    }

    public double getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(double comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
    
    public void deposito(double valorDepositar){
        setSaldo(getSaldo()+valorDepositar);
        setNumConsiganciones(getNumConsiganciones()+1);
    }
    public void retiro(double valorRetirar){
        if(valorRetirar>getSaldo()){
            System.out.println("No cuenta con los fondos suficientes"
                    + " para realizar el retiro");
        }else{        
            setSaldo(getSaldo()-valorRetirar);
            setNumRetiros(getNumRetiros()+1);
            System.out.println("El saldo despues del retiro es de: "+getSaldo()+"\n"
                                +"Su numero de retiro es de: "+getNumRetiros());
        }
    }
    public void interesMensual(){
            double interesMensual = (getSaldo() * ((getTasaAnual() / 12) / 100));
        setSaldo(getSaldo() + interesMensual);
    }  
    public void extractoMensual(){
        interesMensual();
        setSaldo(getSaldo()-getComisionMensual());
    }
    public void imprimir(){
        System.out.println("----DATOS CUENTA BANCARIA----\n"
                + "Saldo: "+getSaldo()+"\n"
                + "Consiganciones: "+getNumConsiganciones()+"\n"
                + "Retiros: "+getNumRetiros()+"\n"
                + "Tasa Anual: "+getTasaAnual()+"\n"
                + "Tasa mensual: "+getComisionMensual()+"\n");
    }

// calcular interes
            //extracto mensual
            // generar clase hija (cuenta ahorro)   
}
