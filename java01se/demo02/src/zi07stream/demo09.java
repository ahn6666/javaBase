package zi07stream;

public class demo09 {
    private String name;

    public demo09() {
    }

    public demo09(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "zi07stream.demo09{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
