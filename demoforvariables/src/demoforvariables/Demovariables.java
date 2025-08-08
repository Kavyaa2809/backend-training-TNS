package demoforvariables;

public class Demovariables {
	String name = "this is instance variable";
	static String namethree = "this is static variable";
	void print()
	{
	String nametwo = "this is from local variable";
	}
		public static void main(String[] args) {
			Demovariables ob=new Demovariables();
			System.out.println(ob.name);
			ob.print();
			System.out.println(Demovariables.namethree);
		}
}

