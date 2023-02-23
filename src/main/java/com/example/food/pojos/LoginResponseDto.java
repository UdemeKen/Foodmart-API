package com.example.food.pojos;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponseDto {

    private String token;
    private String firstname;
}
