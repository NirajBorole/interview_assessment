class solution {

	public static int solution(int[] arr) {
        int cnt = 0, z_cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                z_cnt++;
            } else if (arr[i] == 1) {
                cnt += z_cnt;
            }
        }
        return cnt >= 0 && cnt <= 1000000000 ? cnt : -1;
    }

	public static void main(String[] args) {

		int[] arr = { 0, 1, 0, 1, 1};
		System.out.println(solution(arr));
	}

	
}