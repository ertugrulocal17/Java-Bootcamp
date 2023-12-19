package OOP.Abstraction;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate();
        womanGameCalculator.gameOver();

        // Dont Use
        /*GameCalculator gameCalculator = new GameCalculator() {
            @Override
            public void calculate() {

            }
        };*/

        GameCalculator gameCalculator = new WomanGameCalculator();
        gameCalculator.calculate();
    }
}
