package com.pavan.serialisation;

import java.io.*;

public class SerialisationTest implements Serializable {

	private static final long serialVersionUID = 1L;
	

	//normal variable
	private String name = "pavan";
	
    @Override
	public String toString() {
		return "SerialisationTest [name=" + name + ", hand=" + hand + ", password=" + password + ", j=" + j + "]";
	}



	//static
    private static int no = 1;
    
    //final
    private final String hand = "right";
        
	//transient
	private transient String password="password";
	
	// Use of transient has no impact here
    private transient static int i = 40;
    private transient final int j = 50;
    
    //static final
    private static final int k = 60; 

    
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//serialisation
		SerialisationTest obj = new SerialisationTest();
		FileOutputStream fos = new FileOutputStream("serialisation.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		
		oos.flush();
		oos.close();
		fos.flush();
		fos.close();
		
		no = 2;
		i = 44;
		
		//de-serialisation
		FileInputStream fin = new FileInputStream("serialisation.txt");
		ObjectInputStream ois = new ObjectInputStream(fin);
		SerialisationTest obj2 = (SerialisationTest) ois.readObject();
		
		System.out.println(obj2.toString());
		
		System.out.println("name : "+obj2.name);
		System.out.println("hand : "+obj2.hand);
		System.out.println("password : "+obj2.password);
		System.out.println("j : "+obj2.j);
		
		System.out.println("no : "+ obj2.no);
		System.out.println("i : "+ obj2.i);
		
		System.out.println("k : "+ obj2.k);
		
		
		
		
	}

}


/**
 * static is not used for serialisation
 * 
 * 
 * */
