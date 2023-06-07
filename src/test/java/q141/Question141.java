package q141;

public class Question141 {
	
	public static void main(String[] args) {
        String names [] = {"Thomas", "Peter", "Joseph"};
        String pwd [] = new String[3];//3 elementli array tanımladık
        int idx = 0;//1
        try{
            for(String n : names){//Thomas
                pwd[idx] = n.substring(2,6);// pwd[0]=omas, pwd[1]=ter
   //ilk yazilan deger include ama son yazilan deger include olmaz substring de
   //substing() karakter sayısı yetmezse exception fırlatır
              System.out.println(pwd[idx]);//omas ter seph
                idx++;//1,2
            }
        }
        catch (Exception e){
            System.out.println("Invalid Name");
            //e.printStackTrace(); //con
        }
//        for (String p : pwd){   //pwd[] = {omas, null, null} 2.create edilen array pwd
//            System.out.println(p);
//        }
	}
    //What is result?

//A
// omas
//Invalid Name

//Answer: A

    //second version


    }








	


