package software.ulpgc.katas;

import java.io.*;
import java.net.URL;
import java.util.List;

public class Main {
    static void main() throws IOException {
        URL url = new URL("https://raw.githubusercontent.com/carrlitavg/kata2/refs/heads/main/Movies.tsv");
        try (Reader reader = new InputStreamReader(url.openStream())) {
        }
    }
}
