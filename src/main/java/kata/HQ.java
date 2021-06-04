package kata;

import java.util.stream.IntStream;


public class HQ {
    private static final String HELLO = "Hello World!";
    private static final String LINE_ONE = "%s bottle%s of beer on the wall, %s bottle%s of beer.\n";
    private static final String LINE_TWO = "Take one down and pass it around, %s bottle%s of beer on the wall.\n";
    private static final String LINE_FINAL = "Go to the store and buy some more, %s bottle%s of beer on the wall.";

    public static String HQ9(char code) {
        return switch (code) {
            case 'H' -> HELLO;
            case 'Q' -> String.valueOf(code);
            case '9' -> generateBottlesOfBeer(99);
            default -> null;
        };
    }

    public static String generateBottlesOfBeer(int bottles) {
        StringBuilder sb = new StringBuilder();
        IntStream
                .range(1, bottles + 1)
                .map(i -> bottles - i + 1)
                .forEach(i -> {
                    sb.append(String.format(LINE_ONE, String.valueOf(i), i > 1 ? "s" : "", String.valueOf(i), i > 1 ? "s" : ""));
                    if (i - 1 > 0) sb.append(String.format(LINE_TWO, String.valueOf(i - 1), i - 1 > 1 ? "s" : ""));
                    else sb.append(String.format(LINE_TWO, "no more", "s"));
                });
        sb.append(String.format(LINE_ONE, "No more", "s", "no more", "s"));
        sb.append(String.format(LINE_FINAL, String.valueOf(bottles), "s"));
        return sb.toString();
    }
}
