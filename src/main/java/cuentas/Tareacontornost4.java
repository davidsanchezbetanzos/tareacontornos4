/*
 *Las clases deberán formar parte del paquete cuentas.
Cambiar el nombre de la variable "cuenta1" por "cuenta1".
Introducir el método operativa_cuenta, que englobe las sentencias de la clase Main que operan con el objeto cuenta1.
Encapsular los atributos de la clase CCuenta.
Añadir un nuevo parámetro al método operativa_cuenta, de nombre cantidad y de tipo float.
 */

package cuentas;

/**
 *
 * @author david
 */
public class Tareacontornost4 {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuenta(cuenta1);
    }

    public static void operativa_cuenta(CCuenta cuenta1) {
        double saldoActual;
        
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    
}
