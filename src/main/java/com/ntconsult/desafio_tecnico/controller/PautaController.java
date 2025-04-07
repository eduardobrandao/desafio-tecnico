package com.ntconsult.desafio_tecnico.controller;

import com.ntconsult.desafio_tecnico.entity.PautaEntity;
import com.ntconsult.desafio_tecnico.service.PautaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/pautas")
public class PautaController {

    @Autowired
    private PautaService pautaService;

    @PostMapping
    public ResponseEntity<PautaEntity> criar(@RequestParam String titulo) {
        return ResponseEntity.ok(pautaService.criar(titulo));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PautaEntity> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(pautaService.buscarPorId(id));
    }
}
