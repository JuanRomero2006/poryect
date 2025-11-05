/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esto;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Clase Desarrollador que extiende Empleado e implementa Gestionable
 */
public class Desarrollador extends Empleado implements Gestionable {
    private List<String> lenguajesDev;

    public Desarrollador(String id, String nombre, double salarioBase, List<String> lenguajesDev) {
        super(id, nombre, salarioBase);
        this.lenguajesDev = lenguajesDev;
    }

    @Override
    public double calcularSalario() {
        double salario = salarioBase;
        for (String lenguaje : lenguajesDev) {
            if (lenguaje.equalsIgnoreCase("Java")) {
                salario += 500;
            } else if (lenguaje.equalsIgnoreCase("Python")) {
                salario += 300;
            }
        }
        return salario;
    }

    public void validarProyecto(Proyecto proyecto) {
        System.out.println(nombre + " ha sido asignado al proyecto: " + proyecto.getNombre());
    }

    public List<Proyecto> obtenerProyectos(List<Proyecto> proyectos) {
        List<Proyecto> asignados = new ArrayList<>();
        for (Proyecto p : proyectos) {
            if (p.getEquipo().contains(this)) {
                asignados.add(p);
            }
        }
        return asignados;
    }

    @Override
    public String toString() {
        return "Desarrollador -> " + super.toString() + " | Lenguajes: " + lenguajesDev;
    }
}
