package pkg.one;

public class ClassEg  implements InterfaceEg,C{
  int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassEg obj= new ClassEg();
		obj.display();
		obj.x= 10;

	}

	@Override
	public void display() {
		
		System.out.println("Child class display");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	

}
