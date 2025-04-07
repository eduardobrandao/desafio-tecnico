package com.ntconsult.desafio_tecnico.controller;

import com.ntconsult.desafio_tecnico.enums.VotoEnum;
import com.ntconsult.desafio_tecnico.service.VotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/votos")
public class VotoController {

    @Autowired
    private VotoService votoService;

    @PostMapping
    public ResponseEntity<?> votar(
            @RequestParam Long pautaId,
            @RequestParam Long associadoId,
            @RequestParam VotoEnum voto) {
        votoService.votar(pautaId, associadoId, voto);
        return ResponseEntity.ok("Voto registrado");
    }

    @GetMapping("/resultado/{pautaId}")
    public ResponseEntity<Map<VotoEnum, Long>> resultado(@PathVariable Long pautaId) {
        return ResponseEntity.ok(votoService.resultado(pautaId));
    }
}
