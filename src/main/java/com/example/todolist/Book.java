package com.example.todolist;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book {

    private Integer id;
    private String name;
    private String autor;


    public void setId(int i) {
        this.id = i;
    }
    public void setName(String str) {
        this.name = str;
    }
    public void setAutor(String str) {
        this.autor = str;
    }

    public Integer getId() {
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getAutor(){
        return  this.autor;
    }
}
