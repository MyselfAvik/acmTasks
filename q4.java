import java.util.*;
public class q4{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
        
        int n=sc.nextInt();
        String s=sc.next();
        int answer=ans(s);
        System.out.println(answer);
        sc.close();
        }
    }
        public static int ans(String s){
            int count=0;
            int n=s.length();
            for(int i=0;i<n-2;i++){
                if(s.charAt(i)=='p' && s.charAt(i+1)=='i' && s.charAt(i+2)=='e'){
                    count++;
                    i+=2;
                }
                else if(s.charAt(i)=='m' && s.charAt(i+1)=='a' && s.charAt(i+2)=='p'){
                    count++;
                    i+=2;
                }
            } 
            return count; 
        }
}
