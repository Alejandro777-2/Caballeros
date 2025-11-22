import java.util.ArrayList;
import java.util.List;

public class ReinoDeAtenea {
    private List<Caballero> caballeros;
    private List<Aporte> aportes;
    public ReinoDeAtenea (){
        this.aportes = new ArrayList<>();
       this.caballeros = new ArrayList<>();
    }
    public void agregar(Caballero caballero, Aporte aporte) {
        caballeros.add(caballero);
        aportes.add(aporte);
    }

    public boolean editar(int id, Aporte aporte, Caballero caballero){
        int i=0;
        int s=caballeros.size()-1;
        int c;
        while(i<=s){
            c=(i+s)/2;
            if(id==caballeros.get(c).getiD()){
                caballeros.set(c,caballero);
                aportes.set(c,aporte);
                return true;
            }else if(id<caballeros.get(c).getiD()){
                s=c-1;
            }else{
                i=c+1;
            }
        }
        return false;
    }

    public List<Aporte> getAportes() {
        return aportes;
    }

    public void setAportes(List<Aporte> aportes) {
        this.aportes = aportes;
    }

    public List<Caballero> getCaballeros() {
        return caballeros;
    }

    public void setCaballeros(List<Caballero> caballeros) {
        this.caballeros = caballeros;
    }
}
