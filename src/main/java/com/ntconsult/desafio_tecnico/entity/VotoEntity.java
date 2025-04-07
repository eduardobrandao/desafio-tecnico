package com.ntconsult.desafio_tecnico.entity;

import com.ntconsult.desafio_tecnico.enums.VotoEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class VotoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long associadoId;

    @Enumerated(EnumType.STRING)
    private VotoEnum voto;

    @ManyToOne
    @JoinColumn(name = "pauta_id")
    private PautaEntity pauta;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAssociadoId() {
        return associadoId;
    }

    public void setAssociadoId(Long associadoId) {
        this.associadoId = associadoId;
    }

    public VotoEnum getVoto() {
        return voto;
    }

    public void setVoto(VotoEnum voto) {
        this.voto = voto;
    }

    public PautaEntity getPauta() {
        return pauta;
    }

    public void setPauta(PautaEntity pauta) {
        this.pauta = pauta;
    }
}
