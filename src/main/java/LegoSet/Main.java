package LegoSet;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.time.Year;
import java.util.ArrayList;
import java.util.Set;


import jaxb.JAXBHelper;

public class Main {

    public static void main(String[] args) throws Exception {
        LegoSet legoSet = new LegoSet();
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setPieces(519);
        legoSet.setYear(Year.of(2018));
        legoSet.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));
        legoSet.setNumber(75211);
        legoSet.setWeight(new Weight(0.89, "kg"));

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig("Imperial Mudtrooper", 2));
        minifigs.add(new Minifig("Imperial Pilot", 1));
        minifigs.add(new Minifig("Mimban Stormtrooper", 1));
        legoSet.setMinifigs(minifigs);

        legoSet.setTags(Set.of("Starfighter",  "Star Wars","Stormtrooper", "Solo"));



        JAXBHelper.toXML(legoSet, System.out);

        JAXBHelper.toXML(legoSet, new FileOutputStream("LegoSet.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("LegoSet.xml")));
    }

}