package v1.utils;

public class Person
{
    private String name, home;
    private Integer age;
    private Boolean liveAlone;

    public Person(String name, String home, Integer age, Boolean liveAlone)
    {
        this.name = name;
        this.home = home;
        this.age = age;
        this.liveAlone = liveAlone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getLiveAlone() {
        return liveAlone;
    }

    public void setLiveAlone(Boolean liveAlone) {
        this.liveAlone = liveAlone;
    }
}
