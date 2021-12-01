package factorymetody;

public class PacienteInternacao implements IPaciente{

    @Override
    public String executar() {
        return "Paciente internado";
    }

    @Override
    public String cancelar() {
        return "Internação Cancelada";
    }
}
