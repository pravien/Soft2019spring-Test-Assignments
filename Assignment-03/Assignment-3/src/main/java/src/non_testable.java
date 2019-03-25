package src;

import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pravien
 */
public class non_testable {

    public static class Animal {
        public static int legs;
        public static boolean hasFur;
        public static String species;
        public static List<String> offSpring;
        
        private static boolean willbecoldinwinter(){
            return hasFur;
        }
        
    }
    
    private class House{
        private String addres;
        private int rooms;
        private String color;
    }

    public static void main(String[] args) {
    }

}
