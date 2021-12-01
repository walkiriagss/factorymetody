package factorymetody;

public class PacienteExame implements IPaciente {

    @Override
    public String executar() {
        return "Paciente em exame";
    }

    @Override
    public String cancelar() {
        return "Exame cancelado";
    }
}
