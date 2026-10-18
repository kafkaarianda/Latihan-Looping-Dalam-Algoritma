public class FindPairsTargetSum {
    public static void main(String[] args) {
        int[] data = {2, 4, 3, 5, 7, 8, 9};
        int target = 10;
        
        System.out.println("Pasangan dengan jumlah " + target + ":");
        
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) { 
                if (data[i] + data[j] == target) {
                    System.out.println("(" + data[i] + ", " + data[j] + ")");
                }
            }
        }
    }
}