package ComprehensiveTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
//import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;

//import org.json.JSONObject;

//import net.sf.json.JSON; 
import com.alibaba.fastjson.JSON;

import de.odysseus.staxon.json.JsonXMLConfig;
import de.odysseus.staxon.json.JsonXMLConfigBuilder;
import de.odysseus.staxon.json.JsonXMLInputFactory;
import de.odysseus.staxon.xml.util.PrettyXMLEventWriter;
public class HttpJSONTest {
 
    
    public static void main(String[] args) throws XMLStreamException, FactoryConfigurationError, IOException {
    	Scanner sc = new Scanner(System.in); 
        System.out.println("请输入地名："); 
        String place = sc.nextLine();
        String Webplace="https://www.tianqiapi.com/api/?version=v1&city="+place+"&appid=18657272&appsecret=ReI2RuN9";
        String url = Webplace;
        String json = loadJSON(url);
        System.out.println(json);
        
        
        
    	json2xml(json);
    }
    
    public static String loadJSON (String url) {//通过api接口获取json数据
        StringBuilder json = new StringBuilder();
        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                                        yc.getInputStream()));
            String inputLine = null;
            while ( (inputLine = in.readLine()) != null) {
            	
            	inputLine = String.valueOf(JSON.parse(inputLine));
                json.append(inputLine);
            }
            in.close();
        } catch (MalformedURLException e) {
        } catch (IOException e) {
        }
        return json.toString();
    }
    
    public static String json2xml(String json) throws XMLStreamException, FactoryConfigurationError, IOException {
    		StringReader input = new StringReader(json);
    		StringWriter output = new StringWriter();
    		JsonXMLConfig config = new JsonXMLConfigBuilder().multiplePI(false).repairingNamespaces(false).build();
    			
    				XMLEventReader reader = new JsonXMLInputFactory(config).createXMLEventReader(input);
    				XMLEventWriter writer = XMLOutputFactory.newInstance().createXMLEventWriter(output);
    				writer = new PrettyXMLEventWriter(writer);
    				writer.add(reader);
    				reader.close();
    				writer.close();
 
    				output.close();
    				input.close();

    				if (output.toString().length() >= 38) {// remove <?xml version="1.0" encoding="UTF-8"?>
    					System.out.println(output.toString().substring(39));
    					return output.toString().substring(39);
    				}
    				return output.toString();
    }

    			


}
