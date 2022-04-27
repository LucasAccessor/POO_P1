import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    
    private List<Reserva> reservas;

    public Restaurante(){
        this.setReservas(new ArrayList<>());
    }

    public void addReserva(Reserva r){
        this.reservas.add(r);
        
    }

    //getters & setters
    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

}
