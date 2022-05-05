/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testCalculator;

import java.util.Scanner;

/**
 *
 * @author ThierryvanderDrift
 */
public class GetInput {
    
    Scanner scan = new Scanner(System.in);
    
    public String getEquation(){
        String equation = scan.nextLine();        
        return equation;
    }
    

    
}
