package servicos;

public interface ServicoPagamentoOnline {
    double taxPagamento(double amount);
    double juros(double amount, int months);
}
