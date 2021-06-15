package structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeputyFactory {
    private final Map<String, Deputy> deputies = new HashMap<>();

    public Deputy getDeputyByPoliticalParty(String party){
        Deputy deputy = deputies.get(party);
        if(deputy == null){
            switch (party){
                case "BUT":
                    System.out.println("Give a bribe the deputy of BUT");
                    deputy = new BUT();
                    break;
                case "ES":
                    System.out.println("Give a bribe the deputy of ES");
                    deputy = new ES();
                    break;
                case "FF":
                    System.out.println("Give a bribe the deputy of FF");
                    deputy = new FF();
                    break;
                case "OB":
                    System.out.println("Give a bribe the deputy of OB");
                    deputy = new OB();
                    break;
                case "ServantOfThePeople":
                    System.out.println("Give a bribe the deputy of ServantOfThePeople");
                    deputy = new ServantOfThePeople();
                    break;
                case "Voice":
                    System.out.println("Give a bribe the deputy of Voice");
                    deputy = new Voice();
                    break;
            }
            deputies.put(party, deputy);

        }
        return deputy;
    }
}
