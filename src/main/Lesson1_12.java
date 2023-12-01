package main;

import java.util.Scanner;

public class Lesson1_12 {
    public static void main(String[] args) {
        // System.out.println("Hello world");
        Scanner sc = new Scanner(System.in);
//        int i=1;
//      while ( i <50){
//          System.out.println("ededi daxil edin");
//          int x=sc.nextInt();
//          if(x>50){
//              System.out.println("50-den kicik reqem daxil edin");
//          }
//          else if (x<50) {
//              System.out.println(x);
//              break;
//          }
//
//        int x=sc.nextInt();
//        System.out.println("ededi daxil edin");
//        int i =1;
//        while (i<x){
//            System.out.println(i + "*" + i +"="+(i*i));
//            i++;
//
//
//      }
//        System.out.println("ededi daxil edin");
//        int x= sc.nextInt();
//        int i=1;
//        while (i<=x){
//            i++;
//            if(i%2==0){
//                continue;
//            }else {
//                System.out.println(i+"tek ededddir");
//            }
//
//        }
//

//        int say = 0;
//        int x = 0;
//
//        while (x < 2) {
//            System.out.println("parolunuzu daxil edin");
//            int parol = 123345;
//            int parol2 = sc.nextInt();
//
//            if (parol2 == parol) {
//                System.out.println("siz sisteme ugurla daxil oldunuz");
//                break;
//            }
//
//            if (parol2 != parol) {
//                say++;
//            }
//
//            if (say == 3) {
//                System.out.println("siz artiq blok olmusuz");
//                break;
//            }
//
//
//        }

        int x=0;
        int y=0;
        while (x<10){
            while (y<x){
                System.out.print("*");
                y++;

            }
            y=0;

            System.out.println(" ");
            x++;

        }


    }
}
