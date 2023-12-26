package BigInteger_BigDecimal;

import javax.swing.*;
import java.math.*;

 class liczbaEulera  //klasa oblicza liczbe e
 {
     public static BigInteger silnia(int x) //obliczenie silni dla liczby typu BigInteger
     {
         BigInteger temp = new BigInteger("1"); //wartosc poczatkowa

         for (int i = 1; i <= x; i++)
             temp = temp.multiply(new BigInteger("" + i));
         return temp;
     }
 };

 class Main
 {
     public static void main(String[] args)
     {
         BigDecimal e = new BigDecimal(0.0);

         for (int i = 0; i < 1000; i++)
         {
             BigDecimal temp = new BigDecimal(1.0); //wartosc poczatkowa
             BigDecimal temp2 = new BigDecimal(liczbaEulera.silnia(i));
             temp2 = temp.divide(temp2, 1000, BigDecimal.ROUND_UP);
             e = e.add(temp2);
         }

         System.out.println("\n" + e + ".");
     }
 }