import java.util.Scanner;

class Pro1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            Double n = sc.nextDouble();
            Double x = 0.143 * n;
            x = Math.pow(x, n);
            if(x-Math.floor(x) < 0.5){
                System.out.println((int)Math.floor(x));
            }
            else{
                System.out.println((int)(Math.floor(x)+1));
            }
        }
    }
}
