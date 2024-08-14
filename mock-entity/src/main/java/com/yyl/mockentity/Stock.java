package com.yyl.mockentity;

import jakarta.persistence.*;

@Entity(name = "stock")
public class Stock {
    @Column
    private String name;
    @Column
    private String code;
    @Column
    private String input;
    @Column
    private String output;
    @Column
    private String current;
    @Column
    private String win;
    @Column
    private String kui;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getWin() {
        return win;
    }

    public void setWin(String win) {
        this.win = win;
    }

    public String getKui() {
        return kui;
    }

    public void setKui(String kui) {
        this.kui = kui;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
