
package com.service.types;

import java.util.Date;

/**
 *
 * @author osvaldo
 */
public class Employee {
    
    private Long id;
    private String name;
    private int gender;
    private int job_id;
    private String lastName;
    private Date birthday;
    private int hrs;
    
    public Employee(){
    }
    
    public Employee(Long id, String name, int gender, int job_id, String lastName, Date birthday, int hrs){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.job_id = job_id;
        this.lastName = lastName;
        this.birthday = birthday;
        this.hrs = hrs;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public int getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(int gender) {
        this.gender = gender;
    }

    /**
     * @return the job_id
     */
    public int getJob_id() {
        return job_id;
    }

    /**
     * @param job_id the job_id to set
     */
    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the hrs
     */
    public int getHrs() {
        return hrs;
    }

    /**
     * @param hrs the hrs to set
     */
    public void setHrs(int hrs) {
        this.hrs = hrs;
    }

    
}
