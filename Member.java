/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author User
 */
public class Member {
    private static int id=1001;
    private String name;
    private String email;
    private String phoneNo;
    private String password;
    private boolean premiumMem;
    private boolean loginstatus;
    
    //constructor
    public Member(){}
    
    public Member(String name, String email, String phoneNo,String password, boolean premiumMem) {
        id++;
        this.name = name;
        this.email = email;
        this.phoneNo = phoneNo;
        this.password = password;
        this.premiumMem = premiumMem;
    }
    
    //getter
    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public boolean isPremiumMem() {
        return premiumMem;
    }

    
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPremiumMem(boolean premiumMem) {
        this.premiumMem = premiumMem;
    }

    //method
    
    
    @Override
    public String toString() {
        return "Member{" + "id=" + id + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + ", password=" + password + ", premiumMem=" + premiumMem + ", loginstatus=" + loginstatus + '}';
    }

    
    
    
}
