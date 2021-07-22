package newpackage;

import newpackage.Cars;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 9751
 */
public class TestTwoClass {

    public static void main(String[] args) {

        Cars car1 = new Cars(00432, "Benz", "SUV", "Bule", 4, 100000, 'y');
        
        
        System.out.print(car1.toString());

        VipService user1 = new VipService(00432, "Benz", "SUV", "Bule", 4, 100000, 'y', 6.25, 5);

        System.out.print(user1.toString());

        // System.out.print(user1.finalPrice((user1.getPrice()),(user1.calcTax(car1.getPrice(), user1.getTaxRate())),(user1.getDiscount())));
    }

}
