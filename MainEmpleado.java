import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
class Empleado {
    private String nombre;
    private String departamento;
    private double salario;

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getDepartamento() {
        return departamento;
    }

    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return salario;
    }
}

class MainEmpleado {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Empleado> listaEmpleados = new ArrayList<Empleado>();
        Empleado e = new Empleado();
        Empleado e2 = new Empleado();
        Empleado e3 = new Empleado();
        Empleado e4 = new Empleado();
        Empleado e5 = new Empleado();
        System.out.println("Ingrese el nombre del empleado: ");
       
        e.setNombre(sc.nextLine());
        e2.setNombre(sc.nextLine());
        e3.setNombre(sc.nextLine());
        e4.setNombre(sc.nextLine());
        e5.setNombre(sc.nextLine());
        System.out.println("Ingrese su departamento asiganado:");
e. setDepartamento (sc.nextLine());
e2. setDepartamento (sc.nextLine());
e3. setDepartamento (sc.nextLine());
e4. setDepartamento (sc.nextLine());
e5. setDepartamento ( sc.nextLine());
System.out.println("Ingrese su salario base:");
e. setSalario(sc.nextDouble());
e2.setSalario(sc.nextDouble());
e3.setSalario(sc.nextDouble());
e4. setSalario(sc.nextDouble());
e5. setSalario(sc.nextDouble());
listaEmpleados.add(e);
        listaEmpleados.add(e2);
        listaEmpleados.add(e3);
        listaEmpleados.add(e4);
        listaEmpleados.add(e5);
System.out.println("Empleados ingresados: ");
for (Empleado Empleado : listaEmpleados) {
    System.out.println(e.getNombre() + " " + e.getDepartamento() + " " + e.getSalario());
}
    }
}
