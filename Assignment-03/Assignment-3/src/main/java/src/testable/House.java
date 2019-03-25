/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.testable;

/**
 *
 * @author pravien
 */
public class House {

    
    private String addres;
    private int rooms;
    private String color;
    private int squareMeter;
    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }
    

    public House(String addres, int rooms, String color,int squareMeter) {
        this.addres = addres;
        this.rooms = rooms;
        this.color = color;
        this.squareMeter = squareMeter;
    }
    
    public int calculateRent(){
        if(this.squareMeter > 150){
            return this.squareMeter*25;
        }
        else{
            return this.squareMeter*10;
        }
    }

}
