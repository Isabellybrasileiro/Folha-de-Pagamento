package models;

public class ConsultarTodas {
    private String nome;
    private int data;
    private int salarioBruto;
    private int ImpostoDeRenda;
    private int inss;
    private int fgts;
    private int salarioLiquido;

    public String getNome() {
        return nome;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
        " | Data: " + data +
        " | Salário Bruto: " + salarioBruto + 
        " | Imposto de Renda: " + ImpostoDeRenda + 
        " | INSS: " + inss +
        " | FGTS: " + fgts +
        " | Salário Líquido: " + salarioLiquido;
    }
    public void rendenizar() {
    }
    public void add(ConsultarTodas consultarTodas) {
    }
}
