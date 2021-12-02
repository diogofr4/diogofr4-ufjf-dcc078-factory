    import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoAtacarTest {
    @Test
    void deveExecutarAtacar(){
        ServicoFactory.getInstance().setServico("Atacar");
        String message = ServicoFactory.getInstance().getServico().executar();
        assertTrue(message.equals("Voce atacou com sucesso") || message.equals("Voce errou o ataque"));
    }

    @Test
    void deveCancelarAtacar(){
        ServicoFactory.getInstance().setServico("Atacar");
        assertEquals("Voce cancelou o ataque", ServicoFactory.getInstance().getServico().cancelar());
    }
}