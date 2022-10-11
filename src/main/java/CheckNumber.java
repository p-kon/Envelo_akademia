public class CheckNumber {

    public static void main(String[] args) {

        int[] nr = {9,8,7,6,5,4,3,2,1};
        boolean search = search(nr, 1);
        System.out.println(search);
    }


    private static boolean search(int[] numbers, int x) {
        int startIndex = 0;
        int endIndex = numbers.length-1;


        while (startIndex <= endIndex) {
            int mid = (startIndex+endIndex)/2;
            int guess = numbers[mid];
            if (x == guess)
                return true;
            else if (x < guess)
                startIndex = mid + 1;
            else
                endIndex = mid -1;
        }

        return false;
    }
}


