public class Aporte {
    private Caballero caballero;
    private float aporte;
    private float impuesto;

    public Aporte(Caballero caballero) {
        this.caballero = new Caballero(caballero.getiD(),
                caballero.getNombre(), caballero.getRango(),
                caballero.getConstelacion(), caballero.getNivelPoder(),
                caballero.getMision(),
                caballero.getNivelDificultad(),
                caballero.getRecompensa() );

        //Calcula el aporte y el impuesto al reino directamente
        this.aporte = (float) (caballero.getRecompensa()*0.1);
        if(caballero.getRecompensa() <= 100){
            this.impuesto =0;
        }
        if (caballero.getRecompensa() > 100 &&  caballero.getRecompensa() <= 200){
            int aux;
            aux = caballero.getRecompensa()-100;
            this.impuesto = (float) (aux*0.12);

        }
        if(caballero.getRecompensa()> 200 && caballero.getRecompensa() <= 400){
            int aux;
            aux = caballero.getRecompensa()-200;
            this.impuesto = (float) (aux*0.25);
        }
        if (caballero.getRecompensa()> 400){
            int aux;
            aux = caballero.getRecompensa()-400;
            this.impuesto = (float) (aux*0.35);
        }

    }

    public Caballero getCaballero() {
        return caballero;
    }

    public void setCaballero(Caballero caballero) {
        this.caballero = caballero;
    }

    public float getAporte() {
        return aporte;
    }

    public void setAporte(float aporte) {
        this.aporte = aporte;
    }

    public float getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(float impuesto) {
        this.impuesto = impuesto;
    }

    @Override
    public String toString() {
        return "Aporte " +
                "caballero " + caballero +
                ", aporte " + aporte +
                ", impuesto " + impuesto
                ;
    }
}
