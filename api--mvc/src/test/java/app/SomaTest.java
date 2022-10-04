package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomaTest {

    @Test
    public void verificarCasoBase(){

        Soma soma = new Soma();
        double resultado = soma.calcula("4","9");
        assertEquals(13.0, resultado);

    }

    @Test
    public void verificarSomaDouble(){

        Soma soma = new Soma();
        double resultado = soma.calcula("7.5", "3");
        assertEquals(10.5, resultado);
    }
    
}
