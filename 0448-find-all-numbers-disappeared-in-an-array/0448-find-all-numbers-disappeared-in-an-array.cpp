class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
 vector<int>temp;
 int n=nums.size();
set<int>ans(nums.begin(),nums.end());
vector<int>t;
for(int i=1;i<=n;i++)
{
    t.push_back(i);
}
int i=0;
int j=0;
vector<int>s(ans.begin(),ans.end());
while(i<s.size()&&j<t.size())
{
    if(s[i]!=t[j])
    {
        temp.push_back(t[j]);
        j++;
    }
    else
    {
        i++;
        j++;
    }
}
while(j<t.size())
{
    temp.push_back(t[j]);
    j++;
}
    return temp;
    }
};