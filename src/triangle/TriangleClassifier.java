package triangle;

public class TriangleClassifier {
    public TriangleType classify(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return TriangleType.INVALID;
        }

        return TriangleType.EQUILATERAL;
    }
}
