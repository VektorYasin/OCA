package q176;
abstract class Robot implements Speakable {
	public abstract void process();//motod body'si olmadıgı için abstract olmalı
	 //method body'si yoksa metod abstract olmalı
	//abstract değilse motod body'si olmalı.
}
//public abstract void process();--> Helping... Done print eder.
class Humanoid extends Robot {

	public void speak (String s) {
		System.out.println(s);
	}

	public void process () {
		System.out.println("Helping... ");
	}
}

interface Speakable {
	public void speak(String s);//interface access modifier zaten public'tir.
}

public class RobotApp {
	public static void main(String[] args) {
		Robot r = new Humanoid();//obje yaratınca o class'In metodlarını kullanabiliriz
		r.process();//Helping
		r.speak("Done");//Done
	}
}
/*
 * Which action enables the code to print Helping� Done?
 *
C. 	replace 	public void process();
	with 		public "abstract" void process();

177.
*/
