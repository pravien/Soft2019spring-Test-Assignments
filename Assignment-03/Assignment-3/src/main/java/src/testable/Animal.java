/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.testable;

import java.util.List;
import src.non_testable;

/**
 *
 * @author pravien
 */
public class Animal {

    private int legs;
    private boolean hasFur;
    private String species;
    private List<String> offSpring;

    public Animal(int legs, boolean hasFur, String species, List<String> offSpring) {
        this.legs = legs;
        this.hasFur = hasFur;
        this.species = species;
        this.offSpring = offSpring;
    }

    public  boolean willBeColdInWinter(){
            return !this.hasFur;
        }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public void setHasFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getOffSpring() {
        return offSpring;
    }

    public void setOffSpring(List<String> offSpring) {
        this.offSpring = offSpring;
    }

}
