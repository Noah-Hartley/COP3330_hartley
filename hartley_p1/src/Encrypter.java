public class Encrypter {
    String input;

    public String encrypt(String input) {
        this.input = input;
        int initialInput = Integer.parseInt(input);

        int firstDigit = (initialInput/1000) % 10;
        int secondDigit = (initialInput/100) % 10;
        int thirdDigit = (initialInput/10) % 10;
        int fourthDigit = (initialInput % 10);

        int newFirst = (firstDigit + 7) % 10;
        int newSecond = (secondDigit + 7) % 10;
        int newThird = (thirdDigit + 7) % 10;
        int newFourth = (fourthDigit + 7) % 10;

        String encryptedValue = String.format("%d%d%d%d", newThird, newFourth, newFirst, newSecond);
        return encryptedValue;
    }
}
