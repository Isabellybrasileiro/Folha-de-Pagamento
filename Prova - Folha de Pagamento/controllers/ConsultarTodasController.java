package controllers;

import java.util.ArrayList;
import models.ConsultarTodas;

public class ConsultarTodasController {
    private static ArrayList<ConsultarTodas> consultarTodas = new ArrayList<ConsultarTodas>();

    public void consultar(ConsultarTodas consultarTodas){
        consultarTodas.add(consultarTodas);
    }

    public ArrayList<ConsultarTodas> listar(){
        return consultarTodas;
    }
}