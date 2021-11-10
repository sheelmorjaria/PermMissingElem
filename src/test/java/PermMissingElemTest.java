import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PermMissingElemTest {
    @Test
    void testSolution() {
        assertEquals(5, (new PermMissingElem()).solution(new int[]{1, 2, 3, 4}));
        assertEquals(1, (new PermMissingElem()).solution(new int[]{2, 3, 4, 5}));
        assertEquals(9, (new PermMissingElem()).solution(new int[]{ 4, 2, 3, 1, 5, 6, 8, 7 }));
    }
}

