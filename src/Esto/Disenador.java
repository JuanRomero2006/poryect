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
 * Clase Diseñador que extiende Empleado e implementa Gestionable
 */
public class Disenador extends Empleado implements Gestionable {
    private String areaDiseno;

    public Disenador(String id, String nombre, double salarioBase, String areaDiseno) {
        super(id, nombre, salarioBase);
        this.areaDiseno = areaDiseno;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.10; // incremento del 10%
    }

    @Override
    public void validarProyecto(Proyecto proyecto) {
        System.out.println(nombre + " ha sido asignado al proyecto: " + proyecto.getNombre());
    }

    @Override
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
        return "Diseñador -> " + super.toString() + " | Área: " + areaDiseno;
    }
}
