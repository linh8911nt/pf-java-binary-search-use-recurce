public class BinarySearchRecurse {
    static int[] list = {2, 4, 7, 23, 45, 56, 73, 83, 86, 90, 93, 96, 98};

    static int binarySearchRecurse(int[] list, int key, int low, int hight){
        if (hight >= low) {
            int mid = (low + hight) / 2;
            if (key == list[mid]){
                return mid;
            }
            if (key > list[mid]){
                return binarySearchRecurse(list, key, mid + 1, hight);
            }
            if (key < list[mid]){
                return binarySearchRecurse(list, key, low, mid - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int low = 0;
        int hight = list.length - 1;
        System.out.println("index is: " + binarySearchRecurse(list, 7, low, hight));
        System.out.println("index is: " + binarySearchRecurse(list, 100, low, hight));
    }
}
