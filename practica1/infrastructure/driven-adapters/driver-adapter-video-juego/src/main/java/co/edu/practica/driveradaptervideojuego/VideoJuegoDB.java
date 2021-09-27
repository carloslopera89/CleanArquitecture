package co.edu.practica.driveradaptervideojuego;

import co.edu.practica.model.videojuego.VideoJuego;
import co.edu.practica.model.videojuego.gateways.VideoJuegoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Component
public class VideoJuegoDB implements VideoJuegoRepository {

    private ObjectMapper mapper = new ObjectMapper();


    @Autowired
    private IVideoJuegoH2 iVideoJuegoH2;

    @Override
    public VideoJuego crearVideoJuego(VideoJuego videoJuego) {

        VideoJuegoModelDB videoJuegoModelDB = mapper.convertValue(videoJuego, VideoJuegoModelDB.class);
        VideoJuego videoJuegoResult = mapper.convertValue(iVideoJuegoH2.save(videoJuegoModelDB),VideoJuego.class);

        //iVideoJuegoH2.save(videoJuegoModelDB);
        return videoJuegoResult;
    }

    @Override
    public List<VideoJuego> consultarVideoJuegos() {
        
        //return (List<VideoJuego>) iVideoJuegoH2.findAll();

       /* List<VideoJuego> videoJuegos = Arrays.asList(VideoJuego.builder().id(1).nombre("Call of dutty").descripcion("juego de acción")
                        .modalidad("individual").categoria("Acción").build(),
                VideoJuego.builder().id(2).nombre("God of war").descripcion("juego de misión")
                        .modalidad("individual").categoria("Acción").build());

        return videoJuegos;
        */

       // Stream <VideoJuegoModelDB> streamModelDB = StreamSupport.stream(iVideoJuegoH2.findAll().spliterator(),false);
        List<VideoJuego> videoJuegosResult = StreamSupport.stream(iVideoJuegoH2.findAll().spliterator(),false)
                .map(videoJuego -> mapper.convertValue(iVideoJuegoH2.save(videoJuego),VideoJuego.class))
                .collect(Collectors.toList());

        return videoJuegosResult;
    }
}
