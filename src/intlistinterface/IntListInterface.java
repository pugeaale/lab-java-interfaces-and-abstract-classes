package intlistinterface;

public class IntListInterface {
    public static void main(String[] args) {
        IntArrayList intArrayList = new IntArrayList();
        System.out.println("init : " + intArrayList.getCount());
        for(int i = 0 ; i < 20 ; i++) {
            intArrayList.add(100*i);
            System.out.println("count : " + intArrayList.getCount());
        }
        for(int i = 0 ; i <  20 ; i++) {
            System.out.println(intArrayList.get(i));
        }
        IntVector intVectorList = new IntVector();
        System.out.println("init vector : " + intVectorList.getCount());
        for(int i = 0 ; i < 22 ; i++) {
            intVectorList.add(100*i);
            System.out.println("count : " + intVectorList.getCount());
        }
    }
}