package com.example.log;




public class Llist {

    private String name;
    private String director;


    public Llist(String name, String company){

        this.name=name;
        this.director = company;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return this.director;
    }

    public void setCompany(String company) {
        this.director = company;
    }


}
