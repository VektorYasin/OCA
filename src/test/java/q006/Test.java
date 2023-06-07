package q006;
import java.io.IOException;

class X{
		public void printFileContent() throws IOException {//ln 5
			/*code goes here */
			throw new IOException();//ln 7
			//bu exception metod isminin sonuna eklenmeli
			//eklendikten sonra bu metod çağırldığında main metoda da exception eklenmelidir.
		}
	}
public class Test {
	public static void main(String[] args) throws Exception{//ln 11
		X xobj = new X();
		xobj.printFileContent();		
	}
}
//Which two modifications should you make so that the code compiles?