
package mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CalculadoraTest {

    servicoMatematico;

    @InjectMocks
    private Calculadora calculadora;

    @Test
    public void testSomarComMock() {
        // Configura o mock para retornar 5 quando somar(2,3) for chamado
        when(servicoMatematico.somar(2, 3)).thenReturn(5);

        int resultado = calculadora.somar(2, 3);

        assertEquals(5, resultado);
    }
}
