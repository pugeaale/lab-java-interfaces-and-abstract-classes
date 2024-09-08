package intlistinterface;

/**
 * Main of the last part of the lab to test implementations
 * IntArrayList and IntVector with several cases
 */
public class IntListInterface {
    public static void main(String[] args) {
        IntArrayList intArrayList = new IntArrayList();
        System.out.println("creating new IntArrayList count : " + intArrayList.getCount());// expect : 0
        // after creating new array list we are adding 20 elements
        for(int i = 0 ; i < 20 ; i++) {
            intArrayList.add(100+i);
        }
        System.out.println("count : " + intArrayList.getCount());// expect: 20
        try {
            System.out.println(intArrayList.get(0));//expect: 100
            System.out.println(intArrayList.get(19));//expect: 119
            System.out.println("IntVector, count : " + intArrayList.getCount() + " - size total : " + intArrayList.getSize());
            System.out.println(intArrayList.get(20));// expect exception
        } catch (IllegalArgumentException illegalArgumentException) {
            System.err.println(illegalArgumentException.getMessage());
        }
        try {
            System.out.println(intArrayList.get(22));// expect exception
        } catch (IllegalArgumentException illegalArgumentException) {
            System.err.println(illegalArgumentException.getMessage());
        }
        IntVector intVectorList = new IntVector();
        System.out.println("Creating IntVector, count : " + intVectorList.getCount()); // expect : 0
        for(int i = 0 ; i < 60 ; i++) {
            intVectorList.add(100*i);
        }
        System.out.println("count : " + intVectorList.getCount());
        try {
            System.out.println(intVectorList.get(0));//expect 0
            System.out.println(intVectorList.get(59));//expect 5900
            System.out.println("IntVector, count : " + intVectorList.getCount() + " - size total : " + intVectorList.getSize());
            System.out.println(intVectorList.get(60));// expect exception
        } catch (IllegalArgumentException illegalArgumentException) {
            System.err.println(illegalArgumentException.getMessage());
        }
        try {
            System.out.println(intVectorList.get(80));// expect exception
        } catch (IllegalArgumentException illegalArgumentException) {
            System.err.println(illegalArgumentException.getMessage());
        }
    }
}