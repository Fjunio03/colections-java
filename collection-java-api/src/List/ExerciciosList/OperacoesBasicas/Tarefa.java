package List.ExerciciosList.OperacoesBasicas;



public class Tarefa {
    //atributos
    private String descricao;

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + "]";
    }

    public String getDescricao() {
        return descricao;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    
}
