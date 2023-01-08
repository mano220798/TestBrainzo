package Stepdef;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	public static void generateJvmReport(String jsonPath) {

		File f = new File("\\home\\dilip\\eclipse-workspace\\AllReports\\jvmReport");

		Configuration c = new Configuration(f, "Brainzo");
		c.addClassifications("Platform", "LINUX");
		c.addClassifications("Jdk-Version", "17.0");

		List<String> li = new ArrayList<String>();
		li.add(jsonPath);

		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
	}

}
