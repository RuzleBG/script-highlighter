package com.mh.script_coloring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ScriptColoringApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ScriptColoringApplication.class, args);
		System.out.println(PdfReader.readPdf(""));
	}

}
