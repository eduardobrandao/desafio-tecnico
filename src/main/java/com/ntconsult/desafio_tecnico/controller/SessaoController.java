package com.ntconsult.desafio_tecnico.controller;

import com.ntconsult.desafio_tecnico.entity.SessaoEntity;
import com.ntconsult.desafio_tecnico.service.SessaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/sessoes")
public class SessaoController {

    @Autowired
    private SessaoService sessaoService;

    @PostMapping("/abrir")
    public ResponseEntity<SessaoEntity> abrirSessao(
            @RequestParam Long pautaId,
            @RequestParam(required = false) Long duracaoEmMinutos) {
        return ResponseEntity.ok(sessaoService.abrirSessao(pautaId, duracaoEmMinutos));
    }
}
