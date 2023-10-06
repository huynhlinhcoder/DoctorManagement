/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ManagerDoctor;
/**
 *
 * @author huynh
 */
public class Main {
    public static void main(String[] args) {
        String title= "Doctor Management";
        String[] s= new String[] {"Add Doctor", "Update Doctor", "Delete Doctor", "Search Doctor","Exit"};
        new ManagerDoctor(title, s).run();
    }
}
