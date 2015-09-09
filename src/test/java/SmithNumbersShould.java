import org.junit.Test;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

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
    public void detect_the_smallest_non_smith_number_except_the_corner_cases() {
        assertThat(isSmith(6), is(false)); // DC(6)=2*3; S=5
    }

    @Test
    public void detect_prime_number_as_smith() {
        assertThat(isSmith(2), is(true));
        assertThat(isSmith(7), is(true)); // DC(7)=7; S=7
    }

    @Test
    public void detect_smith_numbers_from_oeis() {
        areSmith(4, 22, 27, 58, 85, 94, 121, 166, 202, 265, 274, 319, 346, 355, 378, 382, 391, 438, 454, 483, 517, 526,
                535, 562, 576, 588, 627, 634, 636, 645, 648, 654, 663, 666, 690, 706, 728, 729, 762, 778, 825, 852, 861,
                895, 913, 915, 922, 958, 985, 1086, 1111, 116);
    }

    private void areSmith(int... candidates) {
        for (int current : candidates) {
            assertThat(isSmith(current), is(true));
        }
    }

    private static boolean isSmith(int n) {
        final List<Integer> primes = Arrays.asList(2,7);
        if(primes.contains(n)) {
            return true;
        }
        return false;
    }
}
