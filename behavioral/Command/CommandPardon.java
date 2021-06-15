package behavioral.Command;

public class CommandPardon implements Command{
    QueenOfHearts queenOfHearts;

    public CommandPardon(QueenOfHearts queenOfHearts) {
        this.queenOfHearts = queenOfHearts;
    }

    @Override
    public void putASentenceIntoEffect() {
        queenOfHearts.haveMercyOn();
    }
}
