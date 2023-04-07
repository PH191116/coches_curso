package com.project.coches.domain.pojo.repository;

import com.project.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.persistance.entity.MarcaCoche;
import com.project.coches.persistance.mapper.IMarcaCocheMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repositorio de marca coche
 */
@RequiredArgsConstructor
@Repository
public class BrandCarRepository implements IBrandCarRepository{
    private final IBrandCarCrudRepository iBrandCarCrudRepository;
    private final IMarcaCocheMapper iMarcaCocheMapper;

    @Override
    public List<MarcaCochePojo> getAll() {
        return iMarcaCocheMapper.toMarcasCochePojo(iBrandCarCrudRepository.findAll());
    }

    @Override
    public Optional<MarcaCochePojo> getBrandCar(Integer id) {
        //lambda expression: c -> iMarcaCocheMapper.toMarcaCochePojo(c)
        return iBrandCarCrudRepository.findById(id).map(iMarcaCocheMapper::toMarcaCochePojo);
    }

    @Override
    public MarcaCochePojo save(MarcaCochePojo newBrandCar) {
        MarcaCoche coche = iMarcaCocheMapper.toMarcaCocheEntity(newBrandCar);
        return iMarcaCocheMapper.toMarcaCochePojo(iBrandCarCrudRepository.save(coche));
    }

    @Override
    public void delete(Integer idBrandCar) {
        iBrandCarCrudRepository.deleteById(idBrandCar);

    }
}
