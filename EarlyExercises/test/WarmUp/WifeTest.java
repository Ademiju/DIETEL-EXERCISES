package WarmUp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WifeTest {

    @Test

    public  void husbandCanBeCreatedIfThereIsAWifeTest() {
        Wife sarah = new Wife();
        Husband peter = new Husband(sarah);
    }
    @Test
    public void husbandCanControlTheMethodInWifeTest(){
        Wife Eve = new Wife();
        Husband Adam = new Husband(Eve);
        Adam.askMyWifeToCook("Jollof Rice and Chicken");
        Adam.askMyWifeToCook("Eba");

    }

}