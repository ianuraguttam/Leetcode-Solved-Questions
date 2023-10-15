class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
		if (triangle.size() == 0)
			return 0;
		if (triangle.size() == 1)
			return triangle.get(0).get(0);

		int[] dp = new int[triangle.size()];
		dp[0] = triangle.get(0).get(0);
		return minimumTotal(triangle, dp, 1);
	}

	public int minimumTotal(List<List<Integer>> triangle, int[] dp, int lvlidx) {
		List<Integer> list = triangle.get(lvlidx);
		int pre = dp[0], temp;
		dp[0] += list.get(0);
		for (int i = 1; i < lvlidx; i++) {
			temp = dp[i];
			dp[i] = list.get(i) + Math.min(pre, dp[i]);
			pre = temp;
		}
		dp[lvlidx] = pre + list.get(lvlidx);

		if (lvlidx + 1 == triangle.size()) {
			int res = dp[0];
			for (int i = 1; i <= lvlidx; i++)
				res = Math.min(res, dp[i]);
			return res;
		}

		return minimumTotal(triangle, dp, lvlidx + 1);
	}
}