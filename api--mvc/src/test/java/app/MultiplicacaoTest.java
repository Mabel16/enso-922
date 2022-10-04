package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicacaoTest {

    @Test
    public void verificarCasoBase(){

        Multiplicacao multiplicacao = new Multiplicacao();
        double resultado = multiplicacao.calcula("4","2");
        assertEquals(8.0, resultado);
    }

    @Test
    public void verificarMultiplicacaoDouble(){

        Multiplicacao multiplicacao = new Multiplicacao();
        double resultado = multiplicacao.calcula("5.2","2");
        assertEquals(10.4, resultado);
    }
}
