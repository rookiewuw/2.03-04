import java.util.Objects;

public class Dog extends Animal{
    public Dog(String name,int age,double price){
        super(name, age,price);
    }

    @Override
    public String toString() {
        return name+" "+age+" "+price;}
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
