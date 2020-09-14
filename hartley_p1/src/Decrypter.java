public class Decrypter {
    String input;

    public String decrypt(String input) {
        this.input = input;
        int initialInput = Integer.parseInt(input);

        int firstDigit = (initialInput/1000) % 10;
        int secondDigit = (initialInput/100) % 10;
        int thirdDigit = (initialInput/10) % 10;
        int fourthDigit = (initialInput % 10);

        int newFirst = (firstDigit + 3) % 10;
        int newSecond = (secondDigit + 3) % 10;
        int newThird = (thirdDigit + 3) % 10;
        int newFourth = (fourthDigit + 3) % 10;

        String decryptedValue = String.format("%d%d%d%d", newThird, newFourth, newFirst, newSecond);
        return decryptedValue;
    }
}
