import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ServicoFactory {
    private IServico servico;

    private ServicoFactory(){}
    private static ServicoFactory servicoFactory = new ServicoFactory();
    public static ServicoFactory getInstance(){
        return servicoFactory;
    }

    public void setServico(String servico) {
        Class classe = null;
        Object objeto = null;

        try{
            classe = Class.forName("Servico" + servico);
            objeto = classe.getDeclaredConstructor().newInstance();
        }
        catch (Exception ex){
            throw new IllegalArgumentException("Servico inexistente");
        }
        if(!(objeto instanceof  IServico)){
            throw new IllegalArgumentException("Servico invalido");
        }

        this.servico = (IServico) objeto;
    }

    public IServico getServico() {
        return servico;
    }
}

