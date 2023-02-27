package ru.yandex.later.user;

import lombok.Builder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class UserMapper {
    public User makeUser (UserDto userDto){

        return User.builder()
                .id(userDto.getId())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
//                .registrationDate(DateTimeFormatter.ofPattern (userDto.getRegistrationDate()))
//                .userState(userDto.getUserState())
                .build();
    }

    public UserDto makeUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
//                .registrationDate(user.getRegistrationDate())
//                .userState(user.getUserState())
                .build();
    }
}
