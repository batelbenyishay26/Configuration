import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigUtil {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties propertyFile = new Properties();
		InputStream input =null;
		
		try {
			String workingDir = System.getProperty("user.dir");
			String relaetivePath ="src\\main\\resources\\app.properties";
			input = new FileInputStream(workingDir+"\\" +relaetivePath);
			System.out.println(workingDir+"\\app.properties");
			propertyFile.load(input);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			propertyFile.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new java.io.File("").getAbsolutePath());
		System.out.println(propertyFile.getProperty("URL"));
	}


}

