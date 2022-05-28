package ArrayBasic;

public class ArrayEx03Student {
	String name;
	int age;
	String location;
	public ArrayEx03Student(String name, int age, String location){
		super();
		this.age = age;
		this.name = name;
		this.location = location;
			}
		@Override
	public String toString() {
		return "ArrayEx03Student [name=" + name + ", age=" + age + ", location=" + location + "]";
	}
	public static void main(String[] args) {
		//ArrayEx03Student aa = new ArrayEx03Student();
		ArrayEx03Student ss[] = new ArrayEx03Student[5];
		ss[0] = new ArrayEx03Student("Rajendra", 23," Akole");
		ss[2] = new ArrayEx03Student("Nikhil", 22, "Ahmednagar");
		ss[4] = new ArrayEx03Student("Sanil", 25, "Rajur");
		for (int i = 0; i < ss.length; i++) {
			ArrayEx03Student aa = ss[i];
			System.out.println(aa);
			System.out.println(ss[i]);
							}
				}
	}
