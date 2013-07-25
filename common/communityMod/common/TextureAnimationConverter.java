package communityMod.common;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class TextureAnimationConverter 
{
	private static String[] fileNames = {
			
	};
	private static char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	
	public static void convertTxtToPngMCMeta()
	{
		for(String fileName : fileNames)
		{
			if (!new File(fileName.replace(".txt", ".png.mcmeta")).exists()) {
				String newFile = "{\n\t\"animation\":\n\t{\n\t\t\"frames\":\n\t\t[\n\t\t\t";
				BufferedReader reader;
				try {
					reader = new BufferedReader(new InputStreamReader(
							(new FileInputStream(new File(fileName)))));
					String line;
					while ((line = reader.readLine()) != null) {
						boolean isTime = false;
						String index = "";
						String time = "";
						for (char c : line.toCharArray()) {
							if (isDigit(c) && !isTime) {
								index += c;
							}
							if (isDigit(c) && isTime) {
								time += c;
							}
							if (c == '*' && !isTime) {
								isTime = true;
							}
						}
						
						if(!time.equals(""))
						{
							newFile += "{\"index\": " + index + ", \"time\": "
									+ time + "},\n\t\t\t";
						} else
						{
							newFile += "{\"index\": " + index + "},\n\t\t\t";
						}
					}

					reader.close();
				} catch (Exception x) {
					System.out.println("Could not convert animation file: "
							+ fileName);
					x.printStackTrace();
				}
				newFile += "]\n\t}\n}";
				BufferedWriter writer;
				try {
					writer = new BufferedWriter(new FileWriter(new File(
							fileName.replace(".txt", ".png.mcmeta")), false));
					writer.write(newFile);

					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	private static boolean isDigit(char c)
	{
		for(char digit : digits)
		{
			if(c == digit)
			{
				return true;
			}
		}
		
		return false;
	}
}