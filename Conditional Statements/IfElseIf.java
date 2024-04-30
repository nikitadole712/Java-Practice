class IfElseIf{
    public static void main(String args[]){
        int x = 9;
        int y = 4;
        int z = 6;

        if(x > y && x > z){         //if cndition
            System.out.println(x);
        }
        else if(y > x && y > z){     //if condition false it execute else if block
            System.out.println(y);
        }
        else{                        //if both conditions are false it execute else block
            System.out.println(y);
        }
    }
}