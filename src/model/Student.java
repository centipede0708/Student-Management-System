package model;

public class Student {

    private int id;
    private String name;
    private String email;
    private String branch;
    private int marks;

    public Student(String name, String email, String branch, int marks) {
        this.name = name;
        this.email = email;
        this.branch = branch;
        this.marks = marks;
    }

    public Student(int id, String name, String email, String branch, int marks) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.branch = branch;
        this.marks = marks;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getBranch() { return branch; }
    public int getMarks() { return marks; }
}
