package com.example.demoPostgres.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Inside postman you have to specify the object attributes not the table attribute

@Entity // pojo to bean
@Table(name = "Student") //convert bean to table
// ORM responsible for creating the table from the bean
// If attributes of the class are specified as camel case then the ORM by itself will add underscores in the table attributes
public class Student {

    @Column(name = "id")
    @Id // primary key
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "branch")
    private String branch;

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

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}


// alternate - dont specify the column name
//@Entity // pojo to bean
//public class Student {
//
//    @Id // primary key
//    private int id;
//
//    private String firstName;
//
//    private String lastName;
//
//    private String branch;
