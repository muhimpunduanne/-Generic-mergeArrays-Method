//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Integer[] intArray1 = {5, 6, 7};
        Integer[] intArray2 = {8, 9, 10};

        Integer[] mergedIntArray = GenericArrayUtility.mergeArrays(intArray1, intArray2);

        System.out.println("Combined Integer Array:");
        for (Integer num : mergedIntArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        String[] strArray1 = {"Hello", "Anne"};
        String[] strArray2 = {"Java", "Generics"};

        String[] mergedStrArray = GenericArrayUtility.mergeArrays(strArray1, strArray2);

        System.out.println("Merged String Array:");
        for (String str : mergedStrArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
