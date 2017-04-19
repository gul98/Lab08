/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.gradebook.entity;

/**
 *
 * @author gul
 */
public class DoSomething {
    private String property1;
    private String property2;
 
    public String getProperty1() {
        return property1;
    }
 
    public void setProperty1(String property1) {
        this.property1 = property1;
    }
 
    public String getProperty2() {
        return property2;
    }
 
    public void setProperty2(String property2) {
        this.property2 = property2;
    }
     
    @Override
    public String toString() {
        return "Property 1 = " + this.property1 + "   Property 2 = " + this.property2;
    }
    
}
