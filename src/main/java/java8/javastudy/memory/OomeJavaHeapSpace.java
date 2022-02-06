package java8.javastudy.memory;

// Out Of Memory Error : Java Heap Space
public class OomeJavaHeapSpace {

    public static void main(String[] args){

        int[] i = new int[100000 * 100000];
    }
}
