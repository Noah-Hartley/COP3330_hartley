public class BodyMassIndex {

    double weight;
    double height;

    public BodyMassIndex(double weight, double height) {
        this.weight = weight;
        this.height = height;
        double bmi = ((703 * this.weight) / (this.height*this.height));
    }
}
