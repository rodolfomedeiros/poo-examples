package poo_examples.patterns.strategy.strategies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PaypalStrategy implements PagamentoStrategy {
    private final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String senha;
    private boolean logado;

    public PaypalStrategy() {
    	DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }
        
    @Override
    public void coletarDetalhesPagamento() {
        try {
            while (!logado) {
                System.out.print("Informe o email: ");
                email = READER.readLine();
                System.out.print("Informe a senha: ");
                senha = READER.readLine();
                if (verificar()) {
                    System.out.println("Verificação de dados concluidas.");
                } else {
                    System.out.println("email e/ou senha inválidos!");
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verificar() {
        setLogado(email.equals(DATA_BASE.get(senha)));
        return logado;
    }

    @Override
    public boolean pagar(int valor) {
        if (logado) {
            System.out.println("Pagando " + valor + " usando o Paypal.");
            return true;
        } else {
            return false;
        }
    }

    private void setLogado(boolean logado) {
        this.logado = logado;
    }
}
