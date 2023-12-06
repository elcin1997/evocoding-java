package main;

import java.util.Scanner;

public class StingsClass {
    @Override
    public String toString() {
        return "StingsClass{}";
    }

    public static void main(String[] args) {
        //stirinler 2 yolla yaradilir
        //1 new kiwordu ile
        //2 literal
        //literal
//
//        String s="salam";
//        String s2= "salam";
//        String s3="sala";
//        String s4= new String("salam");
//        String s5 =new String("salam");
//
//        System.out.println(s.equals(s2));
//        System.out.println(s.equals(s4));
//        System.out.println(s==s5);
//        Scanner sc= new Scanner(System.in);
//        String userName="Elcin";
//        String parol="124er54";

//        String userName1=sc.nextLine();
//        String parol1=sc.nextLine();
//        if(userName1.equals(userName) && parol1.equals(parol)){
//            System.out.println("sisteme daxil oldunuz");
//        }else {
//            System.out.println("parol ve  username tekrar daxil edin");
//        }

//        char[] arr1={'a','b','c','f','g'};
//        char[] arr2=new  char[3];
//        System.arraycopy(arr1,1,arr2,0,3);
//        for (char c: arr2){
//            System.out.println(c);
//        }
//        System.out.println("-----------------------------------------");
//        char [] arr3= arr1.clone();
//        for (int i=0; i<arr1.length;i++){
//            System.out.println(arr3[i]);
//        }

//        String a="salam";
//        String b="salam";
//        String a1= new String("salam");
//        String b1=new String("salam");
//        System.out.println(a==b);
//        System.out.println(a==b1);
//        System.out.println(a.equals(b));
//        System.out.println(a.equals(b1));

       Scanner sc = new Scanner(System.in);
//        String s=sc.nextLine();
////        char []  =s.length();
//        System.out.println(s.split(" ").length);

//        int tersesed=0;
//        int eded=sc.nextInt();
//        while (eded!=0){
//           int reqem =eded % 10;
//          tersesed= tersesed*10+reqem;
//         eded/=10;
//        }
//        System.out.println(tersesed);
//
        System.out.println(" sozu daxil edin");

        String a=sc.nextLine();


        char[] ch = new char[a.length()];

        for (int i=0;i<ch.length;i++){

            ch[i]=a.charAt(i);

        }
        for (int i=a.length()-1;i>=0;i--){
            System.out.print(ch[i]);
        }









    }
}
