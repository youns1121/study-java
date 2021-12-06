package java8.javastudy.javalang;

public class StringEx1 {
    public static void main(String[] args) {

        String retVal = null;

        if("123".equals(retVal)){
            System.out.println("======");
        }else{
            System.out.println("===1111===");
        }

        if(retVal != null && retVal.equals("123")){
            System.out.println("======");
        }else{
            System.out.println("===1111===");
        }

        try {
            if (retVal.equals("123")) {
                System.out.println("======");
            } else {
                System.out.println("===1111===");
            }
        }catch (NullPointerException npe){
            npe.printStackTrace();
        }

    }
}
