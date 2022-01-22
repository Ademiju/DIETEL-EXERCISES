package chapterEight;

public class RegionEnum {
    public enum Region{ NN("Kaduna","Katsina","Kano","Sokoto"),SS("Akwa-Ibom","Onitsha","Port-Harcourt"),WW("Lagos,Oyo,Osun<Ekiti");
         private final String[] states;
         Region(String...states){
             this.states = states;
             System.out.println("I was called");
        }

       public String[] getStates(){
             return states;
       }
    }
}
