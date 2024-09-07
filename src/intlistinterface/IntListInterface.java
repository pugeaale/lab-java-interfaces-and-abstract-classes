package intlistinterface;

public class IntListInterface {
    public static void main(String[] args) {
        IntArrayList intArrayList = new IntArrayList();
        System.out.println("init : " + intArrayList.getCount());
        for(int i = 0 ; i < 6 ; i++) {
            intArrayList.add(100*i);
            System.out.println("count : " + intArrayList.getCount());
        }
        for(int i = 0 ; i <  6 ; i++) {
            System.out.println(intArrayList.get(i));
        }

    }
}