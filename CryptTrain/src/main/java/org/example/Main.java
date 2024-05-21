package org.example;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{

        Scanner input = new Scanner(System.in);
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey secretKey = keyGen.generateKey();

        System.out.print("Digite algo a ser criptografado: ");
        String textoCriptografado = input.nextLine();

        System.out.println("Texto criptografado: "+ new String(criptografar(textoCriptografado,secretKey)));

        System.out.println("Texto descriptografado: "+new String(decryptografar(criptografar(textoCriptografado,secretKey),secretKey)));
    }

    public static byte[] criptografar(String textoCriptografado, SecretKey secretKey) throws  Exception{

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(textoCriptografado.getBytes());
        return encrypted;
    }

    public static byte[] decryptografar(byte[] criptografado, SecretKey secretKey) throws Exception{
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decrypted = cipher.doFinal(criptografado);
        return decrypted;
    }
}


