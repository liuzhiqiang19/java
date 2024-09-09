import java.util.List;

import org.junit.Test;

public class Solution139 {
    
    @Test
    public void test(){
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] a={true};
        wordBreak(s,0,0, wordDict,a);
        return a[0];
    }
    public void wordBreak(String s,int sStart,int wi, List<String> wordDict,boolean[] a) {
        if(wi>=wordDict.size()) a[0]=false;
        for ( wi = 0; wi < wordDict.size(); wi++) {     //匹配得上，也需要能回退，搜索其他可能的匹配
            int l= sStart+wordDict.get(wi).length();
            if(wordDict.get(wi).equals(s.substring(sStart, sStart+l)))  wordBreak(s,sStart+l,wi,wordDict,a); //某个单词匹配得上，继续
            else wordBreak(s,sStart,wi+1,wordDict,a);       //匹配不上，试试下一个单词
        }
    }
/*  单词拆分
给你一个字符串 s 和一个字符串列表 wordDict 作为字典。如果可以利用字典中出现的一个或多个单词拼接出 s 则返回 true。
注意：不要求字典中出现的单词全部都使用，并且字典中的单词可以重复使用。
s 和 wordDict[i] 仅由小写英文字母组成.wordDict 中的所有字符串 互不相同.

输入: s = "leetcode", wordDict = ["leet", "code"]
输出: true
解释: 返回 true 因为 "leetcode" 可以由 "leet" 和 "code" 拼接成。

输入: s = "applepenapple", wordDict = ["apple", "pen"]
输出: true
解释: 返回 true 因为 "applepenapple" 可以由 "apple" "pen" "apple" 拼接成。
     注意，你可以重复使用字典中的单词。

输入: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
输出: false 
*/
}
