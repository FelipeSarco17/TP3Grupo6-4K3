package com.example.tp3_punto4;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class HistoriaClinica {


    private long id;

    private Date fechaCreacion;

    private Paciente paciente;

    private List<Diagnostico> diagnosticos;

    public HistoriaClinica() {
    }

    public HistoriaClinica(List<String> diagnosticos) {

        this.diagnosticos = new ArrayList<>();

        for(String diagnostico : diagnosticos){
            Diagnostico diagnosticoNuevo = new Diagnostico(diagnostico);
            this.diagnosticos.add(diagnosticoNuevo);
        }
    }

    public void agregarEvolucion(String diagnosticoElegido,String textoEvolucion,Medico medico){
        Diagnostico diagnostico =  buscarDiagnostico(diagnosticoElegido);
        diagnostico.agregarEvolucion(textoEvolucion,medico);
    }

    public Diagnostico buscarDiagnostico(String diagnosticoElegido){
        return diagnosticos.stream().filter(diagnostico -> diagnostico.getNombre().equals(diagnosticoElegido)).findFirst().orElseThrow(() -> new RuntimeException("Diagnostico no encontrado") );
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Diagnostico> getDetalles() {
        return diagnosticos;
    }

    public void setDetalles(List<Diagnostico> diagnosticos) {
        this.diagnosticos = diagnosticos;
    }


}
