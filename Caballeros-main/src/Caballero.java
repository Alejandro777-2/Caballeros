public class Caballero {
    int iD;
    String nombre ;
    String rango;
    String constelacion;
    int nivelPoder;
    String mision;
    int nivelDificultad;
    int recompensa;

    public Caballero(int iD, String nombre,
                     String rango, String constelacion,
                     int nivelPoder, String mision,
                     int nivelDificultad, int recompensa) {
        this.iD = iD;
        this.nombre = nombre;
        this.rango = rango;
        this.constelacion = constelacion;
        this.nivelPoder = nivelPoder;
        this.mision = mision;
        this.nivelDificultad = nivelDificultad;
        this.recompensa = recompensa;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getConstelacion() {
        return constelacion;
    }

    public void setConstelacion(String constelacion) {
        this.constelacion = constelacion;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    @Override
    public String toString() {
        return "Caballero " + '\n' +
                ", iD: " + iD +
                ", nombre: " + nombre +
                ", rango: " + rango +
                ", constelacion: " + constelacion +
                ", nivel de poder: " + nivelPoder +
                ", mision: " + mision +
                ", nivelDificultad: " + nivelDificultad +
                ", recompensa: " + recompensa;
    }
}
