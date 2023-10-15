package Mail;

public class SwitchCipherEncrypt implements Encryptor {
    @Override
    public String encrypt(String content) {
        char[] data = content.toCharArray();
        for (int i = 0; i < data.length-1; i += 2) {
            char tmp = data[i];
            data[i] = data[i+1];
            data[i+1] = tmp;
        }
        return new String(data);
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
