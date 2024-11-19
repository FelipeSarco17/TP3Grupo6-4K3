package com.example.tp3_punto4;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class DiagnosticoTests {

    private Diagnostico diagnostico = new Diagnostico("Dengue");

    @Test
    public void seAgregaUnaEvolucionAlDiagnostico(){

        String textoEvolucion = "El paciente ya no presenta fiebre.";
        Medico medico = new Medico("Juan",123);
        diagnostico.agregarEvolucion(textoEvolucion,medico);
        assertThat(diagnostico.getEvoluciones().getLast().getMedico()).isEqualTo(medico);
        assertThat(diagnostico.getEvoluciones().getLast().getTexto()).isEqualTo(textoEvolucion);

    }

    @Test
    public void seBuscaEvolucionInexistenteEnElDiagnostico(){
        String textoEvolucion = "El paciente ya no presenta fiebre";
        Medico medico = new Medico("Juan",123);
        assertThat(diagnostico.tieneEvolucion(medico,textoEvolucion)).isFalse();
    }

    @Test
    public void seBuscaEvolucionExistenteEnElDiagnostico(){
        String textoEvolucion = "El paciente ya no presenta fiebre";
        Medico medico = new Medico("Juan",123);
        diagnostico.agregarEvolucion(textoEvolucion,medico);
        assertThat(diagnostico.tieneEvolucion(medico,textoEvolucion)).isTrue();
    }


}
