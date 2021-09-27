package co.edu.practica.model.videojuego.gateways;

import co.edu.practica.model.videojuego.VideoJuego;

import java.util.List;

public interface VideoJuegoRepository {

    public VideoJuego crearVideoJuego(VideoJuego videoJuego);

    public List<VideoJuego> consultarVideoJuegos();

}
