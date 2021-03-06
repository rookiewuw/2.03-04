import java.util.Objects;
abstract class Animal{
    String name;
    int age;
    double price;
    Animal(String name,int age,double price){
        this.age=age;
        this.name=name;
        this.price=price;
    }
    public abstract String toString();

    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj == null||getClass()!= obj.getClass())return false;
        Animal pets =(Animal) obj;
        return price==pets.price&&
                Objects.equals(name,pets.name)&&
                Objects.equals(age,pets.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,age,price);
    }
}
