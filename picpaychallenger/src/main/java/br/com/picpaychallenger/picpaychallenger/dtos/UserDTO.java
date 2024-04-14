package br.com.picpaychallenger.picpaychallenger.dtos;

import java.math.BigDecimal;

import br.com.picpaychallenger.picpaychallenger.domain.user.UserType;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email,
        String password, UserType userType) {

}
