import java.util.Scanner;

public class FactoryUsage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tipul jocului selectat: ");
        String type = scanner.nextLine();
        GameFactory gameFactory;

        if (type.equals("PC")) {
            gameFactory = new ValorantGameCreator();
        } else if (type.equals("Board")) {
            gameFactory = new MonopolyGameCreator();
        } else {
            throw new RuntimeException("Nu exista acest joc");
        }

        Game createdGame = gameFactory.create();
        System.out.println("Creaza jocul \n " + createdGame);
    }
}

