package model;

public class Kotik {
   private static int countCat=0;
   private String nameCat;
   private int prettiness;
   private int weightCat;
   private  String meow;
   private int satiety=(int)(Math.random()*4)+1;
   private String nameEat;

   public static int getCountCat() {
      return countCat;
   }

   public String getNameCat() {
      return nameCat;
   }

   public int getPrettiness() {
      return prettiness;
   }

   public int getWeightCat() {
      return weightCat;
   }

   public String getMeow() {
      return meow;
   }

   public int getSatiety() {
      return satiety;
   }

   public String getNameEat() {
      return nameEat;
   }




   public Kotik(String nameCat,int prettiness,int weightCat,String meow){
      this.nameCat=nameCat;
      this.prettiness=prettiness;
      this.weightCat=weightCat;
      this.meow=meow;
      countCat+=1;

   }
   public Kotik(){
      countCat+=1;
   }

   public void setKotik(String nameCat,int prettiness,int weightCat,String meow){
      this.nameCat=nameCat;
      this.prettiness=prettiness;
      this.weightCat=weightCat;
      this.meow=meow;
   }

   public void eat(int satiety){

         this.satiety+=satiety;
   }
   public boolean eat(int satiety, String nameEat){

      return true;
   }

   public boolean eat(){

      eat(satiety,nameEat);
      return true;
   }


   private boolean sleep(int satiety){
      if(satiety<=0){
         eat(2);
         return false;
      }else{
         this.satiety--;
         return true;
      }
   }
   private boolean play(int satiety){
      if(satiety<=0){
         eat(2);
         return false;
      }else{
         this.satiety--;
         return true;
      }
   }
   private boolean chaseMouse(int satiety){
      if(satiety<=0){
         eat(1);
         return false;
      }else{
         this.satiety--;
         return true;
      }
   }
   private boolean bite(int satiety){
      if(satiety<=0){
         eat(3);
         return false;
      }else{
         this.satiety--;
         return true;
      }
   }
   private boolean countsUnicorns(int satiety){
      if(satiety<=0){
         eat(1);
         return false;
      }else{
         this.satiety--;
         return true;
      }
   }


   public void liveAnotherDay(){
         for(int i=0;i<24;i++){
            int flag=(int)(Math.random()*5)+1;
            switch(flag){
               case(1):
                  if(bite(satiety)==true){
                     System.out.println("Кот сделал кусь");
                  }else{
                     System.out.println("Кот поел");
                     eat(satiety);
                  }
                  break;
               case (2):
                  if(chaseMouse(satiety)==true){
                     System.out.println("Кот поймал мышь");
                  }else{
                     System.out.println("Кот поел");
                     eat(satiety);
                  }
                  break;
               case(3):
                  if(play(satiety)==true){
                     System.out.println("Кот играет");
                  }else{
                     System.out.println("Кот поел");
                     eat(satiety);
                  }
                  break;
               case(4):
                  if(sleep(satiety)==true){
                     System.out.println("Кот спит");
                  }else{
                     System.out.println("Кот поел");
                     eat(satiety);
                  }
                  break;
               case(5):
                  if(countsUnicorns(satiety)==true){
                     System.out.println("Кот считает единорогов");
                  }else{
                     System.out.println("Кот поел");
                     eat(satiety);
                  }
            }
         }
   }

}
