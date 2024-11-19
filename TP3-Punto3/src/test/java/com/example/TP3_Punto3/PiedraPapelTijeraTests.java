package com.example.TP3_Punto3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class PiedraPapelTijeraTests {

    PiedraPapelTijera Juego;
    String resultado;

    @BeforeEach
    public void definirJuego() {
        Juego = new PiedraPapelTijera();
    }


    @Test
    public void jugador1PiedraJugador2Papel() {

        PiedraPapelTijera.Jugada jugador1 = PiedraPapelTijera.Jugada.PIEDRA;
        PiedraPapelTijera.Jugada jugador2 = PiedraPapelTijera.Jugada.PAPEL;
        String resultadoEsperado = "Jugador 2";
        resultado = Juego.jugar(jugador1, jugador2);
        assertThat(resultado).isEqualTo(resultadoEsperado);

    }

    @Test
    public void jugador1PiedraJugador2Tijera() {

        PiedraPapelTijera.Jugada jugador1 = PiedraPapelTijera.Jugada.PIEDRA;
        PiedraPapelTijera.Jugada jugador2 = PiedraPapelTijera.Jugada.TIJERA;
        String resultadoEsperado = "Jugador 1";
        resultado = Juego.jugar(jugador1, jugador2);
        assertThat(resultado).isEqualTo(resultadoEsperado);

    }

    @Test
    public void jugador1PiedraJugador2Piedra() {

        PiedraPapelTijera.Jugada jugador1 = PiedraPapelTijera.Jugada.PIEDRA;
        PiedraPapelTijera.Jugada jugador2 = PiedraPapelTijera.Jugada.PIEDRA;
        String resultadoEsperado = "Empate";
        resultado = Juego.jugar(jugador1, jugador2);
        assertThat(resultado).isEqualTo(resultadoEsperado);

    }

    @Test
    public void jugador1PapelJugador2Tijera() {

        PiedraPapelTijera.Jugada jugador1 = PiedraPapelTijera.Jugada.PAPEL;
        PiedraPapelTijera.Jugada jugador2 = PiedraPapelTijera.Jugada.TIJERA;
        String resultadoEsperado = "Jugador 2";
        resultado = Juego.jugar(jugador1, jugador2);
        assertThat(resultado).isEqualTo(resultadoEsperado);

    }

    @Test
    public void jugador1PapelJugador2Piedra() {

        PiedraPapelTijera.Jugada jugador1 = PiedraPapelTijera.Jugada.PAPEL;
        PiedraPapelTijera.Jugada jugador2 = PiedraPapelTijera.Jugada.PIEDRA;
        String resultadoEsperado = "Jugador 1";
        resultado = Juego.jugar(jugador1, jugador2);
        assertThat(resultado).isEqualTo(resultadoEsperado);

    }

    @Test
    public void jugador1PapelJugador2Papel() {

        PiedraPapelTijera.Jugada jugador1 = PiedraPapelTijera.Jugada.PAPEL;
        PiedraPapelTijera.Jugada jugador2 = PiedraPapelTijera.Jugada.PAPEL;
        String resultadoEsperado = "Empate";
        resultado = Juego.jugar(jugador1, jugador2);
        assertThat(resultado).isEqualTo(resultadoEsperado);

    }

    @Test
    public void jugador1TijeraJugador2Piedra() {

        PiedraPapelTijera.Jugada jugador1 = PiedraPapelTijera.Jugada.TIJERA;
        PiedraPapelTijera.Jugada jugador2 = PiedraPapelTijera.Jugada.PIEDRA;
        String resultadoEsperado = "Jugador 2";
        resultado = Juego.jugar(jugador1, jugador2);
        assertThat(resultado).isEqualTo(resultadoEsperado);

    }

    @Test
    public void jugador1TijeraJugador2Papel() {

        PiedraPapelTijera.Jugada jugador1 = PiedraPapelTijera.Jugada.TIJERA;
        PiedraPapelTijera.Jugada jugador2 = PiedraPapelTijera.Jugada.PAPEL;
        String resultadoEsperado = "Jugador 1";
        resultado = Juego.jugar(jugador1, jugador2);
        assertThat(resultado).isEqualTo(resultadoEsperado);

    }

    @Test
    public void jugador1TijeraJugador2Tijera() {

        PiedraPapelTijera.Jugada jugador1 = PiedraPapelTijera.Jugada.TIJERA;
        PiedraPapelTijera.Jugada jugador2 = PiedraPapelTijera.Jugada.TIJERA;
        String resultadoEsperado = "Empate";
        resultado = Juego.jugar(jugador1, jugador2);
        assertThat(resultado).isEqualTo(resultadoEsperado);

    }


}