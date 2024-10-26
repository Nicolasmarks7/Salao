import org.junit.Test;

import static org.junit.Assert.*;

public class ServicoTest {

    Validadora valida = new Validadora();
    Servico servico = new Servico();

    @Test
    public void isFieldEmpty(){
        String nome = "";
        assertTrue(valida.isFieldEmpty(nome));
    }

    @Test
    public void descricaoTest(){
        String descricao = "ola boa tarde tudo bem como voces estao";
        assertTrue(servico.verificaDescricao(descricao));
    }

    @Test
    public void valorTest(){
        float valor = 1;
        assertTrue(servico.verificaValor(valor));

    }

}