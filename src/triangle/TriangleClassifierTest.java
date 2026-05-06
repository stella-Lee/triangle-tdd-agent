package triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TriangleClassifierTest {
    @Test
    void classify_333_returnsEquilateral() {
        TriangleClassifier classifier = new TriangleClassifier();

        assertEquals(TriangleType.EQUILATERAL, classifier.classify(3, 3, 3));
    }
}
