package teste_mvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PessoaTest {
    
    @Test
    void shouldReturnTrue(){
        Pessoa fulana = new Pessoa("Fulana", 123);
        Assertions.assertTrue(fulana.temConta());
        Pessoa fulaninho = new Pessoa("fulaninho", 0);
        Assertions.assertFalse(fulaninho.temConta());
    }
}
