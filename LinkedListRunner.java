/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;
/**
 *
 * @author amste
 */
public class LinkedListRunner {
    
    public static void main(String []args)
    {
        LinkedList lst = new LinkedList();
        
        lst.insert("Intro to C");
        lst.insert("CS1");
        lst.insert("OOPS");
        lst.insert("CS2");
        
        System.out.println(lst.toString());
        
        lst.remove("OOPS");
        System.out.println(lst.toString());
   
    }
}