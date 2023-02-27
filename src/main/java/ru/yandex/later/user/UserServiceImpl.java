package ru.yandex.later.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repository;
    private final UserMapper userMapper;

    @Override
    public List<UserDto> getAllUsers() {
        List<UserDto> userDtoList = repository.findAll().stream().map(userMapper::makeUserDto)
                .collect(Collectors.toList());
        return userDtoList;
    }

    @Override
    public UserDto saveUser(UserDto userDto) {
        User newUserDto = userMapper.makeUser(userDto);
        User newUser = repository.save(newUserDto);
        return userMapper.makeUserDto(newUser);
    }
}
