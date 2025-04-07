package com.ntconsult.desafio_tecnico.repository;

import com.ntconsult.desafio_tecnico.entity.VotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VotoRepository extends JpaRepository<VotoEntity, Long> {
    boolean existsByAssociadoIdAndPautaId(Long associadoId, Long pautaId);
    List<VotoEntity> findByPautaId(Long pautaId);
}
