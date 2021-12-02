import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoAndarTest {
    @Test
    void deveExecutarAndar(){
        ServicoFactory.getInstance().setServico("Andar");
        assertEquals("Voce andou 1 quadrado", ServicoFactory.getInstance().getServico().executar());
    }

    @Test
    void deveCancelarAndar(){
        ServicoFactory.getInstance().setServico("Andar");
        assertEquals("Acao da andar cancelada", ServicoFactory.getInstance().getServico().cancelar());
    }

}