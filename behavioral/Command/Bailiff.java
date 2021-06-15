package behavioral.Command;

public class Bailiff {

    Command gibbet;
    Command pardon;

    public Bailiff(Command gibbet, Command pardon) {
        this.gibbet = gibbet;
        this.pardon = pardon;
    }

    public void execute(){
        gibbet.putASentenceIntoEffect();
    }

    public void haveMercy(){
        pardon.putASentenceIntoEffect();
    }
}
