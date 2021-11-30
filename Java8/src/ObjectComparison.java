
public class ObjectComparison {

	public static void main(String[] args) {
		
		Student s1 = new Student("Ram");
		Student s2 = new Student("Ram");
		Student s3 = new Student("nidhi");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
		
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		
		String str1 = "pavan";
		String str2 = new String("pavan");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);

	}

}

class Student{
	
	private String name;
	
	Student(String name){
		this.name = name;
	}
	
	
}
