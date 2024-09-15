package singlenumber;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        int num = 0;
        for(int value : nums) {

            num ^= value;
        }
        return num;
    }
}
