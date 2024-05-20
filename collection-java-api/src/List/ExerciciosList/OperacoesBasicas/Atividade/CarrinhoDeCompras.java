package List.ExerciciosList.OperacoesBasicas.Atividade;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import List.ExerciciosList.OperacoesBasicas.Tarefa;


public class CarrinhoDeCompras {
    
    private List<Item> compras = new ArrayList();

    public CarrinhoDeCompras() {
    }


    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.compras.add(item);
    }

    public void removerItem(String nome){
        List<Tarefa> removeitens = new ArrayList<>();

        if(!this.compras.isEmpty()){
            Iterator var3 = this.compras.iterator();

            while(var3.hasNext()){
                Item i = (Item)var3.next();
                if(i.getNome().equalsIgnoreCase(nome)){
                    removeitens.add(i);
                }
            }
            this.compras.removeAll(removeitens);
        }else{
            System.out.println("A lista est\u00e1 vazia!");
        }
        
    }

    public double calcularValorTotal(){
        double valorTotal = 0.0;
        if (this.compras.isEmpty()) {
            throw new RuntimeException("A lista est\u00e1 vazia!");
        }else{
            double valorItem;
            for(Iterator var3 = this.compras.iterator(); var3.hasNext(); valorTotal += valorItem){
                Item item = (Item)var3.next();
                valorItem = item.getPreco() * (double)item.getQuantidade();

            }
            return valorTotal;
        }
    }
    public void exibirItens(){
        if (!this.compras.isEmpty()) {
            System.out.println(this.compras);
         } else {
            System.out.println("A lista est\u00e1 vazia!");
         }
    }
    public String toString() {
        return "CarrinhoDeCompras{itens=" + this.compras + "}";
     }

     public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("L\u00e1pis", 2.0, 3);
        carrinhoDeCompras.adicionarItem("L\u00e1pis", 2.0, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35.0, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2.0, 2);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("L\u00e1pis");
        carrinhoDeCompras.exibirItens();
        System.out.println("O valor total da compra \u00e9 = " + carrinhoDeCompras.calcularValorTotal());
     }

    
}
