import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class XMLUtil {
    public static Factory createFactory(){
        Properties properties=new Properties();

        try(InputStream in=new FileInputStream(new File("D:\\study\\JavaStudy\\DesignPattern\\factoryMethod\\src\\config.properties"))) {
            properties.load(in);
        }catch (IOException e){
            e.printStackTrace();
        }

        //使用反射创建对象
        Factory factory=null;
        try {
            factory=(Factory)Class.forName(properties.getProperty("className")).newInstance();
        }catch (InstantiationException e){
            e.printStackTrace();
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return factory;
    }
}
