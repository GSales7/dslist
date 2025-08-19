package com.devsuperior.dslist.com.devsuperior.dslist.controllers;

import com.devsuperior.dslist.com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.com.devsuperior.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//É o controller do REST, ele quem irá disponibilizar a API, logo deve retornar um JSON
//Para configurar ela como um controller, temos que colocar
@RestController
@RequestMapping(value = "/games") //Mapeia o recurso, neste caso sera games (caminho que será respondido pela API)
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping //Configurando como metodo GET
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }
}
