package museum;

public enum TypeOfExhibition {
    BIOGRAPHICAL(120), HISTORICAL(150), BOTANICAL(180),
    ARTISTIC(180), ZOOLOGICAL(195);
    private double price;

    TypeOfExhibition(double price) {
        this.price = price;
    }

    TypeOfExhibition() {
    }

    public static String showTypeOfMuseumExhibition() {
        System.out.print("TypeOfMuseum enum: ");
        StringBuilder stringBuilder = new StringBuilder();
        for (TypeOfExhibition typeOfExhibition : TypeOfExhibition.values()) {
            if (typeOfExhibition.price != 0) {
                stringBuilder.append(typeOfExhibition)
                        .append("price: ")
                        .append(typeOfExhibition.price)
                        .append(", ");
            } else {
                stringBuilder.append(typeOfExhibition);
            }
        }
        return stringBuilder.substring(0, stringBuilder.length() - 2);
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
