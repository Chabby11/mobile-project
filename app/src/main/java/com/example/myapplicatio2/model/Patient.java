package com.example.myapplicatio2.model;

public class Patient {
    private long Id;

    private String patient_name;

    private String patient_second_name;

    private String patient_last_name;

    private String address;

    private int phone_number;

    private int age;

    private String gender;

    public long getId() {
        return Id;
    }
    public void setId(long Id){
        this.Id = Id;
    }
    public String getPatient_name(){
        return patient_name;
    }
    public void setPatient_name(String patient_name){
        this.patient_name=patient_name;
    }
    public String getPatient_second_name(){
        return patient_second_name;
    }
    public void setPatient_second_name(String patient_second_name){
        this.patient_second_name=patient_second_name;
    }
    public String getPatient_last_name(){
        return patient_last_name;
    }
    public void setPatient_last_name(String patient_last_name){
        this.patient_name=patient_last_name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public int getPhone_number(){
        return phone_number;
    }
    public void setPhone_number(int phone_number){
        this.phone_number=phone_number;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
}
