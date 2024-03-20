import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        int ans=a;
        if(b%3==0){
            ans+=b/3;
            if(c%3==0){
                ans+=c/3;
            }
            else
                ans+=c/3+1;

        }
        else{
            ans+=b/3;
            b=b%3;
            if(b+c==3){
                ans++;
            }
            else if(b+c>3){
                c=c-(3-b);
                ans+=1;
                ans+=(c+2)/3;
            }
            else{
              ans=-1;  
            }
        }
    
        System.out.println(ans);
    }
        sc.close();
    }
}
