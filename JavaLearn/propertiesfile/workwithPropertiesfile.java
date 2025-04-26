package propertiesfile;

import java.io.FileInputStream;
import java.util.Properties;

public class workwithPropertiesfile {

	public static void main(String[] args) throws Throwable {
		FileInputStream fip=new FileInputStream("C:\\Users\\admin\\Downloads\\Nilesh\\JavaBasicsforSelenium\\src\\com\\propertiesfile\\Globlevariable.Properties");
		Properties prop=new Properties();
		prop.load(fip);
		
		System.out.println(prop.get("Browsertype"));
		System.out.println(prop.get("username"));
		System.out.println(prop.get("TestEnvi"));
	}

}
