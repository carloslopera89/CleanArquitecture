package co.edu.practica.model.videojuego;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class VideoJuego {

    private Integer idJuego;
    private String nombre;
    private String descripcion;
    private String categoria;
}
