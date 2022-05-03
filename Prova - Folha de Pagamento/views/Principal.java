package views;

import models.ConsultarTodas;
import utils.Console;

public class Principal{
    public static void main(String[] args) {
        int opcao = 0;

        do{
            System.out.println("\n -- FOLHA DE PAGAMENTO --\n");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Cadastrar Folha de Pagamento");
            System.out.println("3 - Consultar Folha de Pagamento");
            System.out.println("4 - Consultar todas as folhas de pagamento");
            System.out.println("0 - Sair\n");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao){
                case 1:
                CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
                cadastrarFuncionario.rendenizar();
                break;
                case 2:
                CadastrarFolhaDePagamento cadastrarFolhaDePagamento = new CadastrarFolhaDePagamento();
                cadastrarFolhaDePagamento.rendenizar();
                break;
                case 3:
                ConsultarFolha consultarFolha = new ConsultarFolha();
                consultarFolha.rendenizar();
                case 4:
                ConsultarTodas consultarTodas = new ConsultarTodas();
                consultarTodas.rendenizar();


            }

        } while (opcao != 0);
    }
}