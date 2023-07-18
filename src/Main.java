import java.util.Scanner;

class ModArray{
    public static int findModArray(int arr[],int p){
        int res=0,pow=1;
        for(int i=arr.length-1;i>=0;i--){
            res=(res+(arr[i]%p)*pow)%p;
            pow=(pow*10)%p;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter size of array:");
        int sze=scanner.nextInt();
        System.out.println("Enter array elements:");
        int arr[]=new int[sze];
        for(int i=0;i<sze;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("Enter divisor:");
        int p=scanner.nextInt();
        System.out.println(findModArray(arr,p));
        //findModArray(arr,p)
    }

        }