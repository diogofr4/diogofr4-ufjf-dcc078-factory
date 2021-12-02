import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoFactoryTest {

    @Test
    void deveRetornarExcecaoParaServicoInexistente(){
        try{
            ServicoFactory.getInstance().setServico("Invalido");
            IServico servico = ServicoFactory.getInstance().getServico();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Servico inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido(){
        try{
            ServicoFactory.getInstance().setServico("Pular");
            IServico servico = ServicoFactory.getInstance().getServico();
            fail();
        } catch (IllegalArgumentException e){
            assertEquals("Servico invalido", e.getMessage());
        }
    }

}