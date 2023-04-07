package com.project.coches.domain.pojo.service;

import com.project.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.domain.pojo.repository.IBrandCarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Servicio de marca coche
 */
@RequiredArgsConstructor
@Service
public class IBrandCarServiceImpl implements IBrandCarService{
    /**
     * Repositorio de marca coche
     */
    private final IBrandCarRepository iBrandCarRepository;
    @Override
    public List<MarcaCochePojo> getAll() {
        return iBrandCarRepository.getAll();
    }

    @Override
    public Optional<MarcaCochePojo> getBrandCar(Integer id) {
        return iBrandCarRepository.getBrandCar(id);
    }

    @Override
    public MarcaCochePojo save(MarcaCochePojo newBrandCar) {
        return iBrandCarRepository.save(newBrandCar);
    }

    @Override
    public boolean delete(Integer idBrandCar) {
        try {
            iBrandCarRepository.delete(idBrandCar);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
