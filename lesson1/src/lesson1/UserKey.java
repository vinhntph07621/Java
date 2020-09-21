package lesson1;

import java.util.Objects;

public class UserKey {
    String clName;
    Integer clAge;

    public UserKey() {
    }

    public UserKey(String clName, Integer clAge) {
        this.clName = clName;
        this.clAge = clAge;
    }

    public Integer getClAge() {
        return clAge;
    }

    public void setClAge(Integer clAge) {
        this.clAge = clAge;
    }

    public String getClName() {
        return clName;
    }

    public void setClName(String clName) {
        this.clName = clName;
    }

    @Override
    public String toString() {
        return "UserKey{" +
                "clName='" + clName + '\'' +
                ", clAge=" + clAge +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserKey userKey = (UserKey) o;
        return Objects.equals(clName, userKey.clName) &&
                Objects.equals(clAge, userKey.clAge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clName, clAge);
    }
}

