class Solution {
public:
    int maxProfit(int k, vector<int>& prices) {
        int state[k][2];
        
        for (int i = 0; i < k; i++) {
            state[i][0] = -1e5;
            state[i][1] = 0;
        }

        for (int i = 0; i < prices.size(); i++) {
            state[0][0] = max(state[0][0], -prices[i]);
            state[0][1] = max(state[0][1], state[0][0] + prices[i]);
            
            for (int j = 1; j < k; j++) {
                state[j][0] = max(state[j][0], state[j - 1][1] - prices[i]);
                state[j][1] = max(state[j][1], state[j][0] + prices[i]);
            }
        }

        return state[k - 1][1];
    }
};