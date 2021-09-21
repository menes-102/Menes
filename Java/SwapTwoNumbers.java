public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 10;
        int d = 20;
        
        // way 1 (a,b)
        a ^= b^(b=a);
        System.out.println("a = " + a +", b = " + b); 

        // way 2 (c,d)
        c += d-(d=c);    
        System.out.println("c = " + c +", d = " + d);


    }
}
