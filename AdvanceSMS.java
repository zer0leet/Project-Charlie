/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zer0leet;

import com.zer0leet.dao.impl.StudentDAOImpl;
import com.zer0leet.entity.Student;
import java.util.Scanner;

/**
 *
 * @author Deepika
 */
public class AdvanceSMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        StudentDAOImpl stdDAO = new StudentDAOImpl();
        
        System.out.println("Welcome To Advanced Student Management System");
        System.out.println("1.Add Student");
        System.out.println("2.Delete Student");
        stdDAO.insert(new Student(1, "Ram", "Dev", "985483953", "rd@gmail.com", true));
        stdDAO.insert(new Student(2, "Ramila", "Devi", "95483953", "rad@gmail.com", false));
       
        Student[] studentList=stdDAO.getAll();
     for (int i=0;i<studentList.length; i++){
         if(studentList[i]!=null)
         System.out.println(studentList[i].getFullName());
         
     }
}
}
