package com.ntconsult.desafio_tecnico.service;

import com.ntconsult.desafio_tecnico.entity.PautaEntity;
import com.ntconsult.desafio_tecnico.entity.SessaoEntity;
import com.ntconsult.desafio_tecnico.repository.SessaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SessaoService {

    @Autowired
    private PautaService pautaService;

    @Autowired
    private SessaoRepository sessaoRepository;

    public SessaoEntity abrirSessao(Long pautaId, Long duracaoEmMinutos) {
        PautaEntity pauta = pautaService.buscarPorId(pautaId);

        if (pauta.getSessao() != null) throw new RuntimeException("Sessão já aberta para esta pauta");

        SessaoEntity sessao = new SessaoEntity();
        sessao.setPauta(pauta);
        sessao.setInicio(LocalDateTime.now());
        sessao.setFim(sessao.getInicio().plusMinutes(duracaoEmMinutos != null ? duracaoEmMinutos : 1));

        return sessaoRepository.save(sessao);
    }
}
