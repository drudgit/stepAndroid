package com.example.log;




public class Llist {

    private String name;
    private String company;


    public Llist(String name, String company){

        this.name=name;
        this.company = company;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


}
