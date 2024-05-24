import java.util.Arrays;

public class Copy_per {
    public static void main(String[] args) {
            Character[] arr = {'q','w','e','r','t'};
            Character[] reversed = reverse(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reversed));
    }

    static Character[] reverse(Character[] source){
        var reversed = new Character[source.length];
        for (int i = 0; i<reversed.length;i++)
        {
            reversed[i] = source[source.length-1-i];

        }
        return reversed;
    }
}
