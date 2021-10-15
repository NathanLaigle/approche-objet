package fichier;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get(System.getProperty("user.dir") + "/src/recensement.csv");
		List<String> fileContent = Files.readAllLines(path, StandardCharsets.UTF_8);

		fileContent.remove(0);

		List<String> newFileContent = new ArrayList<String>();

		newFileContent.add("nom;code;populationTotale");

		for (String line : fileContent) {
			line = line.replace(" ", "");
			String[] arrayLine = line.split(";");
			if (Integer.parseInt(arrayLine[9]) > 25_000) {
				newFileContent.add(arrayLine[6] + ";" + arrayLine[2] + ";" + arrayLine[9]);
			}
		}
		
		File file = new File(System.getProperty("user.dir") + "/src/new-recensement.csv");
		file.createNewFile();

		Path newFile = Paths.get(System.getProperty("user.dir") + "/src/new-recensement.csv");
		
		Files.write(newFile, newFileContent, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
	}

}
