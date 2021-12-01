package factorymetody;

public class PacienteUTI implements IPaciente{

    @Override
    public String executar() {
        return "Paciente foi internado na UTI";
    }

    @Override
    public String cancelar() {
        return "Internação na UTI cancelada";
    }
}
