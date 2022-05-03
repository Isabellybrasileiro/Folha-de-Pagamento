package views;

import controllers.FuncionarioController;
import models.Funcionario;
import utils.Console;

public class CadastrarFuncionario {
    public void rendenizar(){
        Funcionario funcionario = new Funcionario();
        FuncionarioController funcionarioController = new FuncionarioController();
        System.out.println("\n -- CADASTRO DE FUNCIONÁRIO --\n");
        funcionario.setNome(Console.readString("Digite o nome do funcionário: "));
        funcionario.setCpf(Console.readString("Digite o CPF do funcionário: "));
        funcionarioController.cadastrar(funcionario);
        System.out.println("\nFuncionário cadastrado!!!\n");
    }
}
