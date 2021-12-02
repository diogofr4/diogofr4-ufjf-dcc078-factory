import java.util.Random;

public class ServicoAtacar implements IServico{
    @Override
    public String executar() {
        Random dado = new Random();
        int valor = dado.nextInt(10);
        if(valor > 5)
            return "Voce atacou com sucesso";
        else
            return "Voce errou o ataque";
    }

    @Override
    public String cancelar() {
        return "Voce cancelou o ataque";
    }
}
