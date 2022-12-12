package Giris;

import java.util.Scanner;

public class UsluSayiHesapla {
    public static void main(String[] args) {
        int n,k;
        Scanner in = new Scanner(System.in);
        System.out.println("ussu alinacak sayi : ");
        n= in.nextInt();
        System.out.println("us olacak sayi : ");
        k = in.nextInt();
        int top = 1 ;

        for(int i = 1; i <= k ; i++){
            top *= n ;
        }
        System.out.println("Cevap : " + top);
    }
}
