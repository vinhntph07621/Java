package lesson1;

import java.util.*;

public class Main {

    static class User implements Comparable<User>{
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
            // sort student's name by ASC
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
        for (int i = 1; i <= 300; i++) {
            User user = new User();
            int res = r.nextInt(gender.length);
            int age = r.nextInt(high - low) + low;
            user.setId(i);
            user.setName(generateName(name));
            user.setGender(gender[res]);
            user.setAge(age);
            System.out.println(user.toString());
            // hien thi name trong user
            ArrayList<String> arrListName = new ArrayList<>();
            arrListName.add(user.name);
//            System.out.println("Name: " + arrListName);
        }
    }
}


