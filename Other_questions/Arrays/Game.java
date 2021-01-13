package Other_questions.Arrays;

import java.util.Scanner;

public class Game {
	 public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 int n = s.nextInt();
	 int r1 = 0, r2 = 0;
	 char[] a = s.next().toCharArray();
	 for(int i = 0; i < n;++i){
        //  System.out.println(a[i]-'0');
        //  System.out.println(i%2);
	 if(a[i]-'0'!=i%2){
        ++r1; 
        // System.out.println(r1+ " is r1");
	    }
	//  if (a[i]-'0'!=1-i%2){
        else{
	        ++r2;
	    }
     }
     
    //  System.out.println(r2+ " is r2");
    //  System.out.println(r1+ " is r1");
	 System.out.println(Math.min(r1,r2));
	 }
}