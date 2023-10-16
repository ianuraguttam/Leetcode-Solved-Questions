class Pair{
    String first;
    int second;
    Pair(String first,int second){
        this.first=first;
        this.second=second;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q=new ArrayDeque<>();
        q.add(new Pair(beginWord,1));
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            set.add(wordList.get(i));
        }
        set.remove(beginWord);
        while(!q.isEmpty()){
            String rem=q.peek().first;
            int steps=q.peek().second;
            q.remove();
            if(rem.equals(endWord))return steps;
            for(int i=0;i<rem.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char replacedcharArray[]=rem.toCharArray();
                    replacedcharArray[i]=ch;
                    String replacedword=new String(replacedcharArray);
                    if(set.contains(replacedword)){
                        set.remove(replacedword);
                        q.add(new Pair(replacedword,steps+1));
                    }
                }
            }

        }
        return 0;

    }
}