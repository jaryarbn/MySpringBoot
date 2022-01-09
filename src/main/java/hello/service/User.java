package hello.service;

public class User {
    Integer id;
    String namer;

    public User(Integer id, String namer) {
        this.id = id;
        this.namer = namer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamer() {
        return namer;
    }

    public void setNamer(String namer) {
        this.namer = namer;
    }
}
