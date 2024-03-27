package br.com.alura.challenge.Request;

import br.com.alura.challenge.Enum.RoleEnum;
import br.com.alura.challenge.Enum.StatusEnum;

public class ListRequest {
    private RoleEnum role;
    private StatusEnum status;

    public ListRequest() {
    }

    public ListRequest(RoleEnum role, StatusEnum status) {
        this.role = role;
        this.status = status;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
