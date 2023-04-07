package com.project.coches.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * Entidad de la marca coche
 * */
@Getter
@Setter
@Entity//Indicar que es una entidad
@Table(name="marca_coche")//Nombre de la tabla en la BDD
public class MarcaCoche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "descripcion")//se utiliza para cuando el nombre de la tabla es distinto al del atributo
    private String description;
}
