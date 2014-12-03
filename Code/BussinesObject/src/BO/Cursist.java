/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

/**
 *
 * @author Benjamin
 */
public class Cursist extends DAL.DaCursist{
    
    private String Cursistennaam;
    private int ID;

    public Cursist() {}
    
    
    
    public Cursist(String Cursistennaam, int ID) {
        this.Cursistennaam = Cursistennaam;
        this.ID = ID;
    }

   
    
    
}
