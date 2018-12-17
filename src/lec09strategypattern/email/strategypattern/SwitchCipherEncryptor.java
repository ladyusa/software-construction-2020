package lec09strategypattern.email.strategypattern;

public class SwitchCipherEncryptor implements Encryptor {

    SwitchCipherEncryptor() {}

    @Override
    public String encrypt(String message) {
        // encrypt
        char[] data = message.toCharArray();
        for (int i = 0; i < data.length-1; i += 2) {
            char tmp = data[i];
            data[i] = data[i+1];
            data[i+1] = tmp;
        }
        return new String(data);
    }
}
