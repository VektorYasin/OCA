package q006;
import java.io.IOException;

class X{
		public void printFileContent()  {
			/*code goes here */
			//throw new IOException();//bu exception metod isminin sonuna eklenmeli
									//eklendikten sonra bu metod çağırldığında main metoda da exception eklenmelidir.
		}
	}
public class Test {
	public static void main(String[] args) {
		X xobj = new X();
		xobj.printFileContent();		
	}
}
