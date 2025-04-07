package com.ntconsult.desafio_tecnico.service;

import com.ntconsult.desafio_tecnico.entity.PautaEntity;
import com.ntconsult.desafio_tecnico.entity.SessaoEntity;
import com.ntconsult.desafio_tecnico.entity.VotoEntity;
import com.ntconsult.desafio_tecnico.enums.VotoEnum;
import com.ntconsult.desafio_tecnico.repository.VotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service
public class VotoService {

    @Autowired
    private VotoRepository votoRepository;

    @Autowired
    private PautaService pautaService;

    public void votar(Long pautaId, Long associadoId, VotoEnum votoEnum) {
        if (votoRepository.existsByAssociadoIdAndPautaId(associadoId, pautaId)) {
            throw new RuntimeException("Associado já votou nessa pauta");
        }

        PautaEntity pauta = pautaService.buscarPorId(pautaId);
        SessaoEntity sessao = pauta.getSessao();

        if (sessao == null || LocalDateTime.now().isAfter(sessao.getFim())) {
            throw new RuntimeException("Sessão encerrada ou não iniciada");
        }

        VotoEntity voto = new VotoEntity();
        voto.setPauta(pauta);
        voto.setAssociadoId(associadoId);
        voto.setVoto(votoEnum);
        votoRepository.save(voto);
    }

    public Map<VotoEnum, Long> resultado(Long pautaId) {
        List<VotoEntity> votos = votoRepository.findByPautaId(pautaId);
        return votos.stream()
                .collect(Collectors.groupingBy(VotoEntity::getVoto, Collectors.counting()));
    }
}
