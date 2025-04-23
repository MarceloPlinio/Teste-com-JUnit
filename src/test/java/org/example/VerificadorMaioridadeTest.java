package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VerificadorMaioridadeTest {

    @Test
    public void testIdadeAbaixoDe18() {
        assertFalse(VerificadorMaioridade.ehMaiorDeIdade(17));
    }

    @Test
    public void testIdadeExata18() {
        assertTrue(VerificadorMaioridade.ehMaiorDeIdade(18));
    }

    @Test
    public void testIdadeAcimaDe18() {
        assertTrue(VerificadorMaioridade.ehMaiorDeIdade(25));
    }

    @Test
    public void testIdadeNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            VerificadorMaioridade.ehMaiorDeIdade(-1);
        });
    }
}
