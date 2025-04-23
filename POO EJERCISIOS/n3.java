

public class n3 extends nota {
    private double nota;
    
    public n3(double nota) {
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
        return "nota: " + nota;
    }
}
