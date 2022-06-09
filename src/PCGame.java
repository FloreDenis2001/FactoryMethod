public class PCGame implements Game{
    private final String name;
    private final String type;
    private final int minNumberOfPlayers;
    private final int maxNumberOfPlayers;
    private final boolean isOnline;

    public PCGame(final String name, final String type, final int minNumberOfPlayers, final int maxNumberOfPlayers, final boolean isOnline) {
        this.name = name;
        this.type = type;
        this.minNumberOfPlayers = minNumberOfPlayers;
        this.maxNumberOfPlayers = maxNumberOfPlayers;
        this.isOnline = isOnline;
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
        return minNumberOfPlayers;
    }

    @Override
    public int getMaxNumberOfPlayers() {
        return maxNumberOfPlayers;
    }

    @Override
    public boolean canBePlayedRemotely() {
        return isOnline;
    }

    @Override
    public String toString() {
      String text = "\nPC GAME "+"\n";
      text+="Nume : "+this.name+"\n";
      text+="Type : "+this.type+"\n";
      text+="Minim Players : "+this.minNumberOfPlayers+"\n";
      text+="Maxim Players : "+this.maxNumberOfPlayers+"\n";
      text+="Online : "+this.isOnline+"\n";
      return text;
    }
}
