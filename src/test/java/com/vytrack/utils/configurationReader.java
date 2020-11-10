package com.vytrack.utils;
/*
befor we cread this class we need frist fromproject->new _>file ->cread ->configraion .progerties file
than in the utility pacage ->new class->configraionReader
 */
import javax.security.auth.login.Configuration;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Properties;
import java.util.stream.IntStream;

public class configurationReader {
    private static final Properties Properties = new Properties();

    static {
        try(InputStream in = new FileInputStream("configuration.properties")){

            Properties.load(in);
        }catch (Exception e){
          e.printStackTrace();
          System.out.println("Failed  to load Properties files");
        }
    }
    public static String getProperty(String key){
        return Properties. getProperty(key);
    }

    public static void main (String[] args){
        System.out.println(configurationReader.getProperty("url"));
    }

}

