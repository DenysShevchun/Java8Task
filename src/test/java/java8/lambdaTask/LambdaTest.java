package java8.lambdaTask;

import org.testng.annotations.Test;

import java.util.Random;

public class LambdaTest {

    @Test
    public void timesTwoCheck() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(25);
        TimesTwo timesTwo = () -> System.out.println(
                "Original number: " + randomNumber + ", Changed number: " + randomNumber * 2);
        timesTwo.timesTwo();
    }

    @Test
    public void triangleSquareCheck() {
        double squareOfTriangle = GetTriangleWithEqualSidesSquare.square().squareValue(10, 15);
        System.out.println(squareOfTriangle);
    }

    @Test
    public void userInfoCheck() {
        String user = GetUserInfo.info().userInfo(44, "Stephan", 78.9);
        System.out.println(user);
    }
}
