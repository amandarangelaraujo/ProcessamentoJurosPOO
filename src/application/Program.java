package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.DadosContrato;
import entities.Parcelas;
import servicos.ContractService;
import servicos.PayPal;


public class Program{
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Entre os dados do contrato: ");
        System.out.print("Numero do contrato: ");
        int numero = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato ");
        double totalValue = sc.nextDouble();
        System.out.print("Numero de parcelas:  ");
        int n = sc.nextInt();
        
        DadosContrato contrato = new DadosContrato(numero, date, totalValue);

        ContractService contractService = new ContractService(new PayPal());
        contractService.processarContrato(contrato, n);

        System.out.println("Parcelas: " );
        for(Parcelas parcela : contrato.getParcelas()){
            System.out.println(parcela);
        }
        
        sc.close();
    }
    
}
