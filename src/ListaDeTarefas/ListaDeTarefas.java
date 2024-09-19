package ListaDeTarefas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        ArrayList<String> tarefas = new ArrayList<>(); // ARMAZENAMENTO DE TAREFAS
        Scanner entrada = new Scanner(System.in); // INICIA O SCANNER DE ENTRADA
        boolean loop = true; // MANTÉM O LOOP ATIVO

        while (loop) { // RODA O CODIGO ENQUANTO A OPÇAO 5 NAO FOR DIGITADA
            System.out.println("""
                ||Lista De Tarefas||
                [1] Adicionar Tarefa
                [2] Ver Lista
                [3] Marcar Concluído
                [4] Remover item
                [5] ENCERRAR
                Digite um comando:
                """);
            int cmd;
            try {
                cmd = entrada.nextInt(); // DIGITAR COMANDO
                entrada.nextLine(); // CONSUMIR O RESTO DA ENTRADA ANTERIOR
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                entrada.next(); // CONSUMIR O RESTO DA ENTRADA ANTERIOR
                continue;
            }

            if (cmd < 1 || cmd > 5) {
                System.out.println("Comando inválido. Por favor, digite um número entre 1 e 5.");
                continue;
            }

            switch (cmd) {
                case 1:
                    // ADICIONAR TAREFA
                    System.out.println("Adicione uma Tarefa:");
                    String tarefa = entrada.nextLine();
                    if (tarefa.trim().isEmpty()) {
                        System.out.println("Tarefa vazia. Por favor, digite uma tarefa válida.");
                        break;
                    }
                    tarefas.add(tarefa);
                    System.out.println("Tarefa Adicionada!");
                    break;

                case 2:
                    // VER LISTA
                    if (!tarefas.isEmpty()) {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + " - " + tarefas.get(i));
                        }
                    } else {
                        System.out.println("Sua lista está vazia.");
                    }
                    break;

                case 3:
                    // MARCAR COMO CONCLUÍDA
                    if (!tarefas.isEmpty()) {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + " - " + tarefas.get(i));
                        }
                        System.out.print("Qual tarefa deseja concluir: ");
                        int concluir;
                        try {
                            concluir = entrada.nextInt() - 1;
                            entrada.nextLine(); // CONSUMIR O RESTO DA ENTRADA ANTERIOR
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: entrada inválida. Por favor, digite um número.");
                            entrada.next(); // CONSUMIR O RESTO DA ENTRADA ANTERIOR
                            break;
                        }

                        if (concluir >= 0 && concluir < tarefas.size()) {
                            String tarefaConcluida = tarefas.get(concluir) + " (Concluída)";
                            tarefas.set(concluir, tarefaConcluida);
                            System.out.println("Tarefa " + (concluir + 1) + " concluída!");
                        } else {
                            System.out.println("Número da tarefa inválido.");
                        }

                    } else {
                        System.out.println("Sua lista está vazia.");
                    }
                    break;

                case 4:
                    // REMOVER TAREFA
                    if (!tarefas.isEmpty()) {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println((i + 1) + " - " + tarefas.get(i));
                        }
                        System.out.println("Qual tarefa deseja excluir? ");
                        int excluir;
                        try {
                            excluir = entrada.nextInt() - 1;
                            entrada.nextLine(); // CONSUMIR O RESTO DA ENTRADA ANTERIOR
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: entrada inválida. Por favor, digite um número.");
                            entrada.next(); // CONSUMIR O RESTO DA ENTRADA ANTERIOR
                            break;
                        }

                        if (excluir >= 0 && excluir < tarefas.size()) {
                            tarefas.remove(excluir);
                            System.out.println("Tarefa excluída!");
                        } else {
                            System.out.println("Número da tarefa inválido.");
                        }
                    } else {
                        System.out.println("Sua lista está vazia.");
                    }
                    break;

                case 5:
                    // ENCERRAR LISTA
                    System.out.println("Encerrando Lista...");
                    loop = false;
                    break;

            }
        }
        entrada.close(); // Fechar o scanner
    }
}
