/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcdemo;

/**
 *
 * @author hyunyoungpark
 */
public class CalculatorModel {
    private int CalValue;
    public void addTwoNumbers(int no1, int no2)
    {
        CalValue = no1 + no2;
    }
    
    public int getCalcvalue(){
        return CalValue;
    }
    
}
