/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controledechamados;

import java.time.LocalDateTime;


/**
 *
 * @author evely
 */
public class Atendimento {
    private Long id;
    private LocalDateTime dataHora;
    private String descricao;
    private Tecnico realizadoPor;
    
    public Atendimento(long id) {
        this.id = id;
    }
   

    public Long getId() {
        return id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public Tecnico getRealizadoPor() {
        return realizadoPor;
    }
    
    public void Registrar(String descricao, Tecnico tecnico){
        this.descricao = descricao;
        this.realizadoPor = tecnico;
        this.dataHora = LocalDateTime.now();
    }
    
    
    
}
