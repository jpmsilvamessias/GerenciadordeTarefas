package app;

import entites.Gerenciador;
import entites.Task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

   public class programing {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Gerenciador geren= new Gerenciador();

        DateTimeFormatter fmt =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        int opcao;
        do {
            System.out.println("Insira uma opção: 1-adcionar nova tarefa,2-Listar todas as tarefas,3- Marca como concluida,4-Remover, 5-sair");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    System.out.println("qual o id da tarefa?");
                    int id= sc.nextInt();
                    System.out.println("Qual o titulo da tarefa");
                    String titulo= sc.next();
                    System.out.println("Descrição");
                    String descrição= sc.next();
                    System.out.println("Data de vencimento?");
                    sc.nextLine();
                    LocalDateTime vencimento= LocalDateTime.parse(sc.nextLine(), fmt);
                    boolean status=false;
                    Task tarefa= new Task(id,titulo,descrição,vencimento,status);
                    geren.adcionar(tarefa);
                    break;
                case 2:
                    System.out.println("listando todas as tarefas");
                    geren.listar();
                    break;
                case 3:
                    System.out.println("informe o id para concluir");
                    int idc= sc.nextInt();
                    geren.marcarConcluida(idc);
                    break;
                case 4:
                    System.out.println("informe o id para remover");
                    int idr= sc.nextInt();
                    geren.remover(idr);
                    break;

                case 5:
                    System.out.println("encerando");
                    break;
                default:
                    System.out.println("insira uma opçao valida");
            }

        } while (opcao != 5);
    }
}
