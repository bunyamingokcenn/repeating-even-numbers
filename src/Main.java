import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3,7, 6,3, 4, 3,2,9,10,21,1, 4, 33,9, 6, 1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for(int i = 0; i < list.length; i++ ){
            if (list[i] % 2 == 0) { // sadece çift sayıları kontrol et
                for (int j = 0; j < list.length; j++){
                    if((i != j) && (list[i] == list[j])){
                        if(!isFind(duplicate, list[i])){
                            duplicate[startIndex++] = list[i];
                        }
                        break;
                    }
                }
            }
        }

        System.out.println("Tekrar eden çift sayılar:");
        for(int value : duplicate){
            if(value != 0){
                System.out.println(value);
            }
        }
    }
}
