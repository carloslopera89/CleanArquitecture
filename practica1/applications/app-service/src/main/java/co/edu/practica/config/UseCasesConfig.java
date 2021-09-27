package co.edu.practica.config;

import co.edu.practica.model.videojuego.gateways.VideoJuegoRepository;
import co.edu.practica.usecase.crearvideojuego.VideojuegoUseCase;
import org.springframework.context.annotation.*;

@Configuration
public class UseCasesConfig {
        @Bean
        public VideojuegoUseCase videojuegoUseCase(VideoJuegoRepository videoJuegoRepository){
                 return new VideojuegoUseCase(videoJuegoRepository);
        }
}
