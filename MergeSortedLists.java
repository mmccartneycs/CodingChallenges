import java.util.LinkedList;
import java.util.NoSuchElementException;

public class MergeSortedLists {
    public static void main(String[] args) throws NoSuchElementException {
        LinkedList<Integer> listA = new LinkedList<>();
        listA.add(1);
        listA.add(4);
        listA.add(5);

        LinkedList<Integer> listB = new LinkedList<>();
        listB.add(1);
        listB.add(3);
        listB.add(4);

        LinkedList<Integer> listC = new LinkedList<>();
        listC.add(2);
        listC.add(6);

        LinkedList<Integer> combined = new LinkedList<>();

        while (listA.size() + listB.size() + listC.size() != 0) {
            if (!listA.isEmpty() && !listB.isEmpty() && listA.getFirst() <= listB.getFirst())  {
                if (listA.getFirst() <= listC.getFirst()) {
                    combined.add(listA.getFirst());
                    listA.removeFirst();
                }
                else {
                    combined.add(listC.getFirst());
                    listC.removeFirst();
                }
            }
            else if ( !listB.isEmpty() && !listC.isEmpty() && listB.getFirst() <= listC.getFirst()) {
                combined.add(listB.getFirst());
                listB.removeFirst();
            }
            else if(!listA.isEmpty() && !listC.isEmpty() && listA.getFirst() <= listC.getFirst()){
                combined.add(listA.getFirst());
                listA.removeFirst();
            }
            else if (!listC.isEmpty()) {
                combined.add(listC.getFirst());
                listC.removeFirst();
            }
            System.out.println(listA);
            System.out.println(listB);
            System.out.println(listC);
        }

        System.out.println(combined);
        }
    }

