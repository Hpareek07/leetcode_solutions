package Other_questions.Arrays;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {

    public static void main(String[] args) {
        int n = 5;

        List<List<Integer>> res = pascalTriangle(n);
        System.out.println(res.size()+ " is the size");
        System.out.println(res.toString());
        for(List l  : res){
            System.out.println(l.toString());
        }
    }

    private static List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        
        for(int line = 1; line <= numRows; line++){ 
            List<Integer> temp = new ArrayList<>();
            int C=1;// used to represent C(line, i) 
            for(int i = 1; i <= line; i++){  
        // The first value in a line is always 1 
                System.out.print(C+" ");
                temp.add(C);
                C = C * (line - i) / i;  
            }
            res.add(temp);
        System.out.println(); 
        } 

        return res;
    }

}