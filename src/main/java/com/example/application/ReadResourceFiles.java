package com.example.application;

import static java.util.stream.Collectors.joining;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadResourceFiles {
  public String getFileContent(final String resName) throws IOException, URISyntaxException {
    var resUri = getClass().getClassLoader().getResource(resName).toURI();
    var lines = Files.readAllLines(Paths.get(resUri));
    return lines.stream().collect(joining(System.lineSeparator()));
  }
}
