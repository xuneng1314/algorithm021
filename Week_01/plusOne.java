import java.util.Arrays;

public class plusOne {
    public static void main(String[] args) {
        int[] heigth = new int[]{1,8,6,2,5,4,8,3,7};
        plusOne(heigth);
        System.out.println(Arrays.toString(heigth));
    }
    public static int[] plusOne(int[] digits) {
        if(digits.length == 0){
            return digits;
        }
        for (int i = digits.length - 1; i >=0 ; i--) {
            if(digits[i]==9){
                digits[i] = 0;
            }else{
                digits[i]+=1;
                return digits;
            }
        }
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
}
