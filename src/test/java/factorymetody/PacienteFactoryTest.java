package factorymetody;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteFactoryTest {

    @Test
    void deveRetornarExcecaoParaStatusInexistente() {
        try{
            IPaciente status = PacienteFactory.statusPaciente("Parto");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Status inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaStatusInvalido() {
        try{
            IPaciente status = PacienteFactory.statusPaciente("Obito");
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Status inválido", e.getMessage());
        }
    }
}