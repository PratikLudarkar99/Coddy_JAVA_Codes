class Fact {
    public static int fact(int num) {
        // Write code here
        if(num ==0){
            return 1;
        }
        int result =1;
        for(int i=1 ;i <=num; i++){
            result*=i;
        }
        return result;
    }
}
