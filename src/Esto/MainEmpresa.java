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
import java.util.List;

/**
 * Clase principal para probar el sistema de empleados y proyectos
 */
public class MainEmpresa {
    public static void main(String[] args) {
        // Crear empleados
        List<String> lenguajes1 = List.of("Java", "Python");
        List<String> lenguajes2 = List.of("Java");
        Desarrollador dev1 = new Desarrollador("E01", "Carlos", 2000, lenguajes1);
        Desarrollador dev2 = new Desarrollador("E02", "Ana", 1800, lenguajes2);
        Desarrollador dev3 = new Desarrollador("E03", "Luis", 1900, List.of("Python"));
        Disenador dis1 = new Disenador("E04", "Maria", 1500, "UX/UI");
        Disenador dis2 = new Disenador("E05", "Sofia", 1600, "Gráfico");

        // Crear proyectos
        Proyecto p1 = new Proyecto("P01", "Sistema Contable", 10000, LocalDate.now());
        Proyecto p2 = new Proyecto("P02", "App Móvil", 15000, LocalDate.now());

        // Asignar equipos
        p1.agregarEmpleado(dev1);
        p1.agregarEmpleado(dev2);
        p1.agregarEmpleado(dis1);

        p2.agregarEmpleado(dev1);
        p2.agregarEmpleado(dev2);
        p2.agregarEmpleado(dev3);
        p2.agregarEmpleado(dis1);
        p2.agregarEmpleado(dis2);

        // Mostrar proyectos
        System.out.println(p1);
        System.out.println("Nómina total p1: " + p1.calcularNomina());
        System.out.println("Valor máximo permitido (40%): " + p1.calcularNomina() * 0.4);

        System.out.println("\n" + p2);
        System.out.println("Nómina total p2: " + p2.calcularNomina());
        System.out.println("Valor máximo permitido (40%): " + p2.calcularNomina() * 0.4);

        // Arreglos con empleados y proyectos
        Empleado[] empleados = {dev1, dev2, dev3, dis1, dis2};
        Proyecto[] proyectos = {p1, p2};

        // Probar interfaz con todos los empleados
        for (Empleado e : empleados) {
            if (e instanceof Gestionable g) {
                for (Proyecto p : proyectos) {
                    g.validarProyecto(p);
                }
            }
        }
    }
}