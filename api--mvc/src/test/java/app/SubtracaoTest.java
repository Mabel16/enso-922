package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtracaoTest {

    @Test
    public void verificarCasoBase(){

        Subtracao subtracao = new Subtracao();
        double resultado = subtracao.calcula("4","2");
        assertEquals(2.0, resultado);
    }

    @Test
    public void verificarSubtracaoDouble(){

        Subtracao subtracao = new Subtracao();
        double resultado = subtracao.calcula("4.5","2");
        assertEquals(2.5, resultado);  
    }
    
}
