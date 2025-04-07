package com.ntconsult.desafio_tecnico.service;

import com.ntconsult.desafio_tecnico.entity.PautaEntity;
import com.ntconsult.desafio_tecnico.repository.PautaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PautaService {

    @Autowired
    private PautaRepository pautaRepository;

    public PautaEntity criar(String titulo) {
        PautaEntity pauta = new PautaEntity();
        pauta.setTitulo(titulo);
        return pautaRepository.save(pauta);
    }

    public PautaEntity buscarPorId(Long id) {
        return pautaRepository.findById(id).orElseThrow(() -> new RuntimeException("Pauta não encontrada"));
    }
}
