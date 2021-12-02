public class ServicoAndar implements IServico{
    @Override
    public String executar() {
        return "Voce andou 1 quadrado";
    }

    @Override
    public String cancelar() {
        return "Acao da andar cancelada";
    }
}
