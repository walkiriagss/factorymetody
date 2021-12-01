package factorymetody;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteInternacaoTest {

    @Test
    void deveExecutarInternacao() {
        IPaciente status = PacienteFactory.statusPaciente("Internacao");
        assertEquals("Paciente internado", status.executar());
    }

    @Test
    void deveCancelarInternacao() {
        IPaciente status = PacienteFactory.statusPaciente("Internacao");
        assertEquals("Internação Cancelada", status.cancelar());
    }
}