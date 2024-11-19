package com.example.tp3_punto4;


import java.util.List;

public class Paciente{



    private String cuil;
    private HistoriaClinica historiaClinica;



    public Paciente(String cuil, List<String> diagnosticos) {

        this.cuil = cuil;
        this.historiaClinica = new HistoriaClinica(diagnosticos);
    }

    public Diagnostico buscarDiagnostico(String diagnosticoElegido){
        Diagnostico diagnostico =  this.historiaClinica.buscarDiagnostico(diagnosticoElegido);
        return diagnostico;
    }

    public void agregarEvolucion(String diagnosticoElegido,String textoEvolucion,Medico medico){

        this.historiaClinica.agregarEvolucion(diagnosticoElegido,textoEvolucion,medico);

    }

}
