package challenges.leftJoinTest;

import challenges.leftJoin.LeftJoin;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void testIfEmpty(){
        HashMap hm1 = new HashMap();
        HashMap hm2 = new HashMap();
        List<String> list = new ArrayList<>();
        assertEquals("Should be empty", list, LeftJoin.leftJoin(hm1, hm2));

    }

    @Test
    public void testLeftJoinSame(){
        HashMap hm1 = new HashMap();
        hm1.put("fond", "enamored");
        hm1.put("wrath", "anger");
        hm1.put("diligent", "employed");

        HashMap hm2 = new HashMap();
        hm2.put("fond", "adverse");
        hm2.put("wrath", "delight");
        hm2.put("diligent", "idle");

        List<String> list = new ArrayList<>();
        list.add("fond: enamored, averse");
        list.add("wrath: anger, delight");
        list.add("diligent: employed, idle");

        assertEquals("Should be the same", list, LeftJoin.leftJoin(hm1, hm2));
    }

    @Test
    public void testLeftJoinDifferent(){
        HashMap hm1 = new HashMap();
        hm1.put("fond", "enamored");
        hm1.put("wrath", "anger");
        hm1.put("outfit", "garb");

        HashMap hm2 = new HashMap();
        hm2.put("fond", "adverse");
        hm2.put("wrath", "delight");


        List<String> list = new ArrayList<>();
        list.add("fond: enamored, averse");
        list.add("wrath: anger, delight");
        list.add("outfit: garb, null");

        assertEquals("Should be a bit different", list, LeftJoin.leftJoin(hm1, hm2));
    }

}
