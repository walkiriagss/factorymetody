package factorymetody;

public class PacienteFactory {

    public static  IPaciente statusPaciente(String status) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factorymetody.Paciente" +status);
            objeto = classe.newInstance();
        }
        catch (Exception ex){
            throw new IllegalArgumentException("Status inexistente");
        }
        if (!(objeto instanceof  IPaciente)) {
            throw new IllegalArgumentException("Status inválido");
        }

        return (IPaciente) objeto;
    }
}
