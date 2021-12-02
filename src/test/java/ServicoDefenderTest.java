import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoDefenderTest {
    @Test
    void deveExecutarDefender(){
        ServicoFactory.getInstance().setServico("Defender");
        String message = ServicoFactory.getInstance().getServico().executar();
        assertTrue(message.equals("Voce defendeu com sucesso") || message.equals("Voce nao conseguiu defender"));
    }

    @Test
    void deveCancelarDefender(){
        ServicoFactory.getInstance().setServico("Defender");
        assertEquals("Voce cancelou a defesa", ServicoFactory.getInstance().getServico().cancelar());
    }

}