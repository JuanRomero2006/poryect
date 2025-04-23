
public class n8 extends nota {
    private double nota;

    public n8(double nota) {
        super(nota);
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
        return "Nota: " + nota;
    }
}
