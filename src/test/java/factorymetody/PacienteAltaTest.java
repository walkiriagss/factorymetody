package factorymetody;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteAltaTest {

    @Test
    void deveExecutarAlta() {
        IPaciente status = PacienteFactory.statusPaciente("Alta");
        assertEquals("Paciente recebeu alta", status.executar());
    }

    @Test
    void deveCancelarAlta() {
        IPaciente status = PacienteFactory.statusPaciente("Alta");
        assertEquals("Alta cancelada", status.cancelar());
    }
}