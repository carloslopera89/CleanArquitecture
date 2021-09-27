package co.edu.practica.driveradaptervideojuego;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVideoJuegoH2 extends CrudRepository<VideoJuegoModelDB,Long> {
}
