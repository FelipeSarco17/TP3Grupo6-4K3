package com.example.tp3_punto4;

public class SistemaClinica {

    private RepositorioPacientes repoPaciente;

    public SistemaClinica(RepositorioPacientes repoPaciente){
        this.repoPaciente = repoPaciente;
    }



    public Paciente agregarEvolucion(Medico medico,String cuil,String diagnostico,String textoEvolucion){

        Paciente paciente = repoPaciente.BuscarPaciente(cuil).orElseThrow(() -> new RuntimeException("Paciente inexistente"));
        paciente.agregarEvolucion(diagnostico,textoEvolucion,medico);
        repoPaciente.actualizar(paciente);
        return paciente;
    }


}
