package com.example.application;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.URISyntaxException;
import org.junit.jupiter.api.Test;

public class ReadResourceFilesTest {
  @Test
  void verify_content_of_text_file() throws IOException, URISyntaxException {
    var sut = new ReadResourceFiles();
    assertTrue(sut.getFileContent("com/example/files/Textfile.txt")
        .equals("this is a text file!"));
  }
}
