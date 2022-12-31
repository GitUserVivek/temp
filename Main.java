import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // String password = s.next();
        // int key = s.nextInt();
        String password = "EQWJVXEG";
        int key = 3;
        char[] charpass = password.toCharArray();
        String dpass = "";
        int step =1;
        for(char i: charpass ){ 
            System.out.print((char)( ((int)i) -step));
            step++;
            if(step > key) step = 1;
        }
    }
}