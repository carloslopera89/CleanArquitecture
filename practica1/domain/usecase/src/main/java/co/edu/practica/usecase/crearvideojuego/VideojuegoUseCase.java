package co.edu.practica.usecase.crearvideojuego;

import co.edu.practica.model.videojuego.VideoJuego;
import co.edu.practica.model.videojuego.gateways.VideoJuegoRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class VideojuegoUseCase {

    private final VideoJuegoRepository videoJuegoRepository;

    public VideoJuego crearVideoJuego(VideoJuego videoJuego){

        return videoJuegoRepository.crearVideoJuego(videoJuego);
    }

    public List<VideoJuego> consultarVideoJuegos(){
        return  videoJuegoRepository.consultarVideoJuegos();
    }
}
