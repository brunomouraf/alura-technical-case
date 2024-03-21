package br.com.alura.challenge.Enum;

public enum StatusEnum {

    ENABLE("enable"),
    DISABLE("disable");

    private String description;

    StatusEnum(String description) {
        this.description = description;
    }
}
