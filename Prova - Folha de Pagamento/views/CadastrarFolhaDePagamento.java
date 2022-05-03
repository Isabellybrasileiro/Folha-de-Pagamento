package views;

import controllers.FolhaDePagamentoController;
import models.FolhaDePagamento;
import utils.Console;

public class CadastrarFolhaDePagamento {
    public void rendenizar(){
        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
        FolhaDePagamentoController folhaDePagamentoController = new FolhaDePagamentoController();
        System.out.println("\n -- CADASTRO DE FOLHA DE PAGAMENTO --\n");
        folhaDePagamento.setMes(Console.readInt("Digite o mês: "));
        folhaDePagamento.setAno(Console.readInt("Digite o ano: "));
        folhaDePagamento.setHorasTrabalhadas(Console.readInt("Digite a quantidade de horas trabalhadas: "));
        folhaDePagamento.setValorHora(Console.readDouble("Digite o valor da hora: "));
        folhaDePagamentoController.cadastrar(folhaDePagamento);
        System.out.println("\nFolha de pagamento cadastrada !!!");
    }
}
