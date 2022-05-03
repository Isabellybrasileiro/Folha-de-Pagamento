package models;

public class Funcionario {

    private String nome;
    private String cpf;

    
    public String getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String string) {
        this.cpf = string;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
        " | CPF: " + cpf;
    }
    
}
