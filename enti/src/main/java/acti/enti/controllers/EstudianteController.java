package acti.enti.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import acti.enti.models.Estudiante;
import acti.enti.repositories.EstudianteRepository;

@RestController 
@RequestMapping ("/api/v1/estudiante")
public class EstudianteController{ 
@Autowired 
private EstudianteRepository repo;
@PostMapping
public Estudiante crearEstudiante (@RequestBody Estudiante e){
    return repo. save(e);
}
}
