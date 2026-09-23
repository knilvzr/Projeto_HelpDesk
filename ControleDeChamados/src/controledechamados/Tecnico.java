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
public class Tecnico extends Usuario{
    private String especialidade;
    private LocalDateTime dataCadastro;

    public Tecnico(String especialidade, Long id, String nome, String email, String telefone) {
        super(id, nome, email, telefone);
        this.especialidade = especialidade;
        this.dataCadastro = dataCadastro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }  

    
}
