


public class empresa {
    private camiones camion;
    private cereales cereal;
    private conductores conductor;
    private destino destino;
    private int gastosVarios;

    public empresa(camiones camion, cereales cereal, conductores conductor, destino destino, int gastosVarios) {
        this.camion = camion;
        this.cereal = cereal;
        this.conductor = conductor;
        this.destino = destino;
        this.gastosVarios = gastosVarios;
    }

    public int getGastosVarios() {
        return gastosVarios;
    }

    public void setGastosVarios(int gastosVarios) {
        this.gastosVarios = gastosVarios;
    }

    public camiones getCamion() {
        return camion;
    }

    public void setCamion(camiones camion) {
        this.camion = camion;
    }

    public cereales getCereal() {
        return cereal;
    }

    public void setCereal(cereales cereal) {
        this.cereal = cereal;
    }

    public conductores getConductor() {
        return conductor;
    }

    public void setConductor(conductores conductor) {
        this.conductor = conductor;
    }

    public destino getDestino() {
        return destino;
    }

    public void setDestino(destino destino) {
        this.destino = destino;
    }


    
    public double calcularSueldo(){
    double total= conductor.getSueldobase()+(conductor.getSueldobase()*conductor.getAntiguedad()/100);
        
        return total;
    }
    public double calcularIngreso(){
    
    return (cereal.getPrecioxtonelada()*camion.getCapacidad());
    }
    public double calcularCombustible(){
    
    return (camion.getLitroxkm()*destino.getDistancia());
    }
    
    
    public double calcularViaje(){
    
    return (calcularIngreso()-(calcularCombustible()+calcularSueldo()+gastosVarios));
    
    }
    
    
    
    
}
