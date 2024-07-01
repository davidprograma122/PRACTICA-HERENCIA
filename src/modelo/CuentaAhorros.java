package modelo;
/**
 *
 * @author david
 */
public class CuentaAhorros extends Cuenta {
    private boolean activa;

    public CuentaAhorros() {
    }

    public CuentaAhorros(boolean activa, double saldo, double tasaAnual) {
        super(saldo, tasaAnual);
        this.activa = activa;
        
        
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
    
    public void cuentaActiva(){
        if (getSaldo()>=0){
            setActiva(true);
        }else{
            setActiva(false);
        }
    }
    @Override
    public void deposito(double valorDepositar){
        if (isActiva()|| true){
            super.deposito(valorDepositar);
        }else{
            System.out.println("La cuenta de ahorros se encuentra inactiva");
        }
    }
    @Override
    public void retiro(double valorRetiro){
        if(isActiva()||true){
        super.retiro(valorRetiro);
            if(getNumRetiros()>4){
            setComisionMensual(getComisionMensual()+1000);
        }
    }else{
        System.out.println("La cuenta de ahorros se encuentra inactiva");
        }
        cuentaActiva();
    }
    @Override
    public void extractoMensual(){
        super.extractoMensual();
        cuentaActiva();
        System.out.println("--------EXTRACTO MENSUAL--------\n"
                + "Activa: "+isActiva()+"\n"
                + "Saldo actual: "+getSaldo()+"\n"
                + "Interes mensual: "+getTasaMensual()+"\n"
                + "Comisión mensual: "+getComisionMensual());
    }
    @Override
    public void imprimir(){
    System.out.println("--------EXTRACTO MENSUAL--------\n"
                + "Activa: "+isActiva()+"\n"
                + "Saldo actual: "+getSaldo()+"\n"
                + "Interes mensual: "+getTasaMensual()+"\n"
                + "Comisión mensual: "+getComisionMensual()+"\n"
                + "Número de consignaciones: "+getNumConsiganciones());
    }
    
    
}
