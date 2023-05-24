import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class H20Test {
    @Test
    void deveArmazenarEstados() {
        H20 h20 = new H20();
        h20.setEstado(H20EstadoSolido.getInstance(), 0);
        h20.setEstado(H20EstadoLiquido.getInstance(), 25);
        h20.setEstado(H20EstadoGasoso.getInstance(), 101);
        assertEquals(3, h20.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        H20 h20 = new H20();
        h20.setEstado(H20EstadoSolido.getInstance(), 0);
        h20.setEstado(H20EstadoLiquido.getInstance(), 20);
        h20.setEstado(H20EstadoGasoso.getInstance(), 101);
        h20.restauraEstado(1);
        assertEquals(H20EstadoLiquido.getInstance(), h20.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        H20 h20 = new H20();
        h20.setEstado(H20EstadoSolido.getInstance(), 0);
        h20.setEstado(H20EstadoLiquido.getInstance(), 20);
        h20.setEstado(H20EstadoGasoso.getInstance(), 101);
        h20.restauraEstado(0);
        assertEquals(H20EstadoSolido.getInstance(), h20.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            H20 h20 = new H20();
            h20.restauraEstado(5);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarTemperaturaAgua(){
        H20 gelo = new H20();
        H20 vapor = new H20();
        H20 liquido = new H20();

        gelo.setEstado(H20EstadoSolido.getInstance(), 0);
        assertEquals(0, gelo.getTemperatura(), 0.01);

        liquido.setEstado(H20EstadoLiquido.getInstance(), 20);
        assertEquals(20, liquido.getTemperatura(), 0.01);

        vapor.setEstado(H20EstadoGasoso.getInstance(), 101);
        assertEquals(101, vapor.getTemperatura(), 0.01);
    }
}
