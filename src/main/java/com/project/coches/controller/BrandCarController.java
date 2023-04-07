package com.project.coches.controller;

import com.project.coches.domain.pojo.MarcaCochePojo;
import com.project.coches.domain.pojo.service.IBrandCarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Controlador rest de Marca Coche
 */
@RestController
@RequestMapping("/marcasCoche")
@RequiredArgsConstructor
public class BrandCarController {
    /***
     * Servicio de marca coches
     */
    private final IBrandCarService iBrandCarService;

    @GetMapping("/")
    public ResponseEntity<List<MarcaCochePojo>> getAll(){
        return ResponseEntity.status(HttpStatus.OK)
                             .body(iBrandCarService.getAll());
        //return new ResponseEntity<>(iBrandCarService.getAll(), HttpStatus.OK); ALTERNATIVA 1
        //return new ResponseEntity.ok(iBrandCarService.getAll()); ALTERNATIVA 2

    }
    @GetMapping("/{id}")
    public ResponseEntity<MarcaCochePojo> getBrandCarById(@PathVariable("id") Integer id){
        return ResponseEntity.of(iBrandCarService.getBrandCar(id));
    }
    @PostMapping("")
    public ResponseEntity<MarcaCochePojo> save(@RequestBody MarcaCochePojo newMarcaCoche){
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(iBrandCarService.save(newMarcaCoche));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
}
