/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

import java.util.ArrayList;

/**
 *
 * @author dseok
 */
public class Module {
    private String Name;
    private String Id;
    private ArrayList <String> students;
    private ArrayList <String> assCourse;
    
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public ArrayList<String> getAssCourse() {
        return assCourse;
    }

    public void setAssCourse(ArrayList<String> assCourse) {
        this.assCourse = assCourse;
    }

    
    
    
    
}
