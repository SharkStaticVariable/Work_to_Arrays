public class FindMax {
    public static void main(String[] args) {
        var array = new int[] {2,3,4,5,98,34};

        System.out.println(max(array)+" 98");
        System.out.println(max(new int[0])+" null");
        System.out.println(max(new int[]{88})+" 88");
        System.out.println(max(null)+" 88");

    }
    private static Integer max(int[] arr){
        if (arr == null || arr.length==0){
            return null;
        }
        int max =arr[0];
        for (int i = 1; i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
