package Mail;

public class CaesarEncrypt implements Encryptor {
    int key;

    public CaesarEncrypt(int key) {
        this.key = key;
    }

    @Override
    public String encrypt(String content) {
        char[] data = content.toCharArray();
        for (int i = 0; i < data.length; i++) {
            data[i] = (char)(data[i] + key);
        }
        return new String(data);
    }
}

// ไชยภัทร ศรีอำไพ 6510450305
