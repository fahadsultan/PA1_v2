package pa1_v2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VectorTest {

    @Test
    public void testConstructor() {
        Vector vector = new Vector(3);
        assertEquals(3, vector.getDimension());
    }

    @Test
    public void testRead() {
        Vector vector = new Vector(3);
        vector.update(0, 1);
        vector.update(1, 2);
        vector.update(2, 3);
        assertEquals(1, vector.read(0));
        assertEquals(2, vector.read(1));
        assertEquals(3, vector.read(2));
    }

    @Test
    public void testUpdate() {
        Vector vector = new Vector(3);
        vector.update(0, 1);
        vector.update(1, 2);
        vector.update(2, 3);
        assertEquals(1, vector.read(0));
        assertEquals(2, vector.read(1));
        assertEquals(3, vector.read(2));
    }

    @Test
    public void testDelete() {
        Vector vector = new Vector(3);
        vector.update(0, 1);
        vector.update(1, 2);
        vector.update(2, 3);
        vector.delete(1);
        assertEquals(1, vector.read(0));
        assertEquals(3, vector.read(1));
        assertEquals(-1, vector.read(2));
    }

    @Test
    public void testAdd() {
        Vector vector1 = new Vector(3);
        vector1.update(0, 1);
        vector1.update(1, 2);
        vector1.update(2, 3);

        Vector vector2 = new Vector(3);
        vector2.update(0, 4);
        vector2.update(1, 5);
        vector2.update(2, 6);

        vector1.add(vector2);
        assertEquals(5, vector1.read(0));
        assertEquals(7, vector1.read(1));
        assertEquals(9, vector1.read(2));
    }

    @Test
    public void testSubtract() {
        Vector vector1 = new Vector(3);
        vector1.update(0, 1);
        vector1.update(1, 2);
        vector1.update(2, 3);

        Vector vector2 = new Vector(3);
        vector2.update(0, 4);
        vector2.update(1, 5);
        vector2.update(2, 6);

        vector1.subtract(vector2);
        assertEquals(-3, vector1.read(0));
        assertEquals(-3, vector1.read(1));
        assertEquals(-3, vector1.read(2));
    }

    @Test
    public void testMax() {
        Vector vector = new Vector(3);
        vector.update(0, 1);
        vector.update(1, 5);
        vector.update(2, 3);
        assertEquals(5, vector.max());
    }

    @Test
    public void testMaxEmpty() {
        Vector vector = new Vector(3);
        assertEquals(-1, vector.max());
    }

    @Test
    public void testMaxNegative() {
        Vector vector = new Vector(3);
        vector.update(0, -1);
        vector.update(1, -5);
        vector.update(2, -3);
        assertEquals(-1, vector.max());
    }

    @Test
    public void testMaxMixed() {
        Vector vector = new Vector(3);
        vector.update(0, -1);
        vector.update(1, 5);
        vector.update(2, 3);
        assertEquals(5, vector.max());
    }

    @Test
    public void testMaxSingle() {
        Vector vector = new Vector(1);
        vector.update(0, 5);
        assertEquals(5, vector.max());
    }

    @Test
    public void testMaxZero() {
        Vector vector = new Vector(3);
        vector.update(0, 0);
        vector.update(1, 0);
        vector.update(2, 0);
        assertEquals(0, vector.max());
    }

    @Test
    public void testMaxNegativeZero() {
        Vector vector = new Vector(3);
        vector.update(0, -1);
        vector.update(1, 0);
        vector.update(2, -3);
        assertEquals(0, vector.max());
    }

    @Test
    public void testMaxNegativeSingle() {
        Vector vector = new Vector(1);
        vector.update(0, -5);
        assertEquals(-5, vector.max());
    }

    @Test
    public void testMaxNegativeMixed() {
        Vector vector = new Vector(3);
        vector.update(0, -1);
        vector.update(1, -5);
        vector.update(2, 3);
        assertEquals(3, vector.max());
    }

    @Test
    public void testMaxMixedZero() {
        Vector vector = new Vector(3);
        vector.update(0, -1);
        vector.update(1, 0);
        vector.update(2, 3);
        assertEquals(3, vector.max());
    }

    @Test
    public void testMaxMixedSingle() {
        Vector vector = new Vector(1);
        vector.update(0, -5);
        assertEquals(-5, vector.max());
    }

    @Test
    public void testMin() {
        Vector vector = new Vector(3);
        vector.update(0, 1);
        vector.update(1, 5);
        vector.update(2, 3);
        assertEquals(1, vector.min());
    }

    @Test
    public void testMinEmpty() {
        Vector vector = new Vector(3);
        assertEquals(-1, vector.min());
    }

    @Test
    public void testMinNegative() {
        Vector vector = new Vector(3);
        vector.update(0, -1);
        vector.update(1, -5);
        vector.update(2, -3);
        assertEquals(-5, vector.min());
    }

    @Test
    public void testMinMixed() {
        Vector vector = new Vector(3);
        vector.update(0, -1);
        vector.update(1, 5);
        vector.update(2, 3);
        assertEquals(-1, vector.min());
    }

    @Test
    public void testMinSingle() {
        Vector vector = new Vector(1);
        vector.update(0, 5);
        assertEquals(5, vector.min());
    }

    @Test
    public void testMinZero() {
        Vector vector = new Vector(3);
        vector.update(0, 0);
        vector.update(1, 0);
        vector.update(2, 0);
        assertEquals(0, vector.min());
    }

    @Test
    public void testMinNegativeZero() {
        Vector vector = new Vector(3);
        vector.update(0, -1);
        vector.update(1, 0);
        vector.update(2, -3);
        assertEquals(-3, vector.min());
    }

    @Test
    public void testAverage() {
        Vector vector = new Vector(3);
        vector.update(0, 1);
        vector.update(1, 5);
        vector.update(2, 3);
        assertEquals(3, vector.average(), 0);
    }

    @Test
    public void testAverageEmpty() {
        Vector vector = new Vector(3);
        assertEquals(-1, vector.average(), 0);
    }

    @Test
    public void testSearch() {
        Vector vector = new Vector(3);
        vector.update(0, 1);
        vector.update(1, 5);
        vector.update(2, 3);
        assertEquals(1, vector.search(5));
    }

    @Test
    public void testSearchEmpty() {
        Vector vector = new Vector(3);
        assertEquals(-1, vector.search(5));
    }

    @Test
    public void testSearchNotFound() {
        Vector vector = new Vector(3);
        vector.update(0, 1);
        vector.update(1, 5);
        vector.update(2, 3);
        assertEquals(-1, vector.search(10));
    }

    @Test
    public void testSearchNegative() {
        Vector vector = new Vector(3);
        vector.update(0, -1);
        vector.update(1, -5);
        vector.update(2, -3);
        assertEquals(1, vector.search(-5));
    }

    @Test
    public void testSearchMixed() {
        Vector vector = new Vector(3);
        vector.update(0, -1);
        vector.update(1, 5);
        vector.update(2, 3);
        assertEquals(1, vector.search(5));
    }

    @Test
    public void testSearchFast() {
        Vector vector = new Vector(1000000);
        for (int i = 0; i < 1000000; i++) {
            vector.update(i, i);
        }
        assertEquals(999999, vector.search(999999));
    }
    
    @Test
    public void testSearchFastNotFound() {
        Vector vector = new Vector(1000000);
        for (int i = 0; i < 1000000; i++) {
            vector.update(i, i);
        }
        assertEquals(-1, vector.search(1000000));
    }

    @Test
    public void testSearchFastNegative() {
        Vector vector = new Vector(1000000);
        for (int i = 0; i < 1000000; i++) {
            vector.update(i, -i);
        }
        assertEquals(999999, vector.search(-999999));
    }

    @Test
    public void testSearchFastMixed() {
        Vector vector = new Vector(1000000);
        for (int i = 0; i < 1000000; i++) {
            vector.update(i, i);
        }
        vector.update(999999, -999999);
        assertEquals(999999, vector.search(-999999));
    }

    @Test
    public void testSort() {
        Vector vector = new Vector(3);
        vector.update(0, 3);
        vector.update(1, 1);
        vector.update(2, 2);
        vector.sort();
        assertEquals(1, vector.read(0));
        assertEquals(2, vector.read(1));
        assertEquals(3, vector.read(2));
    }

    @Test
    public void testSortEmpty() {
        Vector vector = new Vector(3);
        vector.sort();
        assertEquals(-1, vector.read(0));
        assertEquals(-1, vector.read(1));
        assertEquals(-1, vector.read(2));
    }

    @Test
    public void testSortSingle() {
        Vector vector = new Vector(1);
        vector.update(0, 1);
        vector.sort();
        assertEquals(1, vector.read(0));
    }

    @Test
    public void testSortNegative() {
        Vector vector = new Vector(3);
        vector.update(0, -3);
        vector.update(1, -1);
        vector.update(2, -2);
        vector.sort();
        assertEquals(-3, vector.read(0));
        assertEquals(-2, vector.read(1));
        assertEquals(-1, vector.read(2));
    }

    @Test
    public void testSortMixed() {
        Vector vector = new Vector(3);
        vector.update(0, -3);
        vector.update(1, 1);
        vector.update(2, 2);
        vector.sort();
        assertEquals(-3, vector.read(0));
        assertEquals(1, vector.read(1));
        assertEquals(2, vector.read(2));
    }
    

}
