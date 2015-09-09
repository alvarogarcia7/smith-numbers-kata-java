import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SmithNumbersShould {

    @Test
    public void detect_the_smallest_non_smith_number() {
        assertThat(isSmith(0), is(false));
    }

    private static boolean isSmith(int n) {
        return false;
    }
}
