package br.com.alura.challenge.Request;

import br.com.alura.challenge.Enum.RoleEnum;
import br.com.alura.challenge.Enum.StatusEnum;

public class ListRequest {
    private String code;
    private StatusEnum status;

    private RoleEnum roleEnum;

    public ListRequest() {
    }

    public ListRequest(String code, StatusEnum status, RoleEnum roleEnum) {
        this.code = code;
        this.status = status;
        this.roleEnum = roleEnum;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public RoleEnum getRole() {
        return roleEnum;
    }

    public void setRole(RoleEnum roleEnum) {
        this.roleEnum = roleEnum;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
