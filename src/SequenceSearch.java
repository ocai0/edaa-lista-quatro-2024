import java.util.ArrayList;

class SequenceSearch {
    public static int searchFor(int[] list, int searchItem) {
        int index = 0;
        for (int currentItem : list) {
            if (currentItem == searchItem)
                return index;
            index++;
        }
        return -1;
    }

    public static ArrayList<Integer> searchAll(int[] list, int searchItem) {
        int index = 0;
        ArrayList<Integer> indexesFounded = new ArrayList<Integer>();
        for (int currentItem : list) {
            if (currentItem == searchItem)
                indexesFounded.add(index);
            index++;
        }
        return indexesFounded;
    }

    public static ArrayList<Integer> greaterThan(Pessoa[] list, int searchAge) {
        int index = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (index <= list.length - 1) {
            if (list[index].getAge() > searchAge)
                result.add(index);
            index++;
        }
        return result;
    }
}