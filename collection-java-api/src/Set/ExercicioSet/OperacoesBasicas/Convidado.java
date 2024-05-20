package Set.ExercicioSet.OperacoesBasicas;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Convidado{");
        sb.append("nome=").append(nome);
        sb.append(", codigoConvite=").append(codigoConvite);
        sb.append('}');
        return sb.toString();
    }


    
}
