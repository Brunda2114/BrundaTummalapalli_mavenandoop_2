package gittasks.MavenAndOop;
import java.util.Scanner;
interface Task {
	void operation();
}
class ArraySort implements Task
{
    private Scanner scan;
	public void operation()
    {
        int i,j;
        int t;
		scan = new Scanner(System.in);
		System.out.println("Enter sie of array:");
	    int l = scan.nextInt();
	    System.out.println("Enter Array:");
	    int arr[] = new int[l];
	    for(i=0;i<l;i++)
	    {
	        arr[i] = scan.nextInt();
	    }
	    /*Sorting the input array*/
	    for (i=0;i<l;i++)
        {
            for (j=0;j<l;j++) {
                if (arr[i]>arr[j])
                {
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        /*Printing the sorted array*/
        for(i=0;i<l;i++)
    	    System.out.println(arr[i]);
        /*Finding the maximum element from array*/
        int maximum=arr[0];
        for(i=0;i<l;i++)
            if(arr[i]>maximum)
                maximum=arr[i];
        System.out.println("Maximum:"+" "+maximum);
    }
    void year()
    {
    	System.out.println("NEW YEAR");
    }

}
class overriding extends ArraySort
{
	void year()
	{
		System.out.println("HAPPY NEW YEAR");
	}
}
class App{
    public static void main (String[] args) {
        ArraySort s=new ArraySort();
        s.operation();
        overriding r=new overriding();
        r.year();
    }
}