package game.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Utils {
    public static String readTextFile(String url) {
        try {
            return new String(Files.readAllBytes(Paths.get(url)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
