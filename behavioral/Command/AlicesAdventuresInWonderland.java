package behavioral.Command;

public class AlicesAdventuresInWonderland {
    public static void main(String[] args) {

        QueenOfHearts queenOfHearts = new QueenOfHearts();
        Bailiff bailiff = new Bailiff(new CommandGibbet(queenOfHearts), new CommandPardon(queenOfHearts));

        bailiff.execute();
        bailiff.haveMercy();

    }
}
