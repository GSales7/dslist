package com.devsuperior.dslist.com.devsuperior.dslist.repositories;

import com.devsuperior.dslist.com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;


// Será o componente que irá fazer consulta com o banco, que vai inserir, atualizar e deletar dados do banco
// Esse é o componente da camada de acesso aos dados
public interface GameRepository extends JpaRepository<Game, Long> {

}
