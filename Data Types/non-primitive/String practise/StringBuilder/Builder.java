public class Builder {
    public static void main(String[] args){

        //classes used to perfoorm operations on string
        StringBuilder sb = new StringBuilder(" Hello");
        sb.append(" everyone");
        //string buffer is not thread safe
        sb.deleteCharAt(2);
        //stored on heap memory
        sb.insert(0, "java");
        //it is mutable
        sb.setLength(30);
        //Non-synchonized
        sb.ensureCapacity(100);
        //more efficient(faster than string and string buffer)
        System.out.println(sb);

        long startTime = System.currentTimeMillis();
        StringBuilder sbd = new StringBuilder("Hello");

        for(int i = 0; i < 100000; i++){
            sbd.append(" world!!");
        }

        System.out.println("Time taken by StringBuilder:" + (System.currentTimeMillis()-startTime));

}
}