package vista;

import modelo.CuentaAhorros;

/**
 *
 * @author david
 */
public class mainCuenta {
    public static void main(String[] args) {
        CuentaAhorros ca=new CuentaAhorros();
        
        ca.setTasaMensual(12);
        ca.deposito(15000);
        ca.retiro(2000);
        ca.retiro(1000);
        ca.retiro(10);
        ca.retiro(1120);
        ca.retiro(700);
        
        ca.extractoMensual();
        ca.imprimir();
        
               
        
    }
}
