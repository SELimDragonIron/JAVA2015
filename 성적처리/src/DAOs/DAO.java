package DAOs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DAO {
	
	
	
	
	public void write(Object object,String fileName) {
		//serialize = ��ũ �ڵ��� ��ȭ�� ���ֵ��� ����
		try {
			
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("fileName"));
			out.writeObject(object);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Object read(String fileName) {
	
		Object object =null;
		
			try {
				ObjectInputStream in;
				in = new ObjectInputStream(new FileInputStream("fileName"));
				object = in.readObject();
				in.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			return object;
	}
}
