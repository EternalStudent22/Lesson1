import model.Kotik;

public class Application {
    public  static void main(String[] args){
        Kotik cat=new Kotik();
        cat.setKotik("Vladimir",2,15,"my-my");
        Kotik cat2=new Kotik("Myrka",3,25,"my-my");
        System.out.println("Имя:"+cat.getNameCat());
        System.out.println("Вес:"+cat.getWeightCat());
        cat.liveAnotherDay();
        if(cat.getMeow().equals(cat2.getMeow())==true){
            System.out.println("Голоса котов одинаковы");
        }else{
            System.out.println("Голоса котов разные");
        }
        System.out.println("Кол-во котов: "+Kotik.getCountCat());
    }
}
