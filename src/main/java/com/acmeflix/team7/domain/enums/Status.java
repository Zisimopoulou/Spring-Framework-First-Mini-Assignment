package com.acmeflix.team7.domain.enums;

public enum Status {
    ONGOING("ongoing"),
    COMPLETED("completed"),
    UPCOMING("upcoming");

    private String status;
    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}
