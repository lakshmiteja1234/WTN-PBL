package com.wipro.interfaces;

public class Ex1 {
    public static void main(String args[]) {
        Veena v = new Veena();
        Saxophone s = new Saxophone();
        Playable pv, ps; 
        pv = new Veena();
        ps = new Saxophone();
        
        v.play(); 
        s.play(); 
        
        pv.play(); 
        ps.play();
        
    }
}
