package com.example.tp3_punto4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static  org.assertj.core.api.Assertions.*;

public class HistoriaClinicaTests {

    HistoriaClinica historiaClinica;

    @BeforeEach
    public void setup(){
        List<String> diagnosticos = new ArrayList<>(){
            {
                add("Dengue");
                add("Covid");
                add("Neumonia");
            }
        };

        historiaClinica = new HistoriaClinica(diagnosticos);
    }

    @Test
    public void seBuscaDiagnosticoExistenteEnLaHistoriaClinica(){

        Diagnostico diagnosticoBuscado =  historiaClinica.buscarDiagnostico("Dengue");
        assertThat(diagnosticoBuscado).isNotNull();
        assertThat(diagnosticoBuscado.getNombre()).isEqualTo("Dengue");
    }

}
