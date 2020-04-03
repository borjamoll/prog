/* Daniel Alfredo Apesteguia Timoner */
package practica_3;

import java.util.*;

public class Cuenta {

    private String cliente;
    private String cuenta;
    private double interes;
    private double saldo;
    private int pin;

    public Cuenta() {

    }

    public Cuenta(String cliente, String cuenta, double interes, double saldo, int pin) {
        this.cliente = cliente;
        this.cuenta = cuenta;
        this.interes = interes;
        this.saldo = saldo;
        this.pin = pin;
    }

    public Cuenta(Cuenta c1) {
        this.cliente = c1.cliente;
        this.cuenta = c1.cuenta;
        this.interes = c1.interes;
        this.saldo = c1.saldo;
        this.pin = c1.pin;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void crearCuenta() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del cliente: ");
        this.setCliente(sc.nextLine());
        System.out.println("Introduce el número de la cuenta: ");
        this.setCuenta(sc.nextLine());
        System.out.println("Introduce el tipo de interes: ");
        this.setInteres(sc.nextDouble());
        System.out.println("Introduce el saldo: ");
        this.setSaldo(sc.nextDouble());
        System.out.println("Introduce el PIN: ");
        this.setPin(sc.nextInt());
    }

    public static Cuenta crearCuentaC1() {
        Scanner sc = new Scanner(System.in);
        Cuenta c1 = new Cuenta();
        System.out.println("Introduce el número del cliente: ");
        c1.setCliente(sc.nextLine());
        System.out.println("Introduce el número de la cuenta: ");
        c1.setCuenta(sc.nextLine());
        System.out.println("Introduce el tipo de interes: ");
        c1.setInteres(sc.nextDouble());
        System.out.println("Introduce el saldo: ");
        c1.setSaldo(sc.nextDouble());
        System.out.println("Introduce el PIN: ");
        c1.setPin(sc.nextInt());
        return c1;
    }

    public void mostrarDatos(Cuenta index) {
        System.out.println("El número de la cuenta es " + index.getCuenta()
                + ".");
        System.out.println("El número de cliente es " + index.getCliente()
                + ".");
        System.out.println("El tipo de interés es " + index.getInteres()
                + ".");
        System.out.println("El saldo actual es de " + index.getSaldo() + "€.");
        System.out.println("El número pin es " + index.getPin() + ".");
    }

    public boolean ingreso(Cuenta index) {
        Scanner lector = new Scanner(System.in);
        boolean resultado;
        System.out.println("Indique la cantidad ingresada");
        double cantidadIngresada = lector.nextDouble();
        if (cantidadIngresada < 0) {
            System.out.println("La cantidad debe ser positiva");
            resultado = false;
        } else {
            index.setSaldo(index.getSaldo() + cantidadIngresada);
            System.out.println("Su saldo actual es de " + index.getSaldo() + ".");
            resultado = true;
        }
        return resultado;
    }

    public boolean reintegro(Cuenta index) {
        Scanner lector = new Scanner(System.in);
        boolean resultado;
        System.out.println("El saldo disponible es de " + index.getSaldo()
                + " ¿Qué cantidad desea retirar?");
        double cantidadRetirada = lector.nextDouble();
        if (cantidadRetirada > index.getSaldo()) {
            System.out.println("La cantidad es superior al saldo disponible"
                    + ", vuelva a intentarlo");
            resultado = false;
        } else {
            this.setSaldo(index.getSaldo() - cantidadRetirada);
            System.out.println("Su saldo actual es de " + index.getSaldo() + ".");
            resultado = true;
        }
        return resultado;
    }

    public void transferencia(Cuenta cuentaDestino, double importe) {
        this.setSaldo(this.getSaldo() - importe);
        cuentaDestino.setSaldo(cuentaDestino.getSaldo() + importe);
        System.out.println("El saldo actual de " + this.getCliente() + " es de "
                + this.getSaldo() + ".");
        System.out.println("El saldo actual de " + cuentaDestino.getCliente() + " es de "
                + cuentaDestino.getSaldo() + ".");
    }

    public static boolean validarCuenta(ArrayList<Cuenta> listaCuentas, int i) {
        Scanner lector = new Scanner(System.in);
        boolean validado = false;
        int j = 3;
        while (j > 0) {
            System.out.println("Introduce el número pin. Te quedan " + j
                    + " intentos.");
            int intentoPin = lector.nextInt();
            if (listaCuentas.get(i).getPin() == intentoPin) {
                System.out.println("¡Bienvenido " + listaCuentas.get(i).getCliente()
                        + "!");
                validado = true;
                j = 0;
            } else {
                System.out.println("Pin Incorrecto.");
                j--;
            }
        }
        return validado;
    }

    public static int buscarCuenta(ArrayList<Cuenta> listaCuentas) {
        Scanner lector = new Scanner(System.in);
        boolean encontrado = false;
        int index = -1;
        int i = 0;
        System.out.println("Indroduzca el número de la cuenta destino");
        String numeroCuenta = lector.next();
        while (encontrado == false) {
            if (i == listaCuentas.size()) {
                System.out.println("No existe ninguna cuenta con ese número.");
                encontrado = true;
            } else {
                boolean comparar = listaCuentas.get(i).getCuenta().equals(numeroCuenta);
                if (comparar == true) {
                    encontrado = true;
                    index = i;
                } else {
                    i++;
                }
            }
        }
        return index;
    }
}
