/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testCalculator;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;

public class Validate {
    private String[] modifiers = {"*", "/", "-", "+"};
    
    //checkt alleen of modifier aanwezig is
    public int hasModifier(String equation){

        for (int i = 0; i < modifiers.length; i++)
        {
           if(equation.contains(modifiers[i]))
           {
               return i;
           }
        }
        return -1;
    };
    
    public String sanitize(String equation)
    {
        String sanitized = equation.replaceAll("[^0-9*+-.,//]", "");
        return sanitized;
    }

            
}
