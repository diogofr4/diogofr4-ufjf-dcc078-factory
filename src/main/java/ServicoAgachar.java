public class ServicoAgachar implements IServico{
    @Override
    public String executar() {
        return "Voce está agachado";
    }

    @Override
    public String cancelar() {
        return "Voce está em pé";
    }
}
