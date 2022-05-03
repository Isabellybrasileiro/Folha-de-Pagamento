package models;

public class FolhaDePagamento {
    
    private String cpf;
    private int mes;
    private int ano;
    private int horasTrabalhadas;
    private double valorHora;


    public int getMes() {
        return mes;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    @Override
    public String toString() {
        return "Cpf: " + cpf +
        "Mês: " + mes +
        " | Ano: " + ano +
        " | Horas Trabalhadas: " + horasTrabalhadas +
        " | Valor da hora: " + valorHora;
    }

}
