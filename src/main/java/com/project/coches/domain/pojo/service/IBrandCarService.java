package com.project.coches.domain.pojo.service;

import com.project.coches.domain.pojo.MarcaCochePojo;

import java.util.List;
import java.util.Optional;

public interface IBrandCarService {
    /**
     * Devuelve una lista con todas las marcas de coches
     * @return Lista con marcas de coche
     **/
    List<MarcaCochePojo> getAll();

    /**
     * Devuelve una marca de coche dado su id
     * @param id Id de marca coche
     * @return Optional del marca coche encontrado
     */
    Optional<MarcaCochePojo> getBrandCar(Integer id);

    /**
     * Guarda una nueva marca coche
     * @Param newBrandCar marca coche a guardar
     * @Return Marca coche guardada
     */
    MarcaCochePojo save(MarcaCochePojo newBrandCar);

    /**
     * Eliminar un marca coche
     * @param idBrandCar
     */
    boolean delete(Integer idBrandCar);
}
