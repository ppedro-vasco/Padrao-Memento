import java.util.ArrayList;
import java.util.List;

public class H20 {
    private H20Estado estado;
    private List<H20Estado> memento = new ArrayList<H20Estado>();
    float temperatura;
    public H20Estado getEstado() {
        return this.estado;
    }

    public float getTemperatura(){
        return this.temperatura;
    }

    public void setEstado(H20Estado estado, float temperatura) {
        this.estado = estado;
        this.temperatura = temperatura;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<H20Estado> getEstados() {
        return this.memento;
    }
}
