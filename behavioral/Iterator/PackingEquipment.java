package behavioral.Iterator;

public class PackingEquipment implements Packaging {
    private int[] doyPack;

    public PackingEquipment(int[] doyPack) {
        this.doyPack = doyPack;
    }

    public int[] getDoyPack() {
        return doyPack;
    }

    public void setDoyPack(int[] doyPack) {
        this.doyPack = doyPack;
    }

    @Override
    public Iterator getIterator() {
        return new DoyPackIterator();
    }

    private class DoyPackIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < doyPack.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return doyPack[index++];
        }
    }
}
