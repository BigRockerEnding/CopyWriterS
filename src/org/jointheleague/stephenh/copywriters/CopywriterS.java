package org.jointheleague.stephenh.copywriters;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Year;

public class CopywriterS {
	public static void main(String[] args) throws IOException {
		new CopywriterS().run();
	}
	
	private void run() throws IOException {
		File sourcery = new File(new java.io.File("src/org/jointheleague/stephenh/copywriters").getCanonicalPath());
		for (File filer : sourcery.listFiles()) {
			FileWriter writeMe = new FileWriter(filer, true);
			writeMe.write("\n\n//Copyright Stephen Harris, " + Year.now());
			writeMe.close();
		}
	}
	
	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//Copyright Stephen Harris, 2015