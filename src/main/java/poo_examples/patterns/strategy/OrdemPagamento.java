package poo_examples.patterns.strategy;

import poo_examples.patterns.strategy.strategies.PagamentoStrategy;

/**
 * Order class. Doesn't know the concrete payment method (strategy) user has
 * picked. It uses common strategy interface to delegate collecting payment data
 * to strategy object. It can be used to save order to database.
 */
public class OrdemPagamento {
    private int custoTotal = 0;
    private boolean fechada = false;
    private PagamentoStrategy strategy;

    public void processarOrdem() {
        strategy.coletarDetalhesPagamento();
        // Here we could collect and store payment data from the strategy.
    }

    public void setCustoTotal(int cost) {
        this.custoTotal += cost;
    }

    public int getCustoTotal() {
        return custoTotal;
    }

    public boolean isFechada() {
        return fechada;
    }

    public void setFechada() {
        fechada = true;
    }

	public PagamentoStrategy getStrategy() {
		return strategy;
	}

	public void setStrategy(PagamentoStrategy strategy) {
		this.strategy = strategy;
	}
	
	public boolean finalizar() {
		return strategy.pagar(getCustoTotal());
	}
}

