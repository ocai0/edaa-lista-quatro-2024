class BinarySearch {
    public static int searchFor(Pessoa[] list, int searchAge, int startIndex, int endIndex) {
        int middleIndex = (int) Math.floor((startIndex + endIndex) / 2);
        if (list[middleIndex].getAge() == searchAge)
            return middleIndex;
        if ((endIndex - startIndex) == 0)
            return -1;
        if (list[middleIndex].getAge() < searchAge)
            return BinarySearch.searchFor(list, searchAge, middleIndex + 1, endIndex);
        if (list[middleIndex].getAge() > searchAge)
            return BinarySearch.searchFor(list, searchAge, startIndex, middleIndex - 1);
        return -1;
    }

    public static int searchFor(int[] list, int searchAge, int startIndex, int endIndex) {
        int middleIndex = (int) Math.floor((startIndex + endIndex) / 2);
        if (list[middleIndex] == searchAge)
            return middleIndex;
        if ((endIndex - startIndex) == 0)
            return -1;
        if (list[middleIndex] < searchAge)
            return BinarySearch.searchFor(list, searchAge, middleIndex + 1, endIndex);
        if (list[middleIndex] > searchAge)
            return BinarySearch.searchFor(list, searchAge, startIndex, middleIndex - 1);
        return -1;
    }
}