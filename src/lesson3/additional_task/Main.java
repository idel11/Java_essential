package lesson3.additional_task;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Instrument guitar = new Guitar(1, "plastic", 6);
        Instrument electricGuitar = new ElectricGuitar(2, "plastic", 6, 220);
        Object obj = new ElectricGuitar(3, "carbon", 4, 110);
        ElectricGuitar objInst = (ElectricGuitar) obj;

        System.out.println("==========================================");
        objInst.doElectricGuitarActions();
        objInst.doGuitarActions();
        System.out.println("==========================================");
        ((ElectricGuitar) obj).doGuitarActions();
        ((ElectricGuitar) obj).doElectricGuitarActions();
        System.out.println("==========================================");

        Instrument[] instArr = {guitar, electricGuitar, objInst};

        System.out.print("Введыть id інструменту: ");
        Scanner sc = new Scanner(System.in);
        int inpId = sc.nextInt();
        sc.close();

        MusicInstrumentService instrumentService = new MusicInstrumentService(instArr);
        Optional<Instrument> searchInstrument = instrumentService.findInstrumentById(inpId);

        if (searchInstrument.isPresent()) {
            System.out.println(searchInstrument);
        } else {
            System.out.println("Instrument not found 404");
        }

    }

}
