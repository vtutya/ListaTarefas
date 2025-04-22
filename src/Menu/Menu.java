package Menu;

import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        var gerenciador = new Servico.GerenciadorDeTarefas();
        int opcao = 0;

        while(opcao != 5){
            System.out.println("Menu:");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Listar Tarefas");
            System.out.println("3 - Remover Tarefa");
            System.out.println("4 - Marcar Tarefa como Concluída");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitura.nextInt();
            leitura.nextLine();

            if (opcao == 1){
                System.out.println("Digite o titulo da tarefa:");
                String titulo = leitura.nextLine();

                System.out.println("Digite a descrição da tarefa: ");
                String descricao = leitura.nextLine();




                var tarefa = new Modelos.Tarefa(titulo, descricao, java.time.LocalDate.now(), false);
                gerenciador.adicionarTarefa(tarefa);

                System.out.println("Tarefa adicionada com sucesso.");

            }else if (opcao == 2){
                System.out.println("Listando tarefas...");
                gerenciador.listarTarefas();

            }else if (opcao == 3){
                System.out.println("Digite o titulo da tarefa que deseja remover: ");
                String tituloRemover = leitura.nextLine();

                var tarefaRemover = new Modelos.Tarefa(tituloRemover, "", LocalDate.now(), false);

                System.out.println("Tarefa removida com sucesso.");

            }else if (opcao == 4){
                System.out.println("Digite o titulo da tarefa que deseja marcar como concluida: ");
                String tituloConcluida = leitura.nextLine();

                var tarefa = gerenciador.buscarPeloTitulo(tituloConcluida);
                if (tarefa != null){
                    tarefa.marcarConcluida();
                    System.out.println("Tarefa marcada como concluída.");

                } else {
                    System.out.println("Tarefa não encontrada.");
                }
            }else if (opcao == 5){
                System.out.println("Saindo...");
                break;
            }
            else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    leitura.close();
    }
}
