package Maven_teste;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

public class NovoTeste {

    @Mock
    private List<String> listaUsuario;

    @Test
    void TestandoMock(){
        Assertions.assertNotNull(listaUsuario);
    }
    
}
