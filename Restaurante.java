import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    
    private List<Reserva> reservas;
    int count = 0;

    public Restaurante(){
        this.setReservas(new ArrayList<>());
    }

    //getters & setters
    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

}
