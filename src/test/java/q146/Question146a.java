package q146;

public class Question146a {

    public static void main(String[] args) throws Exception {
        String[] strs = {"A", "B"};
        System.out.println("strs[0] = " + strs[0]);//A
        System.out.println("strs[1] = " + strs[1]);//B
        int idx = 0;

        for (String s : strs) {
            strs[idx].concat(" element " + idx);
            idx++;
            // idx is incremented in the loop but nothing is affected outside of the loop
            // there is no syso nothing is printed from this loop
        }
        for (idx = 0; idx < strs.length; idx++) {//2
            System.out.println(strs[idx].concat(" element " + idx));
        }
    }
}

//What is the result? A==>AB array dolu, concat olur
//B.	A element 0
//		B element 1




