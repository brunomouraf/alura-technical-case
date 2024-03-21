package br.com.alura.challenge.Enum;

public enum RoleEnum {
    STUDENT("student"),
    INSTRUCTOR("instructor"),
    ADMINISTRATOR("administrator");

    private String description;

    RoleEnum(String description) {
        this.description = description;
    }
}
