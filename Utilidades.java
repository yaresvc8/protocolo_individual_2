public class Utilidades {
    
    public double suma;
    public double resta;
    public double multiplicacion;
    public double division;

    public double sumar (double a, double b){
        suma = a + b;
        return suma;
    }

    public double restar (double a, double b){
        resta = a - b;
        return resta;
    }

    public double multiplicar (double a, double b){
        multiplicacion = a * b;
        return multiplicacion;
    }

    public double dividir (double a, double b){
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: no se puede dividir entre cero.");
         return 0;
        }
    }   
}

class PruebaUtilidades {
    public static void main(String[] args) {
        double x = 12;
        double y = 4;

        System.out.println("=== Prueba de operaciones ===");
        System.out.println("Suma: " + Utilidades.suma(x, y));
        System.out.println("Resta: " + Utilidades.resta(x, y));
        System.out.println("Multiplicación: " + Utilidades.multiplicacion(x, y));
        System.out.println("División: " + Utilidades.division(x, y));

        System.out.println("División entre cero: " + Utilidades.division(x, 0));
    }
}
