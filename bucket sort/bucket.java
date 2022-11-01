import java.util.*;  
public class bucket {  

static int[] bucketSort(int[] array, int maxValue)   
{  
 
int[] Bucket = new int[maxValue + 1];  
 
int[] sorted_array = new int[array.length];  
for (int i = 0; i < array.length; i++)  
Bucket[array[i]]++;  
int outPos = 0;  
for (int i = 0; i < Bucket.length; i++)  
for (int j = 0; j < Bucket[i]; j++)  
sorted_array[outPos++] = i;  
  
return sorted_array;  
}   
   
static void printArray(int[] sorted_array)   
{  
for (int i = 0; i < sorted_array.length; i++)  
System.out.print(sorted_array[i] + " ");  
}  

static int maxValue(int[] array)   
{  
int maxValue = 0;  
for (int i = 0; i < array.length; i++)  
if (array[i] > maxValue)  
maxValue = array[i];  
return maxValue;  
}  
  
public static void main(String args[])   
{  
System.out.println("Sorted array after performing bucket sort:");  
Random random = new Random();  

int N = 12;  
  
int[] array = new int[N];  
for (int i = 0; i < N; i++)  
  
array[i] = Math.abs(random.nextInt(40));  
 
int maxValue = maxValue(array);  
System.out.println("\nUn-sorted Array: ");  
 
printArray(array);  
System.out.println("\nSorted Array: ");  
  
printArray(bucketSort(array, maxValue));  
}  
}  