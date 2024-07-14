package BooleanExamples;

public class NumberCheck {
    boolean isPositive;

    NumberCheck(int number){
        this.isPositive = number > 0;
    }

    boolean getIsPositive() {
        return isPositive;
    }
}
