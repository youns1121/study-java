package java8.javastudy.memory;



import java.util.Map;
import java.util.Random;

// Out Of Memory Error : GC Overhead Limit Exceeded

public class OomeGC {
    public static void main(String[] args) throws Exception {
        Map map = System.getProperties();
        Random random = new Random();

        while (true){
            map.put(random.nextInt(), "value");
        }
    }
}
