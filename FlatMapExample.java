package com.techtalk.debu.java8.stream;

import java.io.File;
import java.nio.file.Files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.Arrays;

public class FlatMapExample {

	public static final String sourceFileURI = "C:\\Debu Paul Drive\\demo.txt";

	public static void main(String[] args) throws IOException {

		File file = new File(sourceFileURI);

		long uniqueWords = Files.lines(Paths.get(file.toURI()), Charset.defaultCharset())
				.flatMap(line -> Arrays.stream(line.split(" "))).distinct().count();

		System.out.println(uniqueWords);
	}
}
