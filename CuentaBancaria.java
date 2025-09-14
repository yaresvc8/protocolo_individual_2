public class CuentaBancaria {
    private String numeroCuenta;   
    private double saldo;          
    public String tipoCuenta;      

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo); 
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Error: el saldo no puede ser negativo. Se asignará 0.");
            this.saldo = 0;
        }
    }

    public void mostrarDetalles() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo: $" + saldo);
    }
}

class PruebaCuenta {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("00123456789", 1500, "Ahorros");

        cuenta.mostrarDetalles();

        cuenta.tipoCuenta = "Corriente"; 
        System.out.println("Nuevo tipo de cuenta: " + cuenta.tipoCuenta);

        cuenta.setSaldo(2000);
        System.out.println("Nuevo saldo: $" + cuenta.getSaldo());

        cuenta.numeroCuenta = "000111222";  
        System.out.println("numero de cuenta: " cuenta.numeroCuenta);

    }
}
