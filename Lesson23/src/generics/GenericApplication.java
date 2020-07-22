package generics;

public class GenericApplication<T>  {

    public static void main(String[] args) {
        TreeItem<String> item1 = new TreeItem<>("МИР");
        TreeItem<Integer> item2 = new TreeItem<>(100);
        TreeItem<Integer> item3 = new TreeItem<>(25);


        int summa = 0;
        while (item2 != null) {
            summa += item2.getValue();
            item2 = item2.getNext();

        }
        System.out.println(summa);
    }
}
