package ${package};

import static org.junit.Assert.*;
import org.junit.*;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

	@Test
	public void test() {
        ${argumentType} ${argumentName} = ;
        ${returnType} expected = ;
        ${returnType} actual = solution.${methodName}(${argumentName});
        assertEquals(expected, actual);
	}
}
