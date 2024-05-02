class MinFind {
    private static int minFindHelper(int num, int k) {
        if (k == 0) {
            return num;
        }

        String s = Integer.toString(num);
        int m = num;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                char[] t = s.toCharArray();
                char temp = t[i];
                t[i] = t[j];
                t[j] = temp;
                m = Math.min(m, minFindHelper(Integer.parseInt(new String(t)), k - 1));
            }
        }

        return m;
    }

    public static int minFind(int num, int k) {
        return minFindHelper(num, k);
    }
}
