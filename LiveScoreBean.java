/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise5_2;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class LiveScoreBean {
    
    public static void main(String[] args) {
    HeadQuaterBound headquater = new HeadQuaterBound();
    FirstSubscriber first = new FirstSubscriber();
    SecondSubscriber second = new SecondSubscriber();
    headquater.addPropertyChangeListener(first);
    headquater.addPropertyChangeListener(second);
    
    Scanner inp = new Scanner(System.in);
    String scoreLine;
    while(!scoreLine.equals("")) {
        headquater.setScoreLine(scoreLine);
        System.out.print("Enter Score ");
        scoreLine = inp.nextLine();
    }
}
}
