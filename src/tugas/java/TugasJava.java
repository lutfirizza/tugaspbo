package tugas.java;
import java.io.*;
import java.util.*;

public class TugasJava {


    public static void main(String[] args) throws IOException {
         
        
        
        BufferedReader bf = new BufferedReader
                
                (new InputStreamReader(System.in));
        
        System.out.print("Masukkan Gallon:");
        
        int gallon = Integer.parseInt(bf.readLine());
        
        double liters = gallon * 3.785;
        
        System.out.println("Liters: " + liters);
    }
    }
