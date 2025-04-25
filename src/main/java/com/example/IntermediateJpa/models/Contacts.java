package com.example.IntermediateJpa.models;

public class Contacts {
    private String name;
    private String title;
    private String company;
    private Names names;

    public Contacts() {
    }

    public Contacts(String name, String title, String company, Names names) {
        this.name = name;
        this.title = title;
        this.company = company;
        this.names = names;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Names getNames() {
        return names;
    }

    public void setNames(Names names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", company='" + company + '\'' +
                ", names=" + names +
                '}';
    }
}
