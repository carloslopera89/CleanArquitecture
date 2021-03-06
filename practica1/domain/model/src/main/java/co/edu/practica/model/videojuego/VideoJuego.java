package co.edu.practica.model.videojuego;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
//@Table("videojuego")
public class VideoJuego {

   // @Id
    private Integer id;
    private String nombre;
    private String descripcion;
    private String categoria;
    private String modalidad;
}
