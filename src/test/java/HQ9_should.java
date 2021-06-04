import kata.HQ;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNull;

public class HQ9_should {
    @Test
    public void return_Hello_World_from_H() {
        assertThat(HQ.HQ9('H'), is("Hello World!"));
    }

    @Test
    public void return_Q_from_Q() {
        assertThat(HQ.HQ9('Q'), is("Q"));
    }

    @Test
    public void return_null_for_different_code() {
        assertNull(HQ.HQ9('A'));
    }

    @Test
    public void return_full_lyrics_from_9() {
        StringBuilder sb = new StringBuilder();
        for (int i = 99; i > 2; i--) {
            sb.append(String.format(BOTTLES, i, i, i - 1));
        }
        sb.append(END);
        assertThat(HQ.HQ9('9'), is(sb.toString()));
    }

    @Test
    public void generate_one_bottle_of_beer() {
        String lyrics = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                        "Take one down and pass it around, no more bottles of beer on the wall.\n" +
                        "No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 1 bottles of beer on the wall.";
        assertThat(HQ.generateBottlesOfBeer(1), is(lyrics));
    }

    @Test
    public void generate_two_bottle_of_beer() {
        String lyrics = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.\n" +
                "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 2 bottles of beer on the wall.";
        assertThat(HQ.generateBottlesOfBeer(2), is(lyrics));
    }

    private final String BOTTLES = "%s bottles of beer on the wall, %s bottles of beer.\n" +
            "Take one down and pass it around, %s bottles of beer on the wall.\n";
    private final String END = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
            "Take one down and pass it around, 1 bottle of beer on the wall.\n" +
            "1 bottle of beer on the wall, 1 bottle of beer.\n" +
            "Take one down and pass it around, no more bottles of beer on the wall.\n" +
            "No more bottles of beer on the wall, no more bottles of beer.\n" +
            "Go to the store and buy some more, 99 bottles of beer on the wall.";
}
