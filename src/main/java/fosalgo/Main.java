package fosalgo;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
           if (n == 1)  {
                System.out.println("Januari\nFebruari\nMaret\nApril");
            }else if(n==2){
                System.out.println("Mei\nJuni\nJuli\nAgustus");
            }else if (n==3){
                System.out.println("September\nOktober\nNovember\nDesember");
            }else if (n==4){
                System.out.println("Februari\nMaret\nApril\nMei");
            }else if (n==5){
                System.out.println("Juni\nJuli\nAgustus\nSeptember");
            }else if (n==6){
                System.out.println("Oktober\nNovember\nDesember\nJanuari");
            }else if (n==7){
                System.out.println("November\nDesember\nJanuari\nFebruari");
            }else if (n==8){
                System.out.println("Maret\nApril\nMei\nJuni");
            }else if (n==9){
                System.out.println("Juli\nAgustus\nSeptember\nOktober");
            }else if (n==10){
                System.out.println("Mei\nJuni\nJuli\nAgustus");
            }else if (n==11){
                System.out.println("September\nOktober\nNovember\nDesember");
            }else if (n==12){
                System.out.println("Januari\nFebruari\nMaret\nApril");
            }
         
    }

}
