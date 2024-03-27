package br.com.alura.challenge.Enum;

public enum RoleEnum {
    STUDENT("STUDENT"),
    INSTRUCTOR("INSTRUCTOR"),
    ADMINISTRATOR("ADMINISTRATOR");

    public String description;

    RoleEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
