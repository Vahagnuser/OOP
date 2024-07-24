package am.aua.hw.util;

import java.io.*;

public class FileUtil {
    public static void saveStringsToFile(String[] content, String path) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(path))) {
            for (String line : content) {
                writer.println(line);
            }
        }
    }

    public static String[] loadStringsFromFile(String path) throws IOException {
        int lineCount = countLines(path);
        String[] lines = new String[lineCount];
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            int index = 0;
            while ((line = reader.readLine()) != null) {
                lines[index++] = line;
            }
        }
        return lines;
    }

    private static int countLines(String path) throws IOException {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.readLine() != null) {
                lines++;
            }
        }
        return lines;
    }
}
