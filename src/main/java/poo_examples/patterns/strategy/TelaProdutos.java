package poo_examples.patterns.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import poo_examples.patterns.strategy.strategies.CartaoCreditoStrategy;
import poo_examples.patterns.strategy.strategies.PaypalStrategy;

/**
 * e-commerce - tela no console
 */
public class TelaProdutos {
    private Map<Integer, Integer> precoProdutos = new HashMap<Integer, Integer>();
    private BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
    private OrdemPagamento ordem = new OrdemPagamento();
    
    public TelaProdutos() {
    	precoProdutos.put(1, 2200);
        precoProdutos.put(2, 1850);
        precoProdutos.put(3, 1100);
        precoProdutos.put(4, 890);
	}
    
    public void build() throws IOException{
    	while (!ordem.isFechada()) {
            int cost;

            String continuar;
            do {
                System.out.print("Por favor, seleciona o produto:" + "\n" +
                        "1 - Mother board" + "\n" +
                        "2 - CPU" + "\n" +
                        "3 - HDD" + "\n" +
                        "4 - Memory" + "\n");
                int choice = Integer.parseInt(leitor.readLine());
                cost = precoProdutos.get(choice);
                System.out.print("Quantidade: ");
                int count = Integer.parseInt(leitor.readLine());
                ordem.setCustoTotal(cost * count);
                System.out.print("Você gostaria de continuar escolhendo produtos? S/N: ");
                continuar = leitor.readLine();
            } while (continuar.equalsIgnoreCase("S"));

            if (ordem.getStrategy() == null) {
                System.out.println("Por favor, selecione a forma de pagamento:" + "\n" +
                        "1 - PayPal" + "\n" +
                        "2 - Cartão de Crédito");
                String metodoPagamento = leitor.readLine();

                if (metodoPagamento.equals("1")) {
                    ordem.setStrategy(new PaypalStrategy());
                } else {
                	ordem.setStrategy(new CartaoCreditoStrategy());
                }
            }

            // processa a forma de pagamento
            ordem.processarOrdem();

            System.out.print("Pagamento de " + ordem.getCustoTotal() + " ou Continuar comprando? P/C: ");
            String processar = leitor.readLine();
            if (processar.equalsIgnoreCase("P")) {
                // realiza o pagamento
                if (ordem.finalizar()) {
                    System.out.println("O pagamento foi realizado com sucesso.");
                } else {
                    System.out.println("Falhou! Por favor, verifique seus dados.");
                }
                ordem.setFechada();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new TelaProdutos().build();
    }
}
