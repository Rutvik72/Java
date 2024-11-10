/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.List;

public abstract class User {

    private String _name;
    private String _membership;
    public static List<User> admins;

    public static void print_admin_names() {
        for (User a : admins) {
            System.out.println(a.get_name());
        }
    }

    private boolean _verified = false;

    void set_verified(boolean verified) {
        _verified = verified;
    }
    
    boolean get_verified() {
        return _verified;
    }
    void verify() {
        System.out.println("Verifying..");
        set_verified(true);
    }
    public String toString() {
        return get_name() + " " + get_membership();
    }

    public User(String name) {
        set_name(name);
    }
    public User() {
        set_name("name");
        set_membership("membership");
    }

    public User(String name, String membership) {
        set_name(name);
        set_membership(membership);
    }

    public enum Membership {
        Bronze, Silver, Gold;
    }

    void set_name(String name) {
        _name = name;
    }

    String get_name() {
        return _name;
    }

    void set_membership(String membership) {
        _membership = membership;
    }

    void set_membership(Membership membership) {
        _membership = membership.name();
    }

    String get_membership() {
        return _membership;
    }

    public boolean equals(User u2) {
        if (get_name() == u2.get_name() 
                && get_membership() == u2.get_membership()) 
        {
            return true;
        }
        return false;
    }
    
}
