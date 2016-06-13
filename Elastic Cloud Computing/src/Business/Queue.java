/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Saurabh
 */
public class Queue {
    
    private LinkNode head;
    private LinkNode tail;
    
    public Queue()
    {
        head= null;
        tail=null;
    }

    public LinkNode getHead() {
        return head;
    }

    public void setHead(LinkNode head) {
        this.head = head;
    }

    public LinkNode getTail() {
        return tail;
    }

    public void setTail(LinkNode tail) {
        this.tail = tail;
    }
    
    public LinkNode enqueue(int data)
    {
        LinkNode lastNode= new LinkNode(data);
        if(isEmpty())
        {
            head=lastNode;
            tail=lastNode;
            lastNode.setNext(null);
        }
        else
        {
            tail.setNext(lastNode);
            tail=lastNode;
            lastNode.setNext(null);
        }
        return lastNode;
    }
    
    public LinkNode dequeue()
    {
        LinkNode current=null;
        //if link list empty return
        if(isEmpty())
        {
            return null;
        }
        //if head and tail are same
        if(head==tail)
        {
            current=head;
            head=null;
            tail=null;
        }
        //if link list has elements
        if(head!=null)
        {
            current= head;
            head= head.getNext();
            return current;
        }
        return current;
    }
    
    public boolean isEmpty()
    {
        if(head==null)
            return true;
        
        return false;
    }
}
