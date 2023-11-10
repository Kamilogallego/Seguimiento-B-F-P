package Funcion;

public class Main {

    public static void main(String[] args) {

        Empresa empresa1 = new Empresa("Softmar", "Informatica", 400);
        Empresa empresa2 = new Empresa("Saludtotal", "Salud", 1000);


        System.out.println("Nombre de la empresa 1: " + empresa1.getNombreEmpresa());
        System.out.println("Dedicación de la empresa 1: " + empresa1.getDedicacacion());
        System.out.println("Número de empleados de la empresa 1: " + empresa1.getEmpleados());

        System.out.println("Nombre de la empresa 2: " + empresa2.getNombreEmpresa());
        System.out.println("Dedicación de la empresa 2: " + empresa2.getDedicacacion());
        System.out.println("Número de empleados de la empresa 2: " + empresa2.getEmpleados());


        empresa1.setEmpleados(250);
        System.out.println("Nuevo número de empleados de la empresa 1: " + empresa1.getEmpleados());
    }
}
