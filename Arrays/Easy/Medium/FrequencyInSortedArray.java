package Arrays.Easy.Medium;

public class FrequencyInSortedArray {
    static void printFrequency(int [] arr,int n){
        int freq=1;
        int i=1;
        while(i<n){
            while(i < n && arr[i] == arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + " " + freq);
            i++;
            freq=1;
        }
        if(n==1 || arr[n-1]!=arr[n-2]){
            System.out.println(arr[n - 1] + " " + 1);

        }

    }
public static void main(String[] args) {

    int [] arr={1,1,1,5,5,10,10,10,11};
    printFrequency(arr,9 );
    
}
}
