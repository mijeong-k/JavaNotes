package sec02.exam02;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;

		System.out.println("--------------");
		x++;
		++x;
		System.out.println("x= " + x);
		System.out.println("x= " + x++);

		System.out.println("--------------");
		y--;
		--y;
		System.out.println("y= " + y);

		System.out.println("--------------");
		z = x++;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		System.out.println("x= " + x);


		System.out.println("--------------");
		z = ++x;
		System.out.println("z= " + z);
		System.out.println("x= " + x);
		
		
		System.out.println("--------------");
		z = x++; 
		System.out.println("z= " + z);
		System.out.println("z= " + x);
		
		System.out.println("--------------");
		int z1 = ++x + y++;
		/*
		 * x= x+1;
		 * z=x+y
		 * y=y+1
		 */
		System.out.println("z1= "+z1);
	}

}
