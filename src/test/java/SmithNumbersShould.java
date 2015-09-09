import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SmithNumbersShould {

    @Test
    public void detect_the_smallest_non_smith_number() {
        assertThat(isSmith(0), is(false));
    }

    @Test
    public void detect_the_second_smallest_non_smith_number(){
        assertThat(isSmith(1), is(false));
    }

    @Test
    public void detect_the_smallest_smith_number(){
        assertThat(isSmith(2), is(true));
    }

    @Test
    public void detect_the_smallest_non_smith_number_except_the_corner_cases() {
        assertThat(isSmith(6), is(false)); // DC(6)=2*3; S=5
    }


    private static boolean isSmith(int n) {
        return n > 1;
    }
}
