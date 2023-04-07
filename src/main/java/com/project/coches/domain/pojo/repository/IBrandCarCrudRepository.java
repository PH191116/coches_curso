package com.project.coches.domain.pojo.repository;

import com.project.coches.persistance.entity.MarcaCoche;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBrandCarCrudRepository extends JpaRepository<MarcaCoche, Integer> {
}
