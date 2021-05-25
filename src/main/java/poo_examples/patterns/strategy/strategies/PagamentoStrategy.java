package poo_examples.patterns.strategy.strategies;

/**
 * Common interface for all strategies.
 */
public interface PagamentoStrategy {
    boolean pagar(int valor);
    void coletarDetalhesPagamento();
}
