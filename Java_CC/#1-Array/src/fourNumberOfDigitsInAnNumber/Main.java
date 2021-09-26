package fourNumberOfDigitsInAnNumber;

public class Main {
    public static void main(String[] args) {

        int nums[] = {1, 12, 123, 1234, 532, 556235, 342, 4};
        System.out.println(evenNumberOfDigits(nums));
        System.out.println(nums[2]);
        System.out.println(numberOfDigitsInNumber(1234567));
    }


    //Number of digits in a number stored in an array
    // Skip // No  idea
    public static int evenNumberOfDigits(int[] arr) {
        int []a = new int[arr.length];
        int ans = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[i];
            int count = 0;
            if (a[i] < 0) {
                a[i] = a[i] * -1;
            }
            while (a[i] > 0) {
                count++;
                a[i] = a[i] / 10;
            }
            if (count % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    //More effective way
    public static int numberOfDigitsInNumber(int num) {
        return (int) (Math.log10(num)) + 1;
    }

}
