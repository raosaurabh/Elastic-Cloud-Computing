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
public class LinkNode {
    private int nodeData;
    private LinkNode next;
    
    public LinkNode(int nodeData)
    {
        next=null;
        this.nodeData=nodeData;
    }

    public int getNodeData() {
        return nodeData;
    }

    public void setNodeData(int nodeData) {
        this.nodeData = nodeData;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }
}
