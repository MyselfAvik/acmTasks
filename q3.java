import java.util.*;
public class q3{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
        
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int j=0;j<n;j++){
            a[j]=sc.nextInt();
        }
        String answer=ans(a);
        System.out.println(answer);
        }
        sc.close();
    }
        public static String ans(int[] a){
            int n=a.length;
            for(int i=1;i<n-1;i++){
                if(a[i-1]<=a[i+1] && a[i]>=2*a[i-1]){
                    a[i+1]-=a[i-1];
                    a[i]-=2*a[i-1];
                    a[i-1]=0;
                }
            } 
            boolean ans=true;
            for(int i=0;i<n;i++){
                if(a[i]!=0){
                    ans=false;
                    break;
                }
            }
            if(ans)
                return "YES";
            else
                return"NO" ;
        }
        
}
