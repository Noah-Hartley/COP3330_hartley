public class Main {
    public static void main(String[] args) {
        Encrypter myEncrypter = new Encrypter();
        String encryptedValue = myEncrypter.encrypt("9876");
        System.out.println(encryptedValue);

        Decrypter myDecrypter = new Decrypter();
        String decryptedValue = myDecrypter.decrypt("4365");
        System.out.println(decryptedValue);
    }
}
