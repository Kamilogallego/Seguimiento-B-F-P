package Funcion;

public class Empresa {

    private String nombreEmpresa;
    private String dedicacacion;
    private int empleados;

    public Empresa(String nombreEmpresa, String dedicacacion, int empleados) {
        this.nombreEmpresa = nombreEmpresa;
        this.dedicacacion = dedicacacion;
        this.empleados = empleados;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDedicacacion() {
        return dedicacacion;
    }

    public void setDedicacacion(String dedicacacion) {
        this.dedicacacion = dedicacacion;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }
}
