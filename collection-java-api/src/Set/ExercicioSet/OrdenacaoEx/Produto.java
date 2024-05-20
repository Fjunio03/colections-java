package Set.ExercicioSet.OrdenacaoEx;

import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private long codigo;
    private String nome;
    private double valor;
    private int quantidade;

    public Produto(long codigo, String nome, int quantidade, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto{");
        sb.append("codigo=").append(codigo);
        sb.append(", nome=").append(nome);
        sb.append(", valor=").append(valor);
        sb.append(", quantidade=").append(quantidade);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) (this.codigo ^ (this.codigo >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Produto other = (Produto) obj;
        return this.codigo == other.codigo;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }



    
}

class ComparatorPorPreco implements Comparator<Produto>{
    
    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getValor(), p2.getValor());
    }
    
}
