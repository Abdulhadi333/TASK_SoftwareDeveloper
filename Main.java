import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[] arr ={2, 3, 1,5};

        //A1-1
        System.out.println("A1-1");
        System.out.println(adds(arr));

        //A1-2
        System.out.println("A2-2");
        printDistinct(arr,arr.length);

        //A1-3
        System.out.println(" ");
        System.out.println("A3-3");
        System.out.println(solution(arr));
    }

    //Q1-1
    public static int adds(int nums[]){
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            counter = counter+nums[i];
        }

        return counter;
    }

    //Q1-2
   public static void printDistinct(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
        {
            
            int j;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            
            if (i == j)
                System.out.print( arr[i] + " ");
        }
    }
    //Q1-3
    public static int solution(int[] A) {
        int counter = 0;

        for (int i = 0; i < A.length; i++) {
            counter = counter+A[i];
        }
            for (int i = 0; i < A.length; i++)
            {
                if (A[i] == 0)
                {
                    continue;
                }

                int n = A[i] - 1;
                while (n != -1 && n < A.length)
                {
                    int next = A[n] - 1;
                    A[n] = 0;
                    n = next;
                }
            }

            for (int i = 0; i < A.length; i++)
            {
                if (A[i] != 0)
                {
                    return i + 1;
                }
            }

            return A.length + 1;
        }
    }