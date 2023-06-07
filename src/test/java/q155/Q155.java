package q155;

public class Q155 {
	
	

	public static void main(String[] args) {
		int wd=0;//-1, 0, 2, 4, 3,
		String[] days = {"sun","mon","wed","sat"};

		for (String s:days) {
			switch (s) {
			case"sat"://boş case, ancak break'e kadar devam eder işlem.
			case"sun":
				wd-=1;
					break;
			case "mon"://case "mon" de break olmadığı için case "wed" de işleme giriyor
				wd++;
			case"wed":
				wd+=2;
			}
		}
		System.out.println(wd);
		}
	}
/*
 * What is the result?
A. 3
B. 4
C. -1
D. Compilation fails.
Answer: A
 */

