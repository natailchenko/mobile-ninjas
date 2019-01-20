package firsthw;

public class User {
private   int  age;
private   String name;

public void setAge (int Age){
    age = Age;
}

    public int getAge() {
        return age;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
