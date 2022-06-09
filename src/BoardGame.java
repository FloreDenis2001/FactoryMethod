public class BoardGame implements Game{
    private String name;
    private String type;
    private int maxPlayersNum;

    public BoardGame(final String name, final String type, final int maxPlayersNum) {
        this.name = name;
        this.type = type;
        this.maxPlayersNum = maxPlayersNum;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public int getMinNumberOfPlayers() {
        return 2;
    }

    @Override
    public int getMaxNumberOfPlayers() {
        return maxPlayersNum;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return false;
    }

    @Override
    public String toString() {
       String text = "\nBoard Game "+"\n";
       text+="Name : "+this.name+"\n";
       text+="Type : "+this.type+"\n";
       text+="Maxim Players : "+this.maxPlayersNum+"\n";
        return text;
    }
}
