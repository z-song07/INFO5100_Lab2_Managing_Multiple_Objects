/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author csong
 */
public class VitalSignsHistory {
    ArrayList<VitalSigns> history;
    
    //constructor
    public VitalSignsHistory() {
        history = new ArrayList<VitalSigns>();
    }
    
    public VitalSigns addNewVitals() {
        VitalSigns newVs = new VitalSigns();
        history.add(newVs);
        return newVs;
    }
    
    public void removeVitals(VitalSigns vs) {
        history.remove(vs);
    }
    
    public ArrayList<VitalSigns> getHistory() {
        return history;
    }
}
