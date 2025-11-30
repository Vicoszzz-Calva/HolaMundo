import java.util.Scanner;
public class ordenar
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        menu();
        proceso();
        trutru();
    }

    public static void menu()
    {
        System.out.println("Bienvenido al ordenador de números");
    }

    public static void proceso()
    {
        int [] arr = {7,7,7,7,7,7,7};

        System.out.print("Los números desordenados son: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ", ");
        }

        System.out.print("\nLos números ordenados son : ");

        int save;
        for(int i = 0; i < arr.length - 1; i++ ) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    save = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = save;
                }
            }
        }

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + ", ");
        }
    }

    public static void trutru()
    {
        System.out.println("\ntrutru");
    }
}