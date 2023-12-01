package main;

import java.util.Scanner;

public class Lesson4_12 {
    public static void main(String[] args) {
        //Array-massivler
        //tek olculu massivler
        Scanner sc = new Scanner(System.in);
        //System.out.println("olcunu daxil edin");
        //int b = sc.nextInt();

        //  int[] myArray= new int[b];
//        for (int i=0;i<b;i++){
//            myArray[i]=i+15;
//        }
//        for (int i=0 ;i<b;i++){
//            System.out.print(myArray[i]+" ");
//        }

//        int [] arr={1,2,3,4,5,6};
//        for (int x:arr){
//            System.out.print(x+" ");
//
//        }


//        int [] arr1= new int[b];
//        int [] arr2 =new int[b];
//        int [] arr3 =new int[b];
//
//        for (int i=0;i<b;i++){
//
//           arr1 [i]=i+15;
//        }
//        for (int j=0;j<b;j++){
//            arr2 [j]=j+16;
//        }
//
//        for (int k=0;k<b;k++){
//            arr3 [k]=arr1[k]+arr2[k];
//        }
//        for (int j=0;j<b;j++){
//            System.out.println(arr3[j]);
//        }


//        int [] arr =new int[b];
//        int min=arr[0];
//        int maks=arr[0];
//        for (int i=0;i<b;i++){
//
//           arr [i]=i+15;
//        }
//
//        for (int i =0 ;i<b;i++){
//            if(arr[i] < min ){
//                min=arr[i];
//
//            }
//            if (arr[i]>maks){
//                maks=arr[i];
//            }
//        }
//
//        System.out.println("min="+min+ " ve "+" maks= "+maks);
//        int [] arr =new int[b];
//        int sayTek=0;
//        int sayCut=0;
//
//        for (int i=0;i<b;i++){
//          arr [i]=i+15;
//        }
//
//        for (int i=0;i<b;i++){
//
//            if(arr[i]%2==0){
//                sayCut++;
//
//            }else {
//                sayTek++;
//
//            }
//        }
//        int arrCut[] =new int[sayCut];
//        int arrTek[] =new int[sayTek];
//        int x=0;
//        int z=0;
//
//        for (int i=0;i<b;i++){
//
//            if(arr[i]%2==0){
//
//                arrCut[x]=arr[i];
//                x++;
//
//
//            }else {
//                arrTek[z]=arr[i];
//                z++;
//            }
//
//        }


//        int[][] arr = new int[3][3];
//        int[][] arr1= new  int[3][3];
//        int[][] arr3 = new int[3][3];
//
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = sc.nextInt();
//
//            }
//        }

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);
//
//            }
//
//            System.out.println("");
//        }

//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                arr1[i][j] = sc.nextInt();
//
//            }
//        }


//        for (int i = 0; i < arr1.length; i++) {
//
//            for (int j = 0; j < arr1[i].length; j++) {
//                System.out.print(arr1[i][j]);
//
//            }
//
//            System.out.println("");
//        }


//        1. massivde olan sade ededlerin sayini tapmaq
//        2. massivde 7e qaliqsiz bolunen element sayini tapmaq
//        3. massivin en kicik cut ve en boyuk tek ededinin tapilmasi
//        4. tek indexde durmus elementleri 0la evez etmek
//        5. massivde tekrarlanan elementler var, burda olan elementleri
//        tekrarsiz sekilde yeni massive kocurmek (1,2,3,1,4,5,2) -> (1,2,3,4,5)
//        6.elementler artaraq duzulub duzulmemesini yoxlamaq (1,2,3) positive case,
//            (1,3,2) negative case
//         7. arrayin elementlerinin polindrom olub olmamasini yoxlamaq
//        8. 2 eyniolculu massivin elementlerinin ust uste dusub dusmemesini yoxlamaq

        /* tapsiriqlarin helli-  */

//        // 2. massivde 7e qaliqsiz bolunen element sayini tapmaq


//        System.out.print("massivin uzunluqunu daxil edin :");
//        int b = sc.nextInt();
//        int say = 0;
//        int a[] = new int[b];
//        for (int i = 0; i < b; i++) {
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < b; i++) {
//            if (a[i] % 7 == 0) {
//                say++;
//            }
//        }
//        System.out.println(say);


        //        3. massivin en kicik cut ve en boyuk tek ededinin tapilmasi

//        int b = sc.nextInt();
//        int[] arr = new int[b];
//        int sayTek = 0;
//        int sayCut = 0;
//
//        for (int i = 0; i < b; i++) {
//            arr[i] = i + 15;
//        }
//
//        for (int i = 0; i < b; i++) {
//
//            if (arr[i] % 2 == 0) {
//                sayCut++;
//
//            } else {
//                sayTek++;
//
//            }
//        }
//        int arrCut[] = new int[sayCut];
//        int arrTek[] = new int[sayTek];
//        int x = 0;
//        int z = 0;
//
//        for (int i = 0; i < b; i++) {
//
//            if (arr[i] % 2 == 0) {
//
//                arrCut[x] = arr[i];
//                x++;
//
//
//            } else {
//                arrTek[z] = arr[i];
//                z++;
//            }
//
//        }
//
//        int min = arrCut[0];
//        int maks = arrTek[0];
//
//        for (int i = 0; i < sayCut; i++) {
//            if (arrCut[i] < min) {
//                min = arrCut[i];
//            }
//
//        }
//
//        for (int i = 0; i < sayTek; i++) {
//            if (arrTek[i] > maks) {
//                maks = arrTek[i];
//            }
//        }
//
//        System.out.print("massivin en kicik cut ededi: ");
//        System.out.println(min);
//
//        System.out.print("massivin en boyuk tek ededi: ");
//        System.out.println(maks);

        //        4. tek indexde durmus elementleri 0la evez etmek

//        int b=sc.nextInt();
//        int a[] =new int[b];
//
//        for (int i = 0; i < b; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < b; i++) {
//            if (i%2==0){
//                a[i]=0;
//            }
//
//        }
//
//        for (int i = 0; i < b; i++) {
//            System.out.print(a[i]);
//        }

       /* 5. massivde tekrarlanan elementler var, burda olan elementleri
       tekrarsiz sekilde yeni massive kocurmek (1,2,3,1,4,5,2) -> (1,2,3,4,5)*/

//        int b = sc.nextInt();
//        int a[] = new int[b];
//        int say=0;
//
//        for (int i = 0; i < b; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        int z=0;
//
//        for (int i = 0; i <b+1; i++) {
//            if(a[i]!=a[i+1]){
//                System.out.println(a[i]);
//
//
//
//            }
//            b=b-1;
//
//
//        }

        /*
         6.elementler artaraq duzulub duzulmemesini yoxlamaq (1,2,3) positive case,
//            (1,3,2) negative case
         */

//        int b = sc.nextInt();
//        int a[] = new int[b];
//
//        for (int i = 0; i < b; i++) {
//            a[i] = sc.nextInt();
//        }
//        for (int i = 0; i < b+1; i++) {
//            if(a[i+1]-a[i]==a[i+2]-a[i+1]){
//                System.out.println("beli");
//            }
//            else {
//                System.out.println("xeyr");
//            }
//            b--;
//        }

        /*
        int b = sc.nextInt();
        int a[] = new int[b];

        for (int i = 0; i < b; i++) {
            a[i] = sc.nextInt();
        }

        int yenieded;

        for (int i = 0; i < b; i++) {
            while (a[i] != 0) {
                int r = a[i] % 10;

                yenieded = r * 10 + r;


                a[i] /= 10;

            }

        }

         */
/*
8. 2 eyniolculu massivin elementlerinin ust uste dusub dusmemesini yoxlamaq
 */

//        int[][] arr = new int[3][3];
//        int[][] arr1 = new int[3][3];
//
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = sc.nextInt();
//
//            }
//        }
//
//        for (int i = 0; i < arr1.length; i++) {
//            for (int j = 0; j < arr1[i].length; j++) {
//                arr1[i][j] = sc.nextInt();
//
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] == arr1[i][j]) {
//                    System.out.println("beli");
//                } else {
//                    System.out.println("xeyr");
//                }
//
//            }
//        }
//
//
//        sc.close();
   }

}
