package servicos;

public class PayPal implements ServicoPagamentoOnline {
    public double taxPagamento(double amount){

       return amount * 0.02;
    }
    public double juros(double amount, int months){ 
        return amount * 0.01 * months; //juros de amount apos a quantidade de mes
        
    }
}
