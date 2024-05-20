package List.ExerciciosList.OperacoesBasicas;

import java.util.List;
import java.util.ArrayList;


public class ListaTarefa {
    // atributo

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<> ();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasremove = new ArrayList<>();

        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasremove.add(t);
            }
        }
        tarefaList.removeAll(tarefasremove);
    }

    public int obterNumeroTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTarefas());
        
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTarefas());
        
        listaTarefa.removerTarefa("Tarefa 2");
        
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTarefas());

        listaTarefa.obterDescricoesTarefas();

    }


}
