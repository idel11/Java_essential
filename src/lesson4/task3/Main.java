package lesson4.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player = new Player();

        System.out.print("Do you want to play or record(type 'play' or 'rec': ");
        Scanner sc = new Scanner(System.in);
        String action = sc.nextLine();
        sc.close();

        switch (action) {
            case "play":
                player.play();
                player.pause(action);
                player.stop(action);
                break;

            case "rec":
                player.record();
                player.pause(action);
                player.stop(action);
                break;
        }

    }

}
