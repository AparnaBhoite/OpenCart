package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	private static Properties properties;
	String path = "C:\\Users\\Aparna\\git\\OpenCart\\OpenCart\\src\\test\\resources\\config\\config.properties";

	public ReadConfig() {
		properties = new Properties();

		try {
			FileInputStream fis = new FileInputStream(path);
			try {
				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getURL() {
		String url = properties.getProperty("baseurl");
		if (url != null) {
			return url;
		}else {
			throw new RuntimeException("url not specified in config file");
		}
	}
}
