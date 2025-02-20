package creational.Builder;
 class HouseBuilder
 {
     private String roofType;
     private String floorType;
     private String doorType;
     private HouseBuilder(Builder builder)
     {
         this.roofType=builder.roofType;
         this.floorType=builder.floorType;
         this.doorType=builder.doorType;
     }
     static class Builder
     {
         private String roofType;
         private String floorType;
         private String doorType;
         public Builder()
         {

         }
         public HouseBuilder build()
         {
            return new HouseBuilder(this);
         }
         public Builder buildRoof(String roofType)
         {
             this.roofType=roofType;
             return this;
         }
         public Builder buildFloor(String floorType)
         {
             this.roofType=roofType;
             return this;
         }
         public Builder buildDoor(String doorType)
         {
             this.roofType=roofType;
             return this;
         }
     }
     public String toString()
     {
         String str ="roof ="+roofType+" floor ="+floorType+" door ="+doorType;
         return str;
     }
 }

public class HouseBuilderDemo {
    public static void main(String[] args) {
        HouseBuilder.Builder builder1 = new HouseBuilder.Builder();
        HouseBuilder houseBuilder = builder1.buildRoof("concrete").buildFloor("concrete").buildDoor("wood").build();
        System.out.println(houseBuilder);
    }

}
