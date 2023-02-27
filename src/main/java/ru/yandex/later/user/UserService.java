package ru.yandex.later.user;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
    UserDto saveUser(UserDto userDto);
}
