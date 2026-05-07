package triangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TriangleClassifierTest {
    @Test
    void classify_333_returnsEquilateral() {
        TriangleClassifier classifier = new TriangleClassifier();

        assertEquals(TriangleType.EQUILATERAL, classifier.classify(3, 3, 3));
    }

    @Test
    void classify_034_returnsInvalid() {
        TriangleClassifier classifier = new TriangleClassifier();

        assertEquals(TriangleType.INVALID, classifier.classify(0, 3, 4));
    }

    @Test
    void classify_30_4_returnsInvalid() {
        TriangleClassifier classifier = new TriangleClassifier();

        assertEquals(TriangleType.INVALID, classifier.classify(3, 0, 4));
    }

    @Test
    void classify_340_returnsInvalid() {
        TriangleClassifier classifier = new TriangleClassifier();

        assertEquals(TriangleType.INVALID, classifier.classify(3, 4, 0));
    }

    @Test
    void classify_neg134_returnsInvalid() {
        TriangleClassifier classifier = new TriangleClassifier();

        assertEquals(TriangleType.INVALID, classifier.classify(-1, 3, 4));
    }

    @Test
    void classify_3neg14_returnsInvalid() {
        TriangleClassifier classifier = new TriangleClassifier();

        assertEquals(TriangleType.INVALID, classifier.classify(3, -1, 4));
    }

    @Test
    void classify_34neg1_returnsInvalid() {
        TriangleClassifier classifier = new TriangleClassifier();

        assertEquals(TriangleType.INVALID, classifier.classify(3, 4, -1));
    }
}
