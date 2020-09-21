package lesson1;

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

}

