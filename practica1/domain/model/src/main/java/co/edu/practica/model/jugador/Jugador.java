package co.edu.practica.model.jugador;
import co.edu.practica.model.videojuego.VideoJuego;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder(toBuilder = true)
public class Jugador {

    private String id;
    private String nombre;
    private String edad;
    private String email;
    private String nivel;
    private List<VideoJuego> videoJuegos;
}
