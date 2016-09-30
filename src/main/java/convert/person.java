package convert;


import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

@Entity
public class person {
   
    @Id
    int id;
    String firstName;
    String lastName;
    int phoneNumber;
  

    
    public person(){}
    
    public person(int i , String fn, String ln, int p){
    id = i;
    firstName = fn;
    lastName = ln;
    phoneNumber=p;
    
    }
    
    
     @Override
    public String toString() {
        return "person{id="+ id + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phoneNumber + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phoneNumber;
    }

    public void setPhone(int phone) {
        this.phoneNumber = phone;
    }

  
   
    }

