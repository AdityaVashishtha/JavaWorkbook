public class AddArray {
    public static void addArray(int nums[]) {
        int sum=0;
        for (int x : nums) {
            sum += x;
        }
        System.out.println("Total Sum of array is : " +sum);
    }
    public static void main(String args[]) {
        int x[]={10,20,30,40,50};
        int y[]={1,2,3,4};
        int z[]={1,2,3,4,5};
        AddArray.addArray(x);
        AddArray.addArray(y);
        AddArray.addArray(z);
    }
}