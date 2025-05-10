package ExempleStrategy.scripts.modelPagamento;

public class PagamentoService {

    private PagamentoStrategy pagamentoStrategy;


    public void setStrategy(PagamentoStrategy pagamentoStrategy){
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void realizarPagamento(double valor){
        pagamentoStrategy.pagar(valor);
    }

}
