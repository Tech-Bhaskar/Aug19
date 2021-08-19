package p11_Aug10;

public class Demo7 {

	public static void test(String... s)
	{
		int count=s.length;
		System.out.println(count);
		
		for(String v:s)
		{
			System.out.println(v);
		}
	}
	
	public static void main(String[] args) {
		Demo7.test("a1");
		Demo7.test("a1","a2");
		Demo7.test("a1","a2","a3");
	}
}
