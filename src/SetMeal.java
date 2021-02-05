import java.util.Objects;

public class SetMeal {
    String name;
    Animal pets;
    Vaccine vaccine;
    double price;
    public SetMeal(String name,Animal pets,Vaccine vaccine,double price){
        this.name=name;
        this.price=price;
        this.pets=pets;
        this.vaccine=vaccine;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(obj==null||getClass()!=obj.getClass())return false;
        SetMeal setMeal =(SetMeal) obj;
        return  price==setMeal.price&&
                Objects.equals(name,setMeal.name)&&
                Objects.equals(pets,setMeal.pets)&&
                Objects.equals(vaccine,setMeal.vaccine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,pets,price);
    }
}
