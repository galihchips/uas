/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.*;

/**
 *
 * @author PayOK
 */
class LinkedList 
{   
   
        
    public static void main(String[] args) {
        Integer rak;
        Boolean run = true;
        java.util.LinkedList<String> basketList = new java.util.LinkedList<String>();
        String kasir = "Kasir : ";
        for(String answer = "t"; answer.equals("t") || answer.equals("T");) {
            System.out.println(kasir + "Selamat datang di Galih Mart, Selamat berbelanja!");
            System.out.println("Hmm, ada banyak kategori rak nih, mau belanja apa dulu ya? ");
            System.out.println("1. Makanan dan Minuman ");
            Scanner purpose = new Scanner(System.in);
            rak = purpose.nextInt();
            String destination = (rak==1) ? "makanan dan minuman" : (rak==2) ? "kebutuhan rumah tangga" : (rak==3) ? "obat" : "exit";
            System.out.println("Otewe rak " + destination + "..." );
            switch (rak) {
                case 1:
                                Integer firstMenu, secondMenu, lastBasket;
                                String firstMakanan, firstmakananDesc, secondMinuman, secondminumanDesc;
                                System.out.println("hmm (lagi milih2...)");
                                System.out.println("1. Mie instan  2. Cemilan  3. Telor  (Pilih salah satu)");
                                firstMenu = purpose.nextInt();
                                firstMakanan = (firstMenu==1) ? "mie instan" : (firstMenu==2) ? "cemilan" : (firstMenu==3) ? "telor" : "skip";
                                firstmakananDesc = (firstMenu==1) ? "Oiya lupa nyetok " + firstMakanan : (firstMenu==2) ? "Hm oke juga si sambil netflixan " + firstMakanan + "nya" : (firstMenu==3) ? "Nah ini suka banget si kalo diceplok " + firstMakanan + "nya" : "skip";
                                System.out.println(firstmakananDesc);

                                System.out.println("minuman dinginnya apaya ? (Pilih salah satu)");
                                System.out.println("1. Tebs  2. Teh Pucuk  3. Beer Bintang ");
                                secondMenu = purpose.nextInt();
                                secondMinuman = (secondMenu==1) ? "tebs" : (secondMenu==2) ? "teh pucuk" : (secondMenu==3) ? "beer bintang" : "skip";
                                secondminumanDesc = "yauda " + secondMinuman + " aja kaliya ";
                                System.out.println(secondminumanDesc);
                                basketList.add(firstMakanan);
                                basketList.add(secondMinuman);
                                System.out.println(kasir + "Ini barang belanjaannya ya Kak " + basketList.toString());

                    
           System.out.println("Apakah anda ingin keluar Galih Mart ? Jawab [y / t]");
           answer = purpose.next();
                    if (answer.equals("y") || answer.equals("Y")) {
                        System.out.println("Terimakasih telah berbelanja di Galih Mart!");
                    }
          }
        }
        
//        String barang, answer;
//        boolean yn;
//
//        java.util.LinkedList<String> basketList = new java.util.LinkedList<String>();
//        System.out.println("Selamat datang di GalihMart");
//        Scanner inputBarang = new Scanner(System.in); 
//        System.out.print("Kamu tidak mempunyai alat-alat mandi, mau membelinya ? [y/n] ");
//        answer = inputBarang.nextLine().trim().toLowerCase();
//        while (true) {
//            if (answer.equals("y")) {
//            yn = true;
//            basketList.add("Sabun");
//            basketList.add("Shampo");
//            basketList.add("Pasta Gigi");
//            // take input from the user
//            
//            break;
//          } else if (answer.equals("n")) {
//            yn = false;
//            break;
//          } else {
//             System.out.println("Sorry, I didn't catch that. Please answer y/n");
//              break;
//              
//          }
//        }   
//        System.out.print("Ada parfum baru nih, mau coba ga ? [y/n] ");
//        answer = inputBarang.nextLine().trim().toLowerCase();
//        while (true) {
//            if (answer.equals("y")) {
//            yn = true;
//            basketList.add("Parfum");
//            // take input from the user
//            
//            break;
//          } else if (answer.equals("n")) {
//            yn = false;
//            break;
//          } else {
//             System.out.println("Sorry, I didn't catch that. Please answer y/n");
//              break;
//          }
//        }   
//        System.out.print("Wih, ada diskon buat pewangi tuh, mau ? ");
//        answer = inputBarang.nextLine().trim().toLowerCase();
//        while (true) {
//            if (answer.equals("y")) {
//            yn = true;
//            basketList.add("Pewangi");
//            // take input from the user
//            
//            break;
//          } else if (answer.equals("n")) {
//            yn = false;
//            break;
//          } else {
//             System.out.println("Sorry, I didn't catch that. Please answer y/n");
//              break;
//          }
//        }   
//        if (basketList.isEmpty()) {
//            System.out.println("Wah, kamu ga beli apa2 ?");
//        } else {
//            System.out.println("Oke jadi belanjaan kamu ada "  + basketList.size() + "Buah, yaitu " + basketList.toString());
//        }
    }
    
} 
