package com.example.tp3_punto4;


public class Medico{


    private int matricula;
    private String nombre;

    public Medico(String nombre,int matricula){
        this.nombre = nombre;
        this.matricula = matricula;
    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


}