/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testCalculator;

public class Calculator {
    public double calculate(double som1, double som2, int modifier)
    {
        //1: *
        //2: /
        //3: +
        //4: -
        switch(modifier)
        {
            case 0:
                return som1 * som2;
            case 1:
                return som1 / som2;
            case 2:
                return som1 + som2;
            case 3:
                return som1 - som2;
        }
        return 0;
    }
}
