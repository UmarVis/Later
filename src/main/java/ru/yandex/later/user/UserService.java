package ru.yandex.later.user;

import ru.yandex.later.item.Item;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User saveUser(User user);
}
