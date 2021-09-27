package co.edu.practica.driveradaptervideojuego;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Table("VIDEOJUEGO")
public class VideoJuegoModelDB {

   @Id
    private Integer id;
    private String nombre;
    private String descripcion;
    private String categoria;
    private String modalidad;
}
