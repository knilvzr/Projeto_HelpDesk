/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controledechamados;

/**
 *
 * @author evely
 */
public class Cliente extends Usuario{
    private String cpfCnpj;
    private String endereco;

    public Cliente(String cpfCnpj, String endereco, Long id, String nome, String email, String telefone) {
        super(id, nome, email, telefone);
        this.cpfCnpj = cpfCnpj;
        this.endereco = endereco;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    
 
}
