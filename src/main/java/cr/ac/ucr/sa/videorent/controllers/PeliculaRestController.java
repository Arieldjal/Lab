package cr.ac.ucr.sa.videorent.controllers;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping (value ="/api/peliculas")
@CrossOrigin (origins ="*")

public class PeliculaRestController {
	@GetMapping ()
	public String getPeliculasByTitleAndGenre (){
		return " Mi primer ENDPOINT ";
	}
}

