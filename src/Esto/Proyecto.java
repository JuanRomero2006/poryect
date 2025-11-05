/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esto;

/**
 *
 * @author USUARIO
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Proyecto que contiene información sobre un proyecto y su equipo
 */
public class Proyecto {
    private String codigo;
    private String nombre;
    private double presupuesto;
    private LocalDate fechaInicio;
    private boolean activo;
    private List<Empleado> equipo;

    public Proyecto(String codigo, String nombre, double presupuesto, LocalDate fechaInicio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.presupuesto = presupuesto;
        this.fechaInicio = fechaInicio;
        this.activo = true;
        this.equipo = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public List<Empleado> getEquipo() { return equipo; }

    public void agregarEmpleado(Empleado empleado) {
        equipo.add(empleado);
    }

    public void finalizarProyecto() {
        activo = false;
    }

    public double calcularNomina() {
        double total = 0;
        for (Empleado e : equipo) {
            total += e.calcularSalario();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Proyecto: " + nombre + " | Código: " + codigo + " | Presupuesto: " + presupuesto +
                " | Activo: " + activo + "\nEquipo:\n" + equipo;
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
