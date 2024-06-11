package com.tech.edusphere.controller.dto;

import java.util.Set;

public record CreateUserDto(String username, String password, Set<String> roles) {
}
