package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> itemList;

    public CarrinhoCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : itemList){
            if (i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public void calcularValorTotal(){
        double total = 0.0;
        for (Item i : itemList){
            total += i.getQuantidade() * i.getPreco();
        }
        System.out.println("Total: R$ " + total);;
    }

//    public double calcularValorTotal(){
//        for (Item i : itemList){
//            i.total(i.getPreco(), i.getQuantidade());
//            return i.total();
//        }
//        return itemList.total;
//    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("Maçã", 8.7, 2);
        carrinhoCompras.adicionarItem("Leite", 2.45, 3);
        carrinhoCompras.adicionarItem("Biscoito", 4.56, 5);
        carrinhoCompras.exibirItens();
        carrinhoCompras.calcularValorTotal();

    }


}
