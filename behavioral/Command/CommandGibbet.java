package behavioral.Command;

public class CommandGibbet implements Command{
    QueenOfHearts queenOfHearts;

    public CommandGibbet(QueenOfHearts queenOfHearts) {
        this.queenOfHearts = queenOfHearts;
    }

    @Override
    public void putASentenceIntoEffect() {
queenOfHearts.putToDeath();
    }
}
