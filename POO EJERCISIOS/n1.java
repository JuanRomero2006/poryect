
public class n1 extends nota {
    private double nota;
    
    public n1(double nota) {
        super(nota); // Llamar al constructor de la clase padre
        this.nota = nota;
    }
    
    public double getNota() {
        return nota;
    }
    
    public void setNota(double nota) {
        this.nota = nota;
}
@Override
    public String toString() {
        return "Nota 1: " + nota;
    }
}
