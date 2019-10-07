package com.rexnegotium.repository.inmemory;

import com.rexnegotium.model.Role;
import com.rexnegotium.model.User;
import com.rexnegotium.repository.UserRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Инициализируется при первом обращении тестовыми данными
 *
 * @author Ivan Senchukov
 */
public class InMemoryUserRepository implements UserRepository {

    private Map<Integer, User> entryMap;
    private static int idSequence = 10000;

    private static int getNextId() {
    	return idSequence++;
	}
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

        User vasily = new User("Вася", "vasily@example.com", "QWERTY123456".toCharArray(), true, LocalDate.now(), Set.of(Role.ROLE_USER, Role.ROLE_ADMIN));
        User ivan   = new User("Ваня", "ivan@example.com", "QWERTY123456".toCharArray(), true, LocalDate.now(), Set.of(Role.ROLE_USER, Role.ROLE_ADMIN));
        User anna   = new User("Аня", "anna@example.com", "QWERTY123456".toCharArray(), true, LocalDate.now(), Set.of(Role.ROLE_USER, Role.ROLE_ADMIN));
        User arseny = new User("Арсений", "arseny@example.com", "QWERTY123456".toCharArray(), true, LocalDate.now(), Set.of(Role.ROLE_USER, Role.ROLE_ADMIN));

        int vasilyId    = getNextId();
        int ivanId      = getNextId();
        int annaId      = getNextId();
        int arsenyId    = getNextId();

        vasily.setId(vasilyId);
        ivan.setId(ivanId);
        anna.setId(annaId);
        arseny.setId(arsenyId);

        entryMap.put(vasilyId, vasily);
        entryMap.put(ivanId, ivan);
        entryMap.put(annaId, anna);
        entryMap.put(arsenyId, arseny);
    }

    @Override
    public User get(Integer userId) throws Exception {
        User user;

        user = entryMap.get(userId);

        if (user != null && !userId.equals(user.getId())) {
            System.out.println("Неконсистентные данные в репозитории! Обратитесь к Администратору!");
            // todo - throw repository exception here
            // todo - log exception properly here
            throw new Exception(String.format("Неконсистентные данные в inMemoryUserRepository.entryMap!"));
        }

        return user;
    }

    @Override
    public List<User> getAll() {
        List<User> allUsers = new ArrayList();

        for (Map.Entry<Integer, User> userEntry : entryMap.entrySet()) {
            allUsers.add(userEntry.getValue());
        }

        return allUsers;
    }

	@Override
	public User create(User user) {
		int id = getNextId();
		user.setId(id);
		entryMap.put(id, user);
    	return user;
	}
}
