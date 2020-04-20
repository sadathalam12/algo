
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdala
 */
public class Node {
    private int nodeNumber; 
    private int weight; 
   
    
    public Node(int nodeNumber, int weight ){
        this.nodeNumber = nodeNumber; 
        this.weight = weight; 
       
    }
    
    public int getWeight(){
        return weight; 
    }
    
    public int getNumber(){
        return nodeNumber; 
    }
    
    public void setWeight(int newWeight){
        weight = newWeight; 
    }
    
    public void setNodeNumber(int newNodeNumber){
        nodeNumber = newNodeNumber; 
    }
    
    public String toString(){
        return nodeNumber + " " + weight; 
    }
    
   
}
