/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fájlkezelés;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Fájlkezelés {


    public static void main(String[] args) throws IOException {
        /* 1: támogató osztály: */
        Path path=Paths.get("adatok.txt");
        List<String> szoveg=Files.readAllLines(path);
        int i=0;
        /*while (i<szoveg.size()){
            System.out.println(szoveg.get(i));
            i++;
        }*/
        for (String szov : szoveg) {
            Emberek ember=new Emberek(szov);
            System.out.println(ember.toString());
        }
        //String fn="adatok.txt";
        //Files f=new File(fn);
        //File f=new File("adatok.txt");
        
        
    }
    
}
