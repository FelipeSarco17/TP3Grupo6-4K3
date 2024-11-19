package com.example.tp3_punto4;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Optional;

public class EvolucionDiagnosticoPrevioStepDefinitions {

    private Medico medico;
    private Paciente paciente;
    private Diagnostico diagnostico;
    private List<Diagnostico> diagnosticos;
    private Evolucion evolucion;
    private SistemaClinica sistemaClinica;
    private RepositorioPacientes repoPacientes;
    private String textoEvolucion;
    private String diagnosticoElegido;
    private Paciente pacienteResultante;
    private String cuil;

    @Before
    public void setup(){
        this.medico = null;
        this.pacienteResultante = null;
        this.diagnosticoElegido = null;
        this.evolucion = null;
        this.textoEvolucion = null;
        this.cuil = null;
        repoPacientes = mock(RepositorioPacientes.class);
        this.sistemaClinica = new SistemaClinica(repoPacientes);
    }

    @Given("el medico {string} con matricula {int} ha iniciado sesion")
    public void elMedicoHaIniciadoSesion(String nombreMedico,int matricula) {

        medico = new Medico(nombreMedico,matricula);
    }

    @And("el médico ha buscado la historia clínica del paciente con CUIL {string} que tiene los siguientes diagnosticos:")
    public void elMédicoHaBuscadoLaHistoriaClínicaDelPacienteConCUILQueTieneLosSiguientesDiagnosticos(String Cuil,List<String> diagnosticosPaciente) {
        paciente = new Paciente(Cuil,diagnosticosPaciente);
        cuil = Cuil;
        when(repoPacientes.BuscarPaciente(Cuil)).thenReturn(Optional.of(paciente));
    }


    @When("el medico escribe la evolucion  {string} para el diagnostico {string}")
    public void elMedicoEscribeLaEvolucion(String evolucionNueva,String diagnostico) {

        textoEvolucion = evolucionNueva;
        diagnosticoElegido = diagnostico;
    }

    @And("el medico guarda la nueva evolucion")
    public void seGuardaLaNuevaEvolucion() {

       pacienteResultante = sistemaClinica.agregarEvolucion(medico,cuil,diagnosticoElegido,textoEvolucion);


    }

    @Then("se registra la evolucion en la historia clinica del paciente con el diagnostico, la descripcion y el medico")
    public void seRegistraLaEvolucionEnLaHistoriaClinicaDelPacienteConElDiagnosticoLaDescripcionYElMedico() {
        Diagnostico diagnostico1 = pacienteResultante.buscarDiagnostico(diagnosticoElegido);
        assertThat(diagnostico1.tieneEvolucion(medico,textoEvolucion)).isTrue();
        verify(repoPacientes,times(1)).actualizar(any());
    }
}
