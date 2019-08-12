package main.java;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\wunsh\\IdeaProjects\\DocServ\\src\\main\\resources\\text.md");
        String content = FileUtils.readFileToString(file, "UTF_8");
        System.out.println();
    }
}
