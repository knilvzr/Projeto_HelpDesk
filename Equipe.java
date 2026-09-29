/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controledechamados;


/**
 *
 * @author evely
 */
public class Equipe {
    private Long id;
    private String nome;
    private String descricao;

    public Equipe(Long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }


    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Long getId(){
        return id;
    }
    
}
