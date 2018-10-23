/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

public class nomer1 {
    public static void main(String[] args) {
        
        int pil = 1;
         Scanner s = new Scanner (System.in);
            while(pil<=2){
            System.out.println("1. Input data ");
            System.out.println("2. tampil data ");
            System.out.println("3. keluar ");
            System.out.print("pilih : ");
            pil = s.nextInt();
            }
    }
}
