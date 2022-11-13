package rest;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;



public class generic {


			public String filereader(String st) throws IOException
			{
				Properties properties=new Properties();
				BufferedReader br=new BufferedReader(new FileReader("environment.properties"));
				properties.load(br);
				String uri=properties.get(st).toString();
				return uri;
				
			}
	}


