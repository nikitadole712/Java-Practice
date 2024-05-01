public class Buffer {
    public static void main(String[] args){

        //classes used to perfoorm operations on string
        StringBuffer sb = new StringBuffer(" Hello");
        sb.append(" everyone");
        //string buffer is thread safe
        sb.deleteCharAt(2);
        //stored on heap memory
        sb.insert(0, "java");
        //it is mutable
        sb.setLength(30);
        //synchonized
        sb.ensureCapacity(100);
        //Efficient
        System.out.println(sb);

        long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Hello");

        for(int i = 0; i < 100000; i++){
            sbf.append(" world!!");
        }

        System.out.println("Time taken by StringBuffer:" + (System.currentTimeMillis()-startTime));

        
    }
}
