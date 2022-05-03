package views;
import controllers.ConsultarFolhaController;
import controllers.FolhaDePagamentoController;
import controllers.FuncionarioController;
import models.FolhaDePagamento;
import models.Funcionario;
import utils.Console;

public class ConsultarTodas {
    public void rendenizar(){
        ConsultarFolha consultarFolha = new ConsultarFolha();
        ConsultarFolhaController consultarFolhaController = new ConsultarFolhaController();
        FolhaDePagamentoController folhaDePagamentoController = new FolhaDePagamentoController();
        FuncionarioController funcionarioController = new FuncionarioController();

        System.out.println("\n -- CONSULTAR TODAS AS FOLHAS DE PAGAMENTO --\n");
    }
}
