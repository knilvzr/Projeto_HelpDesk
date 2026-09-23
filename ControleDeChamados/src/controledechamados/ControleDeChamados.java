/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controledechamados;
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

        Cliente cliente = new Cliente(
            "12345678900",
            "endereco",
            123098098098L,
            "nome",
            "email",
            "119888888"
        );

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

        Tecnico tecnico = new Tecnico(
                "especialidade",
                1L,
                "nome",
                "email",
                "11999999999"
                
        );

        if (chamado.estaAberto()) {

            System.out.println("Chamado disponível para atendimento.");
            chamado.atribuirTecnico(tecnico);
            Atendimento atendimento = new Atendimento(1);
            System.out.print(
                "Digite a descrição da solução ou ação realizada: "
            );
            String descricaoAtendimento = entrada.nextLine();
            
            atendimento.Registrar(
                descricaoAtendimento,
                tecnico        
            );

            chamado.registrarAtendimento(atendimento);
            chamado.encerrar();
        } else {
            System.out.println(
                "O chamado não está disponível para atendimento."
            );
        }
        entrada.close();
    
    }
    
}
