import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoAgacharTest {
    @Test
    void deveExecutarAgachar(){
        ServicoFactory.getInstance().setServico("Agachar");
        assertEquals("Voce está agachado", ServicoFactory.getInstance().getServico().executar());
    }

    @Test
    void deveCancelarAgachar(){
        ServicoFactory.getInstance().setServico("Agachar");
        assertEquals("Voce está em pé", ServicoFactory.getInstance().getServico().cancelar());
    }

}