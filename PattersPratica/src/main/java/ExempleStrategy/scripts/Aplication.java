package ExempleStrategy.scripts;

import ExempleStrategy.scripts.modelPagamento.PagamentoService;
import ExempleStrategy.scripts.modelPagamento.metodosDePagamento.CartaoDeCredito;
import ExempleStrategy.scripts.modelPagamento.metodosDePagamento.PayPal;

public class Aplication {
    public static void main(String[] arg){

        PagamentoService novoPagemento =  new PagamentoService();

        novoPagemento.setStrategy(new CartaoDeCredito());

        novoPagemento.realizarPagamento(45);

        //setando o tipo de pagamento para paypal

        novoPagemento.setStrategy(new PayPal());

        novoPagemento.realizarPagamento(80.56);

    }
}
