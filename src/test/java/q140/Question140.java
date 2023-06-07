package q140;

public class Question140 {

	
	    public static void main(String[] args) {
	        int iVar = 100;
	        float fVar = 100.100f;
	        double dVar = 123;
			fVar = iVar;//kucuk buyuge olur
          	//iVar = fVar; //buyuk kucuge olmaz
			dVar=fVar;
			/*
			This line attempts to assign the value of iVar (an integer) to fVar (a float).
			This assignment will cause a compilation error because
			you are assigning a larger data type to a smaller data type
			 */
			//fVar = dVar;
         	dVar = fVar;//kucuk buyuge olur
          	//iVar = dVar;//buyuk kucuge olmaz
			dVar = iVar;//kucuk buyuge olur

	          /*
	        Second Version
	        the question was same but number of lines was changed.
	        ivar=fvar was at line 8.	olmaz
	        fvar=dvar at line 9.	olmaz
	        ivar= dvar at line 11.	olmaz
	        be careful at line numbers.
	         */

	        /* which three lines fail to compile? (choose three.)
	        A. Line 7
	        B. Line 8
	        C. Line 9
	        D. Line 10
	        E. Line 11
	        F. Line 12

	        Answer: ADF
	         */


	    }
	}
