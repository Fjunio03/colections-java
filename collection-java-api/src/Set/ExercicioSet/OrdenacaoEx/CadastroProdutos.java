package Set.ExercicioSet.OrdenacaoEx;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    //atributos

    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double valor, int quant){
        produtosSet.add(new Produto(cod, nome, quant, valor));
    }

    public Set<Produto> exibirProdutosNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);

        return produtosPorNome;
    }


    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosSet.addAll(produtosSet);
        
        return  produtosPorPreco;
    }
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000.0, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500.0, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30.0, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50.0, 15);
        System.out.println(cadastroProdutos.produtosSet);
        System.out.println(cadastroProdutos.exibirProdutosNome());
        System.out.println(cadastroProdutos.exibirPorPreco());
     }



}
