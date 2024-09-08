package intlistinterface;

public class IntListInterface {
    public static void main(String[] args) {
        IntArrayList intArrayList = new IntArrayList();
        System.out.println("init : " + intArrayList.getCount());// expect : 0
        //System.out.println(intArrayList.get(0));
        for(int i = 0 ; i < 20 ; i++) {
            intArrayList.add(100+i);
        }
        System.out.println("count : " + intArrayList.getCount());
        try {
            System.out.println(intArrayList.get(0));
            System.out.println(intArrayList.get(19));
            System.out.println(intArrayList.get(20));
        } catch (IllegalArgumentException illegalArgumentException) {
            System.err.println(illegalArgumentException.getMessage());
        }
        try {
            System.out.println(intArrayList.get(22));
        } catch (IllegalArgumentException illegalArgumentException) {
            System.err.println(illegalArgumentException.getMessage());
        }
        IntVector intVectorList = new IntVector();
        System.out.println("init vector : " + intVectorList.getCount()); // expect : 0
        for(int i = 0 ; i < 60 ; i++) {
            intVectorList.add(100*i);
        }
        System.out.println("count : " + intVectorList.getCount());
        try {
            System.out.println(intVectorList.get(0));
            System.out.println(intVectorList.get(59));
            System.out.println(intVectorList.get(60));
        } catch (IllegalArgumentException illegalArgumentException) {
            System.err.println(illegalArgumentException.getMessage());
        }
        try {
            System.out.println(intVectorList.get(80));
        } catch (IllegalArgumentException illegalArgumentException) {
            System.err.println(illegalArgumentException.getMessage());
        }
    }
}