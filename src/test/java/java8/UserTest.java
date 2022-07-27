package java8;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class UserTest {

    User user1 = new User(21, "Stephan", 67, true, "MQA");
    User user2 = new User(18, "Anton", 70, true, "Lead AQA");
    User user3 = new User(35, "Andrii", 86, true, "Lead MQA");
    User user4 = new User(29, "Mykola", 60, true, "AQA");
    User user5 = new User(30, "Halina", 54, false, "FE Developer");
    User user6 = new User(33, "Anastasiya", 50, false, "BE Developer");
    User user7 = new User(25, "Petro", 70, true, "MQA");
    User user8 = new User(26, "Vasyl", 99, true, "MQA");
    User user9 = new User(19, "Ihor", 76, true, "Product Manager");
    User user10 = new User(18, "Artem", 49, true, "Product Manager");
    User user11 = new User(39, "Denys", 80, true, "QA Architect");
    User user12 = new User(42, "Jelizaveta", 55, false, "AQA");
    User user13 = new User(32, "Olga", 60, false, "FE Developer");
    User user14 = new User(32, "Yevhen", 70, true, "BE Developer");
    User user15 = new User(22, "Serhii", 75, true, "FE Developer");

    List<User> userList =
            Arrays.asList(user1, user2, user3, user4, user5, user6, user7, user8, user9, user10,
                    user11, user12, user13, user14, user15);

    @Test
    public void filterByAge() {
        conditionResult(userList, new UserCheck() {
            @Override
            public boolean conditionCheck(User user) {
                return user.getAge() < 30;
            }
        });
    }

    @Test
    public void filterByName() {
        conditionResult(userList, new UserCheck() {
            @Override
            public boolean conditionCheck(User user) {
                return user.getName().contains("A");
            }
        });
    }

    @Test
    public void filterByWeight() {
        conditionResult(userList, new UserCheck() {
            @Override
            public boolean conditionCheck(User user) {
                return user.getWeight() <= 70;
            }
        });
    }

    @Test
    public void filterBySex() {
        conditionResult(userList, new UserCheck() {
            @Override
            public boolean conditionCheck(User user) {
                return user.getSex().equals(false);
            }
        });
    }

    @Test
    public void filterBySpecialty() {
        conditionResult(userList, new UserCheck() {
            @Override
            public boolean conditionCheck(User user) {
                return user.getSpecialty().contains("AQA");
            }
        });
    }

    @Test
    public void filterBySexAndAge() {
        conditionResult(userList, new UserCheck() {
            @Override
            public boolean conditionCheck(User user) {
                return user.getSex().equals(true) && user.getAge() <= 40;
            }
        });
    }

    @Test
    public void filterByNameAndSpecialty() {
        conditionResult(userList, new UserCheck() {
            @Override
            public boolean conditionCheck(User user) {
                return user.getName().contains("S") && user.getSpecialty().equals("FE Developer");
            }
        });
    }

    @Test
    public void filterByPerson() {
        conditionResult(userList, new UserCheck() {
            @Override
            public boolean conditionCheck(User user) {
                return user.getAge() <= 30 && user.getSex().equals(true) &&
                        user.getName().contains("I") && user.getWeight() <= 80;
            }
        });
    }

    @Test
    public void filterByAgeAndSpecialty() {
        conditionResult(userList, new UserCheck() {
            @Override
            public boolean conditionCheck(User user) {
                return user.getAge() <= 30 && user.getSpecialty().equals("MQA");
            }
        });
    }

    @Test
    public void filterByUserData() {
        conditionResult(userList, new UserCheck() {
            @Override
            public boolean conditionCheck(User user) {
                return user.getSex().equals(false) && user.getWeight() <= 70 &&
                        user.getSpecialty().contains("FE") && user.getName().contains("H") &&
                        user.getAge() <= 40;
            }
        });
    }

    public void conditionResult(List<User> userList, UserCheck userCheck) {
        for (User user : userList) {
            if (userCheck.conditionCheck(user)) System.out.println(user);
        }
    }
}
