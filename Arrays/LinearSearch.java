
public class LinearSearch{

    public static int searchKey(int numbers[], int key){
        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] == key){
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 7, 8, 9, 10, 12, 23, 14};
        int key = 12;
        int index = searchKey(numbers, key);

        if(index == -1){
            System.out.println("Key not found");
        } else{
             System.out.println("The key is found on the index : " + index);
        }
        
    }
}