public class User {
    String name;
    Address location;
    public User(){}
    public User(String name, Address location){
        this.location = location;
        this.name = name;
    }
    public boolean equals(Object a){
        if (a == null || !(a instanceof User))return false;
        if (a == this) return true;
        User yonhu = (User)a;
        if (this.name.equals(yonhu.name)&& this.location.equals(yonhu.location))
            return true;
        return false;
    }
}
