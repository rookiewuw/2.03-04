import java.util.ArrayList;
import java.util.Set;

public class Shop implements PetShop{
    public static final double sellPrice=10;
    public static final double raisePrice=10;
    double money;
    ArrayList<Animal>petList=new ArrayList<>();
    static ArrayList<SetMeal>mealList=new ArrayList<>();
    static {
        mealList.add(new SetMeal("1",new Bird("喜鹊",2,25.3),new Vaccine("X1",33.2),50));
        mealList.add(new SetMeal("2",new Dog("金毛",3,150),new Vaccine("狂犬",30),170));
    }
    public Shop(double money){
        this.money=money;
    }
    private void printInf(Animal pets,String op){
        System.out.println("宠物信息 "+pets.toString());
        System.out.println("操作"+op);
    }

    @Override
    public void inputPets(Animal pets) throws AException{
        for(int i=1;i<sellPrice;i++){
            if(money<pets.price)
                throw new AException("余额不足");
            petList.add(pets);
            money-=pets.price;
        }
        printInf(pets,"进货");
    }

    @Override
    public void SetMeal(String name) throws BException {
        SetMeal setMeal;
        for(SetMeal t: mealList)
            if(t.name==name){
                setMeal=t;
                if(petList.contains(setMeal.pets))
                    petList.remove(setMeal.pets);
                else throw new BException("售罄");
                money+=setMeal.price;
                printInf(setMeal.pets,"售卖");
            }
        return;
    }
    public void lookAfter(Animal animal,int day){
        money+=day*raisePrice;
        printInf(animal,"寄养");
    }
}
