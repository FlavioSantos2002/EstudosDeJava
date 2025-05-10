package ExempleStrategy.scripts.modelPagamento.metodosDePagamento;

import ExempleStrategy.scripts.modelPagamento.PagamentoStrategy;

public class PayPal implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("pagamento feito com PayPal no valor de " +  valor);
    }
}
