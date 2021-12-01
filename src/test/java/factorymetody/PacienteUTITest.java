package factorymetody;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteUTITest {

    @Test
    void deveExecutarUTI() {
        IPaciente status = PacienteFactory.statusPaciente("UTI");
        assertEquals("Paciente foi internado na UTI", status.executar());
    }

    @Test
    void deveCancelarUTI() {
        IPaciente status = PacienteFactory.statusPaciente("UTI");
        assertEquals("Internação na UTI cancelada", status.cancelar());
    }
}