package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CityInitializer {

	static Path path = Paths.get(System.getProperty("user.dir") + "/src/recensement.csv");

	public static List<City> getCities() throws IOException {
		List<String> fileContent = Files.readAllLines(path, StandardCharsets.UTF_8);
		
		fileContent.remove(0);

		List<City> cities = new ArrayList<City>();

		for (String line : fileContent) {
			line = line.replace(" ", "");
			String[] data = line.split(";");
			cities.add(new City(Integer.parseInt(data[0]), data[1], data[2], "null",
					Integer.parseInt(data[5]), data[6], Integer.parseInt(data[9])));
		}

		return cities;
	}

}
