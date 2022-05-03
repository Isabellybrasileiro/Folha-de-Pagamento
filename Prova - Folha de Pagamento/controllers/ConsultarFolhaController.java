package controllers;

import java.util.ArrayList;
import models.ConsultarFolha;

public class ConsultarFolhaController {
    private static ArrayList<ConsultarFolha> consultarFolhas = new ArrayList<ConsultarFolha>();

    public void consultar(ConsultarFolha consultarFolha){
        consultarFolha.add(consultarFolha);
    }

    public ArrayList<ConsultarFolha> listar(){
        return consultarFolhas;
    }
}
