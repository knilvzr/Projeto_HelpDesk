/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controledechamados;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author evely
 */
public class Chamado {
    private Long id;
    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private Status statusChamado;
    private LocalDateTime dataAbertura;
    private LocalDateTime dataEncerramento;
    private List<Atendimento> historico;
    private Cliente cliente;
    private Tecnico tecnico;
    

    public Chamado(long id, String titulo, String descricao, Prioridade prioridade, Cliente cliente) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.statusChamado = Status.aberto;
        this.dataAbertura = LocalDateTime.now();
        this.historico = new ArrayList<>();
        this.cliente = cliente;
    }
    
    

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public Status getStatusChamado() {
        return statusChamado;
    }

    public LocalDateTime getDataAbertura() {
        return dataAbertura;
    }

    public LocalDateTime getDataEncerramento() {
        return dataEncerramento;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public void setStatusChamado(Status statusChamado) {
        this.statusChamado = statusChamado;
    }

    public void setDataAbertura(LocalDateTime dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void setDataEncerramento(LocalDateTime dataEncerramento) {
        this.dataEncerramento = dataEncerramento;
    }
    
    public void atribuirTecnico(Tecnico tecnico){ 
        if (statusChamado == Status.aberto) {
            this.tecnico = tecnico;
            this.statusChamado = Status.em_atendiento;
            System.out.println(
                "Chamado atribuído ao técnico com sucesso."
            );
        } else {
            System.out.println(
                "Não é possível assumir o chamado, pois ele não está ABERTO."
            );
        }
    }     
  
    public void alterarStatus(Status statusChamado){
        this.statusChamado = statusChamado;
        
    }
    public boolean estaAberto() {
        return statusChamado == Status.aberto;
    }
     public void registrarAtendimento(Atendimento atendimento){  
         historico.add(atendimento);
    }
    
     public void encerrar(){
        if (historico.isEmpty()) {
            System.out.println(
                "Não é possível encerrar o chamado sem atendimento."
            );

        } else {
            this.statusChamado = Status.encerrado;
            this.dataEncerramento = LocalDateTime.now();
            System.out.println("Chamado encerrado com sucesso");
        }   
     }
} 
    
    

