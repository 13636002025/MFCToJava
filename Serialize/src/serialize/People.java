package serialize;

import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class People implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public static class TestSerializable {
		public static void serialize(Object obj,String fileName)throws Exception{
			File file = new File(fileName);
			FileOutputStream output = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(output);
			oos.writeObject(obj);
			oos.flush();
			output.close();
		}
		
		public static Object deSerialize(String fileName) throws Exception{
			File file = new File(fileName);
			FileInputStream input = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(input);
			Object obj = ois.readObject();
			ois.close();
			input.close();
			return obj;
			}
		

	}
	
	public static void main(String args[]) throws Exception{
		People p = new People();
		TestSerializable.serialize(p, "temp.txt");
		p.setName("TEST");
		System.out.println("序列化："+p.getName());
		People pp = (People) TestSerializable.deSerialize("temp.txt");
		System.out.println("反序列化："+pp.getName());
		
	}


}
