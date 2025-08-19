package com.devsuperior.dslist.com.devsuperior.dslist.services;

import com.devsuperior.dslist.com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//Precisamos registar essa classe como sendo um componente do sistema
//@Component poderia ser esse também
@Service
public class GameService {

    //Injetando uma instancia do GameRepository para usar no gameService
    @Autowired
    private GameRepository gameRepository;

    //Função que retorna todos os games na lista
    /*public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();

    }*/

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();

        //Transforma uma lista que era tipo Game em uma lista tipo GameMinDTO
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
