import java.util.Random;

public class ServicoDefender implements IServico{
    @Override
    public String executar() {
        Random dado = new Random();
        int valor = dado.nextInt(10);
        if(valor > 5)
            return "Voce defendeu com sucesso";
        else
            return "Voce nao conseguiu defender";
    }

    @Override
    public String cancelar() {
        return "Voce cancelou a defesa";
    }
}
