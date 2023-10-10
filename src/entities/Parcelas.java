package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelas {

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private double quantidadeParcelas;
    private LocalDate dataVencimento;

    public Parcelas(){

    }
    public Parcelas(double quantidadeParcelas, LocalDate dataVencimento) {
        this.quantidadeParcelas = quantidadeParcelas;
        this.dataVencimento = dataVencimento;
    }
    
    public double getQuantidadeParcelas() {
        return quantidadeParcelas;
    }
    public void setQuantidadeParcelas(double quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }
    public LocalDate getDataVencimento() {
        return dataVencimento;
    }
    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }


    @Override
    public String toString() {
        return dataVencimento.format(fmt) + " - " + String.format("%.2f",quantidadeParcelas);
    }
    
    

}
