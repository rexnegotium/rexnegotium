package com.rexnegotium.repository.inmemory;

import com.rexnegotium.model.User;
import com.rexnegotium.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Инициализируется при первом обращении тестовыми данными
 *
 * @author Ivan Senchukov
 */
public class InMemoryUserRepository implements UserRepository {

    private Map<Integer, User> entryMap;

    /**
     * Создаёт экземпляр репозитория и наполняет его тестовыми данными
     * <p>
     * Вызывать этот конструктор в боевом коде не следует
     * Пользуйтесь методом RepositoryFactory.getInstanceOfTaskRepository()
     */
    public InMemoryUserRepository() {
        entryMap = new ConcurrentHashMap();
        refreshRepository();
    }

    /**
     * todo - создать полность сформированные тестовые задания здесь
     */
    public void refreshRepository() {
        entryMap.put(10000, new User()); // это тестовый код, если тут что-то сломается - можно удалять.
        entryMap.put(10001, new User()); // это тестовый код, если тут что-то сломается - можно удалять.
    }

    @Override
    public List<User> getAll() {
        List<User> allUsers = new ArrayList();

        for (Map.Entry<Integer, User> userEntry : entryMap.entrySet()) {
            allUsers.add(userEntry.getValue());
        }

        return allUsers;
    }

}
