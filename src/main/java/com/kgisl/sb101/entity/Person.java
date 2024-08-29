package com.kgisl.sb101.entity;

// import org.springframework.data.annotation.Id;

import org.springframework.data.annotation.Id;

public record Person(@Id Long id, String uname, String email) {

    
}