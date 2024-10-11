
public class conductores {
    
   private String nombre;
   private double sueldobase;
   private int antiguedad;

    public conductores(String nombre, double sueldobase, int antiguedad) {
        this.nombre = nombre;
        this.sueldobase = sueldobase;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldobase() {
        return sueldobase;
    }

    public void setSueldobase(double sueldobase) {
        this.sueldobase = sueldobase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
   
   
   
   
   
}
