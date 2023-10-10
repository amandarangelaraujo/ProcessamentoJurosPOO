package entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
//poderia colcoar o formatter aqui?
public class DadosContrato {
    private int numeroContrato;
    private LocalDate dataContrato;
    private double valorTotalContrato;

    private List<Parcelas> Parcelas = new ArrayList<>();

    public List<Parcelas> getParcelas() {
        return Parcelas;
    }

    public void setParcelas(List<Parcelas> parcelas) {
        Parcelas = parcelas;
    }

    public DadosContrato(int numeroContrato, LocalDate date, double valorTotalContrato) {
        this.numeroContrato = numeroContrato;
        this.dataContrato = date;
        this.valorTotalContrato = valorTotalContrato;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public LocalDate getDataContrato() {
        return dataContrato;
    }

    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }

    public double getValorTotalContrato() {
        return valorTotalContrato;
    }


}
