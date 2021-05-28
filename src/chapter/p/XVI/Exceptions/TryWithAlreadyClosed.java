package chapter.p.XVI.Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TryWithAlreadyClosed {
    public static void main(String[] args) throws IOException {
        var path = "/dev/null";
        var writer = Files.newBufferedWriter(Path.of(path));
        writer.append("This write is permitted but a really bad idea!");
        try (writer) {
            writer.append("Welcome to the zoo!");
        }
        writer.append("This write will fail!");  // throws IOException

    }
}
