package com.kgisl.sb101.service;

import jakarta.validation.constraints.NotBlank;

public class PersonRequest {

    @NotBlank(message = "UNAME cannot be null or empty")
    private String uname;

    @NotBlank(message = "EMAIL cannot be null or empty")
    private String email;

    // Getters and setters
    public String getUname() { return uname; }
    public void setUname(String uname) { this.uname = uname; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
