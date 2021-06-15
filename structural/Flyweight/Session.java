package structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Session {
    public static void main(String[] args) {
DeputyFactory deputyFactory = new DeputyFactory();
        List<Deputy> deputies = new ArrayList<>();
        deputies.add(deputyFactory.getDeputyByPoliticalParty("BUT"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("BUT"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("ES"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("ES"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("ES"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("FF"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("OB"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("OB"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("ServantOfThePeople"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("ServantOfThePeople"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("ServantOfThePeople"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("ServantOfThePeople"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("ServantOfThePeople"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("ServantOfThePeople"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("ServantOfThePeople"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("Voice"));
        deputies.add(deputyFactory.getDeputyByPoliticalParty("Voice"));

        deputies.stream().forEach(deputy -> deputy.speech());
    }
}
