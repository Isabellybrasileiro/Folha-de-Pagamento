package views;
import controllers.ConsultarFolhaController;
import controllers.FolhaDePagamentoController;
import controllers.FuncionarioController;
import models.FolhaDePagamento;
import models.Funcionario;
import utils.Console;

public class ConsultarFolha {
    public void rendenizar(){
        ConsultarFolha consultarFolha = new ConsultarFolha();
        ConsultarFolhaController consultarFolhaController = new ConsultarFolhaController();
        FolhaDePagamentoController folhaDePagamentoController = new FolhaDePagamentoController();
        FuncionarioController funcionarioController = new FuncionarioController();

        System.out.println("\n -- CONSULTAR FOLHA DE PAGAMENTO --\n");
        String cpfFuncionario = Console.readString("Digite o CPF do cliente: ");
        Funcionario funcionario = funcionarioController.buscarPorCpf(cpfFuncionario);
        if (funcionario!= null);
    }

    
}
