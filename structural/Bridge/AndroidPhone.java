package structural.Bridge;

public class AndroidPhone {
    public static void main(String[] args) {

        Phone[] phone = {new Kiyv(new GoogleMaps()), new Dnipro(new MapsMe())};
        for (Phone ph: phone) {
            ph.navigate();

        }



    }
}
