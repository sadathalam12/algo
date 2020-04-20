/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdala
 */
import java.io.File; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner; 

public class Main {
    
    public static void main(String[] args){
       Map<Integer,List> diagram = new HashMap<Integer,List>(); 
       List<String> test = new ArrayList<String>(); 
        //List<String> temp = new ArrayList<String>(); 
        File file1 = new File("C:\\Users\\mdala\\OneDrive\\Documents\\Spring 2020 GSU\\Algorithims\\Hw&Ec\\second input.txt");
        String [] s = readFile(file1);
        for(int i = 1; i<s.length; i++){
            String text = " "; 
            text = s[i]; 
             text = text.trim(); 
            if(!text.contains(" ") && !text.isEmpty()){
                
                diagram.put(Integer.parseInt(text), new ArrayList<Node>()); 
              
            }
            if(text.contains(" ") || text.isEmpty()){
                test.add(text);
           
            }
            
            
        }
        
       for(int key : diagram.keySet()){
            
           String f[] = test.toArray(new String[0]);
           for(int j = 0; j<f.length; j++){
               if(f[j].isEmpty()){
                   break;
               }
                  List<String> temp = new ArrayList<String>(); 
                  temp.add(f[j]);
                  for(String text: temp){
                      String[] node = text.split("\\s+");
                      String nodeNum = node[0];
                      String weight = node[1]; 
                      diagram.get(key).add(new Node(Integer.parseInt(nodeNum),Integer.parseInt(weight)));
                  }
                  
                  test.removeAll(temp);
               }
           }
       
        System.out.println(diagram.get(1));
       
     
       
       
          
       
             
           
       
     
       
    }
               
            
                
        
        
        
     
    
    
    
    private static String[] readFile(File file){
        String token1 = ""; 
         List<String> temp = new ArrayList<String>(); 
        try{
            Scanner sc = new Scanner(file);
            while(sc.hasNext()){
                token1 = sc.nextLine(); 
                temp.add(token1);
              }
        }catch (Exception e){
            System.out.println("File not found");
        }
        String[] f = temp.toArray(new String[0]);
        return f; 
    }
    
   
}
