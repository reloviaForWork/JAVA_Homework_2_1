package org.example.entities;

public class Customer implements IEntity {
    private int id;
    private String Name;
    private boolean IsStudent;
    private boolean IsOfficer;

    public Customer() {

    }
    public Customer(int id, String name, boolean isStudent, boolean isOfficer) {
        this.id = id;
        Name = name;
        IsStudent = isStudent;
        IsOfficer = isOfficer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isStudent() {
        return IsStudent;
    }

    public void setStudent(boolean student) {
        IsStudent = student;
    }

    public boolean isOfficer() {
        return IsOfficer;
    }

    public void setOfficer(boolean officer) {
        IsOfficer = officer;
    }
}
