package poo_examples.patterns.strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import poo_examples.patterns.strategy.models.CartaoCredito;

public class CartaoCreditoStrategy implements PagamentoStrategy {
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private CartaoCredito card;

    @Override
    public void coletarDetalhesPagamento() {
        try {
            System.out.print("Entre com o número do cartão: ");
            String numero = READER.readLine();
            System.out.print("Entre com a validade do cartão 'mm/yy': ");
            String validade = READER.readLine();
            System.out.print("Entre com o código CVV: ");
            String cvv = READER.readLine();
            card = new CartaoCredito(numero, validade, cvv);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean pagar(int valor) {
        if (isExiste()) {
            System.out.println("Pagando " + valor + " usando o cartão de crédito.");
            card.setLimite(card.getLimite() - valor);
            return true;
        } else {
            return false;
        }
    }

    private boolean isExiste() {
        return card != null;
    }
}
