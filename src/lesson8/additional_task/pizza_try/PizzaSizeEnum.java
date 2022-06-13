package lesson8.additional_task.pizza_try;

public enum PizzaSizeEnum {

    EXSMALL("extra small", 20),
    SMALL("small", 30),
    MEDIUM("medium", 40),
    LARGE("large", 50),
    EXLARGE("extra large", 60);



    private final String sizeName;
    private final int size;

    PizzaSizeEnum(String sizeName, int size) {
        this.sizeName = sizeName;
        this.size = size;
    }


    public String getSizeName() {
        return sizeName;
    }

    public int getSize() {
        return size;
    }

    public static PizzaSizeEnum getPizzaSizeNameBySize(int size) throws PizzaNotFoundException {


        for (int i = 0; i < PizzaSizeEnum.values().length; i++) {
            if ((i == PizzaSizeEnum.values().length - 1) && (size <= PizzaSizeEnum.values()[i].size)) {
                return PizzaSizeEnum.values()[i];
            }
            if ((size >= PizzaSizeEnum.values()[i].size) && (size < PizzaSizeEnum.values()[i + 1].size)) {
                return PizzaSizeEnum.values()[i];
            }
        }
        throw new PizzaNotFoundException("No such size");
    }

    public static PizzaSizeEnum getLargestPizza() {
        PizzaSizeEnum biggest = null;
        for (int i = 0; i < PizzaSizeEnum.values().length; i++) {
            biggest = PizzaSizeEnum.values()[0];
            if (biggest.size < PizzaSizeEnum.values()[i].size){
                biggest = PizzaSizeEnum.values()[i];
            }
        } return biggest;
    }

    public static PizzaSizeEnum getSmallestPizza() {
        PizzaSizeEnum biggest = null;
        for (int i = 0; i < PizzaSizeEnum.values().length; i++) {
            biggest = PizzaSizeEnum.values()[0];
            if (biggest.size > PizzaSizeEnum.values()[i].size){
                biggest = PizzaSizeEnum.values()[i];
            }
        } return biggest;
    }

}
