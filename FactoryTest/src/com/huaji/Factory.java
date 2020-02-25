package com.huaji;

import java.io.*;
import java.util.Properties;

public class Factory {
    public static Charactor createCharactor(){
        Properties properties=new Properties();

        try(InputStream in= new FileInputStream(new File("src/FactoryTest.properties"))) {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //使用反射创建对象
        Charactor charactor=null;
        try {
            charactor=(Charactor)Class.forName(properties.getProperty("CharactorX")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return charactor;
    }
}
