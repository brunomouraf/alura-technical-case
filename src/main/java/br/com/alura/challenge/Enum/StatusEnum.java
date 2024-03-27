package br.com.alura.challenge.Enum;

public enum StatusEnum {

    ENABLE("ENABLE"),
    DISABLE("DISABLE");

    private String description;

    StatusEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
