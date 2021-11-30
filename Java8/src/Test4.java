
public class Test4 {

	public static void main(String[] args) {
		System.out.println(args.length);
		
		for(int i=0;i<args.length;i++) {
			//System.out.println(args[i]);
			String[] temp = args[i].split("[.]");
			//String[] temp2 = args[i].split("."); // not seperating 
			//System.out.println(temp.length);
			//System.out.println(temp2.length);
			System.out.print("'"+temp[0]+"."+temp[3]+"'"+",");
		}
		
		

	}

}
