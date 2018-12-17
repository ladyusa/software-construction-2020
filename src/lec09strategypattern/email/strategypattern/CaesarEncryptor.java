package lec09strategypattern.email.strategypattern;

public class CaesarEncryptor implements Encryptor {

    private int key;

    CaesarEncryptor(int key) {
        this.key = key;
    }
    
    @Override
    public String encrypt(String message) {
        // encrypt
        char[] data = message.toCharArray();
        for (int i = 0; i < data.length; i++) {
            data[i] = (char)(data[i] + key);
        }
        return new String(data);
    }
}
