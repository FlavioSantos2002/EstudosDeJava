package ExempleStrategy.scripts.modelPagamento.metodosDePagamento;

import ExempleStrategy.scripts.modelPagamento.PagamentoStrategy;

public class CartaoDeCredito implements PagamentoStrategy {

    @Override
    public void pagar(double valor) {
        System.out.println("pago como o cartão de credito no valor de " + valor);
    }
}
