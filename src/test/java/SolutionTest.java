import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private int[] input1;
    private int input2;
    private List<List<Integer>> expected;
    private Solution soln = new Solution1();

    public SolutionTest(int[] input1, int input2, List<List<Integer>> output) {
        this.input1 = input1;
        this.input2 = input2;
        this.expected = output;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][]{
                {new int[]{2,3,6,7}, 7, Arrays.asList(Arrays.asList(7), Arrays.asList(2,2,3))},
                {new int[]{2,3,5}, 8, Arrays.asList(Arrays.asList(2,2,2,2), Arrays.asList(2,3,3), Arrays.asList(3,5))}
        });
    }

    @Test
    public void testSum() {
        assertEquals(expected, soln.combinationSum(input1, input2));
    }
}