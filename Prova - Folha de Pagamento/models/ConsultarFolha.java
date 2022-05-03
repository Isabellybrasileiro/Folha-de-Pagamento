package models;

public class ConsultarFolha {
    private int salarioBruto;
    private int ImpostoDeRenda;
    private int inss;
    private int fgts;
    private int salarioLiquido;

    public int getSalarioBruto() {
        return salarioBruto;
    }
    public int getSalarioLiquido() {
        return salarioLiquido;
    }
    public void setSalarioLiquido(int salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }
    public int getFgts() {
        return fgts;
    }
    public void setFgts(int fgts) {
        this.fgts = fgts;
    }
    public int getInss() {
        return inss;
    }
    public void setInss(int inss) {
        this.inss = inss;
    }
    public int getImpostoDeRenda() {
        return ImpostoDeRenda;
    }
    public void setImpostoDeRenda(int impostoDeRenda) {
        this.ImpostoDeRenda = impostoDeRenda;
    }
    public void setSalarioBruto(int salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    public void add(ConsultarFolha consultarFolha) {
    }

}
