package lesson1;

import java.util.*;

public class Main {

    static class User implements Comparable<User> {
        private Integer id;
        private String name;
        private Integer age;
        private String gender;

        public User() {
        }

        public User(Integer id, String name, Integer age, String gender) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    '}';
        }

        @Override
        public int compareTo(User user) {
            return this.getName().compareTo(user.getName());
        }
    }

    private static String generateName(String[] nameArr) {
        StringBuilder builder = new StringBuilder();
        List<String> chars = Arrays.asList(nameArr);
        Collections.shuffle(chars);
        for (int i = 0; i < 3; i++) {
            builder.append(chars.get(i));
        }
        return builder.toString();
    }

    public static void main(String[] agrs) {
        Random r = new Random();
        String[] name = {"f", "r", "u", "i", "t"};
        String[] gender = {"Male", "Female"};
        int low = 20;
        int high = 23;
        System.out.println("LIST USER");
        ArrayList<User> users = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            User user = new User();
            int res = r.nextInt(gender.length);
            int age = r.nextInt(high - low) + low;
            user.setId(1);
            user.setName("Vinh");
            user.setGender("Female");
            user.setAge(20);
            //System.out.println(user.toString());
            // hien thi name trong user
//            System.out.println("Name: " + arrListName);
            users.add(user);
        }
        printUsers(users);

        Collections.sort(users);

        System.out.println("---------------------------------------------------");
        System.out.println("Sort user by name");
//        printUsers(users);

        System.out.println("---------------------------------------------------");
        System.out.println("Count Male and Female");
//        countGenders(users);

        System.out.println("---------------------------------------------------");
        System.out.println("Collect users has same name in a list");
//        collectionSameName(users);

        System.out.println("---------------------------------------------------");
        System.out.println("Collect users has same name and age in a list");
        collectUserHasSameNameAndAge(users);
    }

    private static void printUsers(List<User> users) {
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }
    }

    private static void countGenders(List<User> users) {
        ArrayList<String> items = new ArrayList<>();
        int total = 0;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getGender() == "Male")
                total += 1;
        }
        System.out.println("Male: " + (total) + "\nFemale: " + (users.size() - total));
    }

    private static Map<String, List<User>> collectionSameName(List<User> users) {
        Map<String, List<User>> clName = new HashMap<>();

//        Map<String, Map<Integer, List<User>>> map = users.stream()
//                .collect(Collectors.groupingBy(User::getName, Collectors.toList())));

        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            List<User> nameUsers = clName.get(user.getName());
            if (nameUsers == null) {
                nameUsers = new ArrayList<>();
                clName.put(user.getName(), nameUsers);
            }
            nameUsers.add(user);
        }
//        System.out.println(map);
        System.out.println(clName);
        return clName;
    }

//    private static Map<String, Map<Integer, List<User>>> collectUserHasSameNameAndAge(List<User> users) {
//        Map<String, Map<Integer, List<User>>> map = new HashMap<>();
//
//        for (int i = 0; i < users.size(); i++) {
//            User user = users.get(i);
//            Map<Integer, List<User>> nameUsers = map.get(user.getName());
//            if (nameUsers == null) {
//                nameUsers = new HashMap<>();
//                map.put(user.getName(), nameUsers);
//            }
//
//            List<User> ages = nameUsers.get(user.getAge());
//            if (CollectionUtils.isEmpty(ages)) {
//                ages = new ArrayList<>();
//                nameUsers.put(user.getAge(), ages);
//            }
//            ages.add(user);
//        }
//        System.out.println(map);
//
//        return map;
//    }

    private static Map<UserKey, List<User>> collectUserHasSameNameAndAge(List<User> users) {
        Map<UserKey, List<User>> map = new HashMap<>();
        for (int i = 0; i < users.size(); i++) {
            UserKey userKeys = new UserKey();
            User user = users.get(i);
            List<User> nameAgeUsers = map.get(userKeys);
            userKeys.setClName(users.get(i).getName());
            userKeys.setClAge(users.get(i).getAge());
            if (user.equals(userKeys)) {
                nameAgeUsers = new ArrayList<>();
                map.put(userKeys, nameAgeUsers);
            }
            nameAgeUsers.add(user);
        }
        System.out.println(map);
        return map;
    }
}







