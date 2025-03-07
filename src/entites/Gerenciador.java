package entites;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador {

    List<Task> tarefa= new ArrayList<>();


    public List<Task> getTarefa() {
        return tarefa;
    }

    public  void adcionar( Task tarefa){
        getTarefa().add(tarefa);
    }

    public void listar(){
        for(Task a : tarefa){
            System.out.println(a);
        }
    }

    public void remover(int id) {
        tarefa.removeIf(t -> t.getId() == id);
    }


    public void marcarConcluida(int id) {
        for (Task t : tarefa) {
            if (t.getId() == id) {
                t.setStatus(true);
                System.out.println("Tarefa marcada como concluída!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }


}
