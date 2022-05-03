package controllers;

import java.util.ArrayList;
import models.FolhaDePagamento;

public class FolhaDePagamentoController {
    private static ArrayList<FolhaDePagamento> folhaDePagamentos = new ArrayList<FolhaDePagamento>();

    public void cadastrar(FolhaDePagamento folhaDePagamento){
        folhaDePagamentos.add(folhaDePagamento);
    }

    public ArrayList<FolhaDePagamento> listar(){
        return folhaDePagamentos;
    }

    public FolhaDePagamento buscarPorCpf(String cpf){
        for(FolhaDePagamento folhaDePagamentoCadastrada : folhaDePagamentos){
            if(folhaDePagamentoCadastrada.getCpf().equals(cpf)){
                return folhaDePagamentoCadastrada;
            }
        }
        return null;
    }

   
}
