package com.example.tp3_punto4;

import java.util.ArrayList;
import java.util.List;

public class Diagnostico {



    private String nombre;
    private List<Evolucion> evoluciones;


    public Diagnostico() {
    }

    public Diagnostico(String nombre) {

        this.nombre = nombre;
        this.evoluciones = new ArrayList<>();
    }

    public void agregarEvolucion(String textoEvolucion, Medico medico){
        Evolucion evolucionNueva = new Evolucion(textoEvolucion,medico);
        evoluciones.add(evolucionNueva);
    }

    public boolean tieneEvolucion(Medico medico,String textoEvolucion){
        return evoluciones.stream().anyMatch(evolucion -> evolucion.tiene(medico,textoEvolucion));
    }

    public String getNombre() {
        return nombre;
    }

    public List<Evolucion> getEvoluciones(){
        return evoluciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
