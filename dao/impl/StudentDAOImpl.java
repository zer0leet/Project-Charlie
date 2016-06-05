/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zer0leet.dao.impl;

import com.zer0leet.entity.Student;

/**
 *
 * @author Deepika
 */
public class StudentDAOImpl {

    private Student[] studentList = new Student[10];
    private int counter = 0;

    public void insert(Student s) {
        studentList[counter] = s;
        counter++;

    }

    public boolean delete(int id) {
        for (int i = 0; i < studentList.length; i++) {
            Student s = studentList[i];
            if (s != null && s.getId() == id) {
                studentList[i] = null;
                 return true;
            }

        }
        
        return false;
    }
    public Student getById(int id){
        for (int i=0;i<studentList.length;i++){
            Student s=studentList[i];
            if(s!=null & s.getId()==id){
                return s;
            }
        }
        return null;
    }
    public Student [] getAll(){
        return studentList;
    }
}