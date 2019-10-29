
package integersarray;

public class IntegersArray {

    public static void main(String[] args) {
//       int[] intList=new int[5];
//       intList[0]=5;
//       intList[1]=8;
//       intList[2]=10;
//       intList[3]=4;
//       intList[4]=1;

        int array[] = new int[]{5, 8, 10, 4, 1};

        float sum = 0f;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("The sum of the values is: " + sum);

        float avrg = 0.f;
        avrg = sum/array.length;
        
        System.out.println("The average of the numbers is: " + avrg);

        
        int min = getMin(array);
        System.out.println("Minimum Value is: " + min);

        int max = getMax(array);
        System.out.println("Maximum value is: " + max);

        

    }
    
    public static int getMin(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
    
    public static int getMax(int[] array){
        int maxValue=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]>maxValue){
            maxValue=array[i];
            }
        }
        return maxValue;
    }
    
}
    

