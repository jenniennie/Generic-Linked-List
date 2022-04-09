/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;
/**
 *
 * @author Andrew Steinberg
 */
class Node<T>{
    
    T data; //value stored of type T
    
    Node<T> next; //ptr to next node in linkedlist
    
    public Node()
    {
        System.out.println("Node() Constructor Invoked...");
        this.data = null;  //assign data of type T
        this.next = null; //point to null since inserted at the back of the list
    }
    
    public Node(T data)
    {
        System.out.println("Node(T data) Constructor Invoked...");
        this.data = data;  //assign data of type T
        this.next = null; //point to null since inserted at the back of the list
    }
    
    
}
public class LinkedList<T> {
    
    private Node<T> head; //first node in the list
    
    private int length = 0; //initial length set to 0 since it is empty
    
    public LinkedList()
    {
        System.out.println("LinkedList() Constructor Invoked!");
        this.head = null; //empty
    }
    
    public void insert(T data)
    {
        Node<T> temp = new Node<T>(data);
        
        if(this.head == null)
            head = temp;
        else
        {
            Node<T> temp2 = head;
            
            while(temp2.next != null)
                temp2 = temp2.next;
            
            temp2.next = temp;
        }
        
        ++length;
    }
    
    public void insert(int pos, T data)
    {
        if (pos > this.length + 1)
        {
            System.out.println("Out of range!");
        }
        else if (pos == 1)
        {
            Node<T> temp = head;
            
            head = new Node<T>(data);
            
            head.next = temp;
        }
        else
        {
            Node<T> temp = head;
            
            Node<T> prev = new Node<T>();
            
            while(pos - 1 > 0)
            {
                prev = temp;
                
                temp = temp.next;
                
                --pos;
            }
            
            prev.next = new Node<T>(data);
            
            prev.next.next = temp;
        }     
    }
    
    
    public void remove(T data)
    {
        Node<T> prev = new Node();
        
        Node<T> next = head.next;
        
        Node<T> temp = head;
        
        if(head.data == data)
        {
            head = head.next;
            
            --length;
        }
        else
        {
            while(temp != null)
            {
                if(temp.data == data && temp.next == null)
                {
                    prev.next = null;
                    --length;
                    break;
                }
                else if(temp.data == data)
                {
                    prev.next = next;
                    --length;
                    break;
                }
                else
                {
                    prev = temp;
                
                    temp = temp.next;
                
                    if(temp != null)
                        next = temp.next;
                }
            }  
        }  
    }
    
    public void clear()
    {
        this.head = null;
        
        length = 0;
    }
    
    public boolean empty(){return (head == null);}
    
    public int length(){return this.length;}
    
    public String toString()
    {
        System.out.println("toString invoked.");
        
        String S = "";
        
        Node<T> temp = head;
        
        if(temp == null)
            return "Empty List";
        
        while(temp.next != null)
        {
            S += String.valueOf(temp.data) + " ---> ";
            temp = temp.next;
        }
        
        S += String.valueOf(temp.data);
                
        return S;
    }
    
    public String toString(T data)
    {
        String S = "";
        
        Node<T> temp = head;
        
        if(temp == null)
            return "Empty List";
        
        while(temp.next != null)
        {
            S += String.valueOf(temp.data) + " ---> ";
            temp = temp.next;
        }
        
        S += String.valueOf(temp.data);
                
        return S;
        
    }
}