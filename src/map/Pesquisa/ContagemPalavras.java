package map.Pesquisa;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavras = new HashMap();

    public ContagemPalavras() {
    }

    public void adicionarPalavras(String linguagem, Integer contagem){
        this.palavras.put(linguagem,contagem);
    }

    public void removerPalavra(String palavra){
        if (!this.palavras.isEmpty()){
            this.palavras.remove(palavra);
        } else {
            System.out.println("O map está vazio");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;
        int contagem;
        for (Iterator var2 = this.palavras.values().iterator(); var2.hasNext(); contagemTotal += contagem) {
            contagem = (Integer) var2.next();
        }
        return contagemTotal;
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        Iterator var3 = this.palavras.entrySet().iterator();

        while(var3.hasNext()) {
            Map.Entry<String, Integer> entry = (Map.Entry)var3.next();
            if ((Integer)entry.getValue() > maiorContagem) {
                maiorContagem = (Integer)entry.getValue();
                linguagemMaisFrequente = (String)entry.getKey();
            }
        }

        return linguagemMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();
        contagemLinguagens.adicionarPalavras("Java", 2);
        contagemLinguagens.adicionarPalavras("Python", 8);
        contagemLinguagens.adicionarPalavras("JavaScript", 1);
        contagemLinguagens.adicionarPalavras("C#", 6);
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavrasMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}
