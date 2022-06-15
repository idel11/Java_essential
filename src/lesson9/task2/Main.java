package lesson9.task2;

public class Main {
    public static void main(String[] args) {

        Device device = new Device("Apple", 1200.0f, "ABC1111111");
        System.out.println("Device to string: " + device);

        Device samsung = new Monitor("Samsung", 120.0f,
                "AB1234567CD", 1280, 1024);
        System.out.println("Monitor to string: " + samsung);

        Device samsung2 = new Monitor("Samsung", 120.0f,
                "AB1234567CD", 1280, 1024);
        System.out.println("Is samsung equals to samsung2: " + samsung.equals(samsung2));

        Device qualcomm = new EthernetAdapter("Qualcomm", 79.0f,
                "qwe123", 600, "A1:B2:C3");
        Device qualcomm2 = new EthernetAdapter("Qualcomm", 79.0f,
                "qwe123", 600, "A1:B2:C3");
        Device tpLink = new EthernetAdapter("Tp-link", 60.0f,
                "rty456", 500, "D4:E5:F6");

        System.out.println("Is qualcomm equals to qualcomm2: " + qualcomm.equals(qualcomm2));
        System.out.println("Is qualcomm equals to tp-link: " + qualcomm.equals(tpLink));

    }
}
