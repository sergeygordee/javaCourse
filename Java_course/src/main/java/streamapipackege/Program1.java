package streamapipackege;

public class Program1 {
    public static void main(String[] args) {
        int [] nums1 = {1,2,3,5,7,4,3,345,53,3};
        int count = 0;
        for (int i:nums1) {
            if (i % 2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
