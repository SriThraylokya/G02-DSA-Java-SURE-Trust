import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            switch (i) {
//                case 0 :
//                    System.out.print("A");
//                case 1 :
//                    System.out.print("B");
//                case 2 :
//                    System.out.print("C");
//
//            }
//
//        }
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("No.of minutes:"+ n);
        int M=n*60;
        System.out.println("no.of seconds for "+ n +" is :"+M);



    }
}
