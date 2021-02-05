public class Main {
    public static void main(String [] args){
        Shop west2=new Shop(2000);
        try {
            west2.SetMeal("1");
        }
        catch (BException e){
            System.out.println(e.getMessage());
        }
        try {
            west2.inputPets(new Bird("喜鹊",2,25.3));
            west2.inputPets(new Dog("金毛",3,150));
        }
        catch (BException e){
            System.out.println(e.getMessage());
        }
        try {
            west2.inputPets(new Bird("喜鹊",2,25.3));
            west2.inputPets(new Dog("金毛",3,150));
        }
        catch (AException e){
            System.out.println(e.getMessage());
        }
        try {
            west2.SetMeal("1");
        }
        catch (BException e){
            System.out.println(e.getMessage());
        }
        west2.lookAfter(new Dog("德牧",3,150),10);
    }
}
