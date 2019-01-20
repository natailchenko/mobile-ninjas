package firsthw;

public class User<getName, getAge> {

    private   int  age;
    private   String name;

public void setAge (int userAge){
    age = userAge;
}

    public int getAge() {
        return age;
    }

    public void setName(String userName) {
        name = userName;
    }

    public String getName() {
        return name;
    }
}
