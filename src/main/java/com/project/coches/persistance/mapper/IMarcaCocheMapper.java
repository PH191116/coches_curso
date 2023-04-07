package com.project.coches.persistance.mapper;

import com.project.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.persistance.entity.MarcaCoche;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper que transforma objetos de marcaCoche a pojos o entidades
 * */
@Mapper(componentModel = "spring")
public interface IMarcaCocheMapper {
    /**
     * Convierte una entidad marcaCoche a un POJO
     * @param marcaCoche
     * @return
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    MarcaCochePojo toMarcaCochePojo(MarcaCoche marcaCoche);

    /**
     * Convierte un pojo a una entidad de marcaCoche
     * @param marcaCochePojo
     * @return
     */
    @InheritInverseConfiguration
    MarcaCoche toMarcaCocheEntity(MarcaCochePojo marcaCochePojo);

    /**
     * Retorna una lista de marcas coche transformada a pojo de una lista de entidades
     * @param marcaCocheEntityy
     * @return
     */
    List<MarcaCochePojo> toMarcasCochePojo(List<MarcaCoche> marcaCocheEntityy);
}
