public class Empleado {
    
    public String nombre;
    private double salario;

    public Empleado (String nombre, double salario) {
        this.nombre = nombre;
        setsalario(salario);
    }

    public double getsalario (){
        return salario;
    }

    public void setsalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("Error: el salario no puede ser negativo. Se asignará 0.");
            this.salario = 0;
        }
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }

}


class PruebaEmpleado {
    public static void main(String[] args) {
        
        Empleado e1 = new Empleado("Carlos", 1500);
        e1.mostrarInfo();

        System.out.println();

        Empleado e2 = new Empleado("Ana", -500);
        e2.mostrarInfo();

        System.out.println();

        e1.nombre = "Juan Carlos"; 
        System.out.println("Nuevo nombre: " + e1.nombre);

        e1.setsalario(2000);
        System.out.println("Nuevo salario: $" + e1.getsalario());
    }
}
