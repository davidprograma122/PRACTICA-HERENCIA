package modelo;
/**
 *
 * @author david
 */
public class CuentaCorriente extends Cuenta {
    private double sobregiro;

    public CuentaCorriente() {
    }

    public CuentaCorriente(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    public CuentaCorriente(double sobregiro, double saldo, double tasaAnual) {
        super(saldo, tasaAnual);
        this.sobregiro = sobregiro;
    }

    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }
    
    @Override
    public void retiro(double valorRetiro){
        if (valorRetiro>getSaldo()){
            setSobregiro((getSobregiro() + valorRetiro) - getSaldo());
            setSaldo(0);
            setNumRetiros(getNumRetiros()+1);
        }else{
            super.retiro(valorRetiro);
            setNumRetiros(getNumRetiros()+1);
        }
    }
    public void deporitar(double valorDeposito){
        super.deposito(valorDeposito);
        if(getSobregiro()>0){
            setSobregiro(getSobregiro()-valorDeposito);
            if(getSobregiro()<=0){
                deposito(valorDeposito+getSaldo());
                setSobregiro(0);
            }
        }
    }
    public void imprimir() {
        super.imprimir();
        System.out.println("Sobregiro: " + getSobregiro());
    }
    
}
