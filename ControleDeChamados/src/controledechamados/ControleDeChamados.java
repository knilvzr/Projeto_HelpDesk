/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controledechamados;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author evely
 */
public class ControleDeChamados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cliente cliente = new Cliente (
                null,
                null,
                null,
                null,
                null,
                null
        );
        List<Cliente> clientes = new ArrayList<Cliente>();
        
        System.out.print("Digite o título do chamado: ");
        String titulo = entrada.nextLine();

        System.out.print("Digite a descrição do problema: ");
        String descricao = entrada.nextLine();

        System.out.print("Digite a prioridade (BAIXA, MEDIA ou ALTA): ");
        Prioridade prioridade = Prioridade.valueOf(
            entrada.nextLine()
        ); 
        Chamado chamado = new Chamado(
            1L,
            titulo,
            descricao,
            prioridade,
            cliente
        );
        Tecnico tecnico = null;
   
        
        Tecnico[] tec = {
            tecnico = new Tecnico("especialidade",
                1L,
                "nome",
                "email",
                "11999999999"),
            tecnico = new Tecnico ( "especialidade2",
                2L,
                "nome2",
                "email2",
                "119999999992"
            )
        };
        
        Atendimento atendimento = new Atendimento (
                chamado.getId()     
        );
        
        System.out.println("Menu Controle Chamados");
        System.out.println("1-cadastro de cliente \n 2-historico de chamados \n 3-  \n 0- finalizar");
        String mensagem = entrada.nextLine();

            while (!"0".equals(mensagem)){
                if ("1".equals(mensagem)){
                    if (cliente.getId() == null && "1".equals(mensagem)){
                        chamado.alterarStatus(Status.aguardando_cliente);
                        System.out.println("cadastre o cliente para continuar");
                        System.out.println("cpf ou cnpj");
                        String cpfCnpj = entrada.nextLine();
                        System.out.println("endereco");
                        String endereco = entrada.nextLine();
                        System.out.println("nome");
                        String nome = entrada.nextLine();
                        System.out.println("email");
                        String email = entrada.nextLine();
                        System.out.println("telefone");
                        String telefone = entrada.nextLine();
                        cliente.setCpfCnpj(cpfCnpj);
                        cliente.setEmail(email);
                        cliente.setNome(nome);
                        cliente.setEndereco(endereco);
                        cliente.setTelefone(telefone);
                        cliente.setId(Long.MIN_VALUE);
                        chamado.alterarStatus(Status.aberto); 
                        chamado.atribuirTecnico(tecnico);
                        chamado.registrarAtendimento(atendimento);
                        System.out.println("Menu Controle Chamados");
                        System.out.println("1-cadastro de cliente \n 2-historico de chamados \n 3-  \n 0- finalizar");
                        mensagem = entrada.nextLine();
                        clientes.add(cliente);
                        System.out.println(clientes);
                }   
                    else {
                        chamado.alterarStatus(Status.aberto); 
                        chamado.atribuirTecnico(tecnico);
                        chamado.registrarAtendimento(atendimento);
                    }
                }
                if ("2".equals(mensagem)){
                    System.out.println(chamado.getHistorico());
                    mensagem = entrada.nextLine();
                }
                if ("3".equals(mensagem)) {
                    
                }

        
        } 
        

    }
}

