/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseDay5;

/**
 *
 * @author CICCC-CIRAC
 */
    
class variable_scope {
    public static void main(String args[])
    {
        int x;
        x = 5;
        {
            int y = 6;
            System.out.print(x + "" + y);
        }
        System.out.println(x + "" + y);
    }
}
