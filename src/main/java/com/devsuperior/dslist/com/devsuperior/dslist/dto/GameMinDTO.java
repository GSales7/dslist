// Controladores de REST recebem da camada de serviço objetos DTO
// A classe DTO são classes de objetos customizados para fornecer informações que vou precisar
// Entrega um conjunto menor de dados que a entidade possui (Ajuda até a reduzir o trafego de dados)

package com.devsuperior.dslist.com.devsuperior.dslist.dto;

import com.devsuperior.dslist.com.devsuperior.dslist.entities.Game;

public class GameMinDTO {

    private long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){

    }

    // Só que esse construtor ao invés de receber parâmetros
    //public GameMinDTO(long id, String title, Integer year, String imgUrl, String shortDescription) {
    //irá receber a prórpria entidade
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    // No DTO nós só precisamos dos métodos GETTERs

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

}
