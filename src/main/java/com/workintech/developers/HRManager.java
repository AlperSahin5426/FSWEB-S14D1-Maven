package com.workintech.developers;

public class HRManager extends Employee{
    JuniorDeveloper[] juniorDevelopers;
    MidDeveloper[] midDevelopers;
    SeniorDeveloper[] seniorDevelopers;
    public HRManager(int id , String name, double salary){
        super(id,name,salary);
        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[10];
        this.seniorDevelopers = new SeniorDeveloper[10];
    }
    public void addEmployee(int index, JuniorDeveloper developer) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = developer;
            } else {
                System.out.println("Index is full: " + index);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not found: " + index);
        }
    }
    public void addEmployee(int index, MidDeveloper developer) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = developer;
            } else {
                System.out.println("Index is full: " + index);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not found: " + index);
        }
    }
    public void addEmployee(int index, SeniorDeveloper developer) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = developer;
            } else {
                System.out.println("Index is full: " + index);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index not found: " + index);
        }
    }

    @Override
    public void work() {
        System.out.println("HRManager starts working");
        setSalary(getSalary()+5000);
    }
}
