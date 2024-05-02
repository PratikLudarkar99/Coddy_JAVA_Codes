class IsSplitable {
    private static boolean isSplitableHelper(int[]a, int c1,int c2,int index){
        if(index ==a.length){
            return c1==c2;
        }
        return isSplitableHelper(a,c1+a[index],c2,index+1)||
            isSplitableHelper(a,c1,c2+a[index],index+1);
    }
    public static boolean isSplitable(int[] a) {
        return isSplitableHelper(a,0,0,0);
    }
}
