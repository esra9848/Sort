package com.eskisehir;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class newSort {
	public static void main(String[] args) throws IOException {
		if(args.length!=1) {
			System.out.println("plase supply an argument : file name ");
			
		}
		Path mypath = Paths.get(args[0]);

		List<String> lines = Files.readAllLines(mypath);
		Collections.sort(lines);
		
		for (String s : lines) {
			System.out.println(s);
		}
	}

}
