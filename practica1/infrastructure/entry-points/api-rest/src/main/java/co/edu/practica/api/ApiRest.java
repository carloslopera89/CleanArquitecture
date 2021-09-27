package co.edu.practica.api;
import co.edu.practica.model.videojuego.VideoJuego;
import co.edu.practica.usecase.crearvideojuego.VideojuegoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/api/videojuego", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    @Autowired
   private final VideojuegoUseCase useCaseVideoJuego;


    @GetMapping
    public List<VideoJuego> consultarVideoJuegos() {
//      return useCase.doAction();
        return  useCaseVideoJuego.consultarVideoJuegos();
    }

    @PostMapping
    public VideoJuego guardarVideoJuego(@RequestBody VideoJuego videoJuego){

        return useCaseVideoJuego.crearVideoJuego(videoJuego);
    }
}
