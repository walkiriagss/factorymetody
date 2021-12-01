package factorymetody;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteExameTest {

    @Test
    void deveExecutarExame() {
        IPaciente status = PacienteFactory.statusPaciente("Exame");
        assertEquals("Paciente em exame", status.executar());
    }

    @Test
    void deveCancelarExame() {
        IPaciente status = PacienteFactory.statusPaciente("Exame");
        assertEquals("Exame cancelado", status.cancelar());
    }
}