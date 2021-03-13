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
      System.out.println("номер кота " +nameCat+":"+countCat);

   }
   public Kotik(){
   }

   public void setKotik(String nameCat,int prettiness,int weightCat,String meow){
      this.nameCat=nameCat;
      this.prettiness=prettiness;
      this.weightCat=weightCat;
      this.meow=meow;
      countCat+=1;
      System.out.println("номер кота " +nameCat+":"+countCat);
   }

   public void eat(int satiety){

         this.satiety+=satiety;
      System.out.println("кот поел");
   }
   public boolean eat(int satiety, String nameEat){

      this.satiety+=satiety;
      System.out.println("кот поел"+nameEat);


      return true;
   }

   public boolean eat(){

      eat(satiety,nameEat);
      return true;
   }


   private boolean sleep(int satiety){
      if(satiety<=0){
         return false;
      }else{
         System.out.println("Кот спит");
         this.satiety--;
         return true;
      }
   }
   private boolean play(int satiety){
      if(satiety<=0){
         return false;
      }else{
         System.out.println("Кот играет");
         this.satiety--;
         return true;
      }
   }
   private boolean chaseMouse(int satiety){
      if(satiety<=0){
         return false;
      }else{
         System.out.println("Кот ловит мышь");
         this.satiety--;
         return true;
      }
   }
   private boolean bite(int satiety){
      if(satiety<=0){
         return false;
      }else{
         System.out.println("Кот сделал кусь");
         this.satiety--;
         return true;
      }
   }
   private boolean countsUnicorns(int satiety){
      if(satiety<=0){
         return false;
      }else{
         System.out.println("Кот считате идинорогов");
         this.satiety--;
         return true;
      }
   }


   public void liveAnotherDay(){
         for(int i=0;i<24;i++){
            int flag=(int)(Math.random()*5)+1;
            switch(flag){
               case(1):
                  if(bite(satiety)==false)
                     eat(2);

                  break;
               case (2):
                  if(chaseMouse(satiety)==false)
                     eat(2);
                  break;
               case(3):
                  if(play(satiety)==false)
                     eat(1);
                  break;
               case(4):
                  if(sleep(satiety)==false)
                     eat(3);
                  break;
               case(5):
                  if(countsUnicorns(satiety)==true)
                     eat(2);
                  break;
            }
         }
   }

}
