import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class MainTest {


    @Test
    public void testingCript() throws Exception{
        Main cript = new Main();
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        SecretKey secretKey = keyGen.generateKey();
        byte[] cripto = cript.criptografar("", secretKey);

        Assertions.assertNotNull(cripto);
    }
    @Test
    public void testingDescript() throws Exception{
        Main cript = new Main();
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(256);
        SecretKey secretKey = keyGen.generateKey();

        byte[] descript;
    }

}
