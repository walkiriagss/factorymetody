package factorymetody;

public class PacienteAlta implements IPaciente{

    @Override
    public String executar() {
        return "Paciente recebeu alta";
    }

    @Override
    public String cancelar() {
        return "Alta cancelada";
    }
}
