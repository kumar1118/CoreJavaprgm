package Array;
class  MergeSort
{
	private static int[] array;
	private static int[] tempMergArr;
	private static int length;
	public static void main(String a[]) 
	{
		int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
		sort(inputArr);
		for(int i : inputArr)
		{
		System.out.print(i + " ");
		}
	}
	public static void sort(int inputArr[])
	{
		array = inputArr;
		length = inputArr.length;
		tempMergArr = new int[length];
		doMergeSort(0, length - 1);
	}
	private static void doMergeSort(int lowerIndex, int higherIndex)
	{
		if(lowerIndex < higherIndex)
		{
			int middle = lowerIndex + 
				(higherIndex - lowerIndex) / 2;
			//Bellow step sorts the left side of the array
			doMergeSort(lowerIndex, middle);//1
			//below step sorts the rightside of the array
			doMergeSort(middle + 1, higherIndex);//2
			//now merge both sides
			mergeparts(lowerIndex, middle,higherIndex);//3

		}
}
private static void mergeparts(int lowerIndex,
	             int middle, int higherIndex)
	{
	for(int i = lowerIndex;
	            i <= higherIndex; i++)
		{
					tempMergArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while(i <= middle && j <= higherIndex)
		{
			if(tempMergArr[i] <= tempMergArr[j])
			{
				array[k] = tempMergArr[i];
					i++;
			}
			else
			{
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
        }
		while(i <= middle)
		{
			array[k] = tempMergArr[i];
			k++;
			i++;
		}
	}
}
