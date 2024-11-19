package com.example.tp3_punto4;

public class Evolucion {




    private String texto;

    Medico medico;

    public Evolucion() {
    }

    public Evolucion(String texto,
                     Medico medico) {
        this.texto = texto;
        this.medico = medico;
    }


    public boolean tiene(Medico medico,String textoEvolucion){
        return (this.medico.equals(medico) && texto.equals(textoEvolucion));
    }



    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }



    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
