package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    private static Properties pro;

    public static void loadConfig() {
        try {
            FileInputStream fin = new FileInputStream("src/main/resources/config.properties");
            pro = new Properties();
            pro.load(fin);
        }
        catch(Exception e){
           System.out.println(e.getMessage());
        }
    }

    public static String getProperty(String key){
        return pro.getProperty(key);

    }

}
