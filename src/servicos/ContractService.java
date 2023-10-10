package servicos;

import java.time.LocalDate;

import entities.DadosContrato;
import entities.Parcelas;

public class ContractService {
    //responsavel por processar o contrato e gerar as parcelas
    private ServicoPagamentoOnline servicoPagamentoOnline;

    
    public ContractService() {
    }

    public ContractService(ServicoPagamentoOnline servicoPagamentoOnline) {
        this.servicoPagamentoOnline = servicoPagamentoOnline;
    }

    //estrutura do servico
    public void processarContrato(DadosContrato dadosContrato, int months){

        double basicQuota = dadosContrato.getValorTotalContrato()/months;

        for (int i = 1; i<=months; i++){
           LocalDate dueDate = dadosContrato.getDataContrato().plusMonths(i);
           
           double juros = servicoPagamentoOnline.juros(basicQuota, i);
           double fee = servicoPagamentoOnline.taxPagamento(basicQuota + juros);
           double quota = basicQuota + juros + fee;
           
           dadosContrato.getParcelas().add(new Parcelas(quota, dueDate));


        }
    }
    
}
