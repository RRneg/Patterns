package behavioral.Memento;

public class EditPhoto {
    public static void main(String[] args) {
        Photo photo = new Photo();
        Fleshka fleshka = new Fleshka();


        photo.setColorAndHigh("Green", 3);

        System.out.println(photo);

        fleshka.setSave(photo.save());

        photo.setColorAndHigh("Yellow", 2);

        System.out.println(photo);

        photo.load(fleshka.getSave());

        System.out.println(photo);

    }
}