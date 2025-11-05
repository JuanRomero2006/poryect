/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esto;

/**
 *
 * @author USUARIO
 */
/**
 * Clase abstracta Empleado
 * Contiene los atributos y métodos básicos de un empleado
 */
public abstract class Empleado {
    protected String id;
    protected String nombre;
    protected double salarioBase;

    public Empleado(String id, String nombre, double salarioBase) {
        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String mostrarInformacion() {
        return "ID: " + id + ", Nombre: " + nombre + ", Salario Base: " + salarioBase;
    }

    @Override
    public String toString() {
        return mostrarInformacion() + ", Salario Total: " + calcularSalario();
    }

    // Getters y Setters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getSalarioBase() { return salarioBase; }
    public void setSalarioBase(double salarioBase) { this.salarioBase = salarioBase; }
}