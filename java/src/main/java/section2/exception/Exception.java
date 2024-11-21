package section2.exception;

import java.io.IOException;
import org.jetbrains.annotations.NotNull;

public class Exception {

    public static void main(String[] args) throws IOException {
        JavaFilePrinter javaFilePrinter = new JavaFilePrinter();
        javaFilePrinter.readFile();
    }

    private int parseIntOrThrow(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number: " + str, e);
        }
    }

    private Integer parseIntOrThrowV2(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw null;
        }
    }

}
