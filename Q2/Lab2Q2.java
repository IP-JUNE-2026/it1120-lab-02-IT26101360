public class Lab2Q2
{
	public static void main(String args[])
	{
		int length=10; //length of a side of the square
		int perimeter=4*length; //perimeter of the square fence
		double pi=22/7.0;
		double circum=perimeter; /*perimeter of square is equal
									to circumference of circle*/
		double radius=circum/(pi*2.0);
		System.out.println("Circumference = "+circum); //printed for extra clarification in answer
		System.out.println("Radius of the circular fance is= "+radius);
	}
}