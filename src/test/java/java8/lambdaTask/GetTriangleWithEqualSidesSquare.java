package java8.lambdaTask;

public interface GetTriangleWithEqualSidesSquare {

    double squareValue(double side, double height);

    static GetTriangleWithEqualSidesSquare square() {
        return ((side, height) -> 0.5 * (side * height));
    }
}
