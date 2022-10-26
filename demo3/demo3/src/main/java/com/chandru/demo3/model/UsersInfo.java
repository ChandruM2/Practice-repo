package com.chandru.demo3.model;
import javax.persistence.*;

@Entity
@Table(name = "UsersInfo")
public class UsersInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer userid;

    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private String dateOfBirth;

    public UsersInfo() {
    }

    public UsersInfo(String userName, String firstName, String lastName, String password, String dateOfBirth ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.userName = userName;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    public String getPassword ()
    {
        return password;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }

    public String getDateOfBirth ()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth (String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserName ()
    {
        return userName;
    }

    public void setUserName (String userName)
    {
        this.userName = userName;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [firstName = "+firstName+", lastName = "+lastName+", password = "+password+", dateOfBirth = "+dateOfBirth+", userName = "+userName+"]";
    }

}
