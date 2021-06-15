package behavioral.Iterator;

public class Manufactory {
    public static void main(String[] args) {
        int[] setOfLables = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        PackingEquipment packingEquipment = new PackingEquipment(setOfLables);
        Iterator iterator = packingEquipment.getIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next().toString() +  " doy pack(s) made ");
        }

            System.out.println("The doy pack is over, put a new set of doy pack");

    }
}
