class IsTripletExists {
    private static boolean isTripletExistsHelper(int[] arr, int k, int c, int start) {
        if (c == 0 && k == 0) {
            return true;
        }
        if (start >= arr.length) {
            return false;
        }
        // Correctly use start + 1 to avoid revisiting the same element
        return isTripletExistsHelper(arr, k - arr[start], c - 1, start + 1) ||
               isTripletExistsHelper(arr, k, c, start + 1);
    }

    public static boolean isTripletExists(int[] arr, int k) {
        return isTripletExistsHelper(arr, k, 3, 0);
    }
}
