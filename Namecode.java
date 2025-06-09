
import java.util.Scanner;

public class Namecode {

    static void nametocode() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Your name in code is");
        name=name.toUpperCase();
        for (int i = 0; i < name.length(); i++) {
            char x = name.charAt(i);
            System.out.print((int) x);
        }
        System.out.println("");
    }
    
    static void code() {
        System.out.println("Enter the code to find the name");
        Scanner sc = new Scanner(System.in);
        long name=sc.nextLong();
        String xname=""+name;
        //System.out.println(xname);
        int l = xname.length();
        //System.out.println("lenght of string is "+l);
        int index=0;
        for (int i=0;i<(l/2);i++){
            char char1=xname.charAt(index);
            char char2=xname.charAt(index+1);
            String char3=char1+""+char2;
            int as=Integer.parseInt(char3);
            System.out.print((char)as);
            index=index+2;
        }   
                System.out.println(""); 
    }

    public static void main(String[] args) {
        int cont=1;
            while(cont==1){
            Scanner sc = new Scanner(System.in);
            System.out.println("1.code for name \n2.ascii code");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    nametocode();
                    break;
                case 2: 
                    code();
                    break;

                default: 
                    System.out.println("You dumb af bruh \nEnter a valid input");
                    break;

            }
            System.out.println("enter 0 to exit or 1 to continue");
            cont=sc.nextInt();
        }
    }
}