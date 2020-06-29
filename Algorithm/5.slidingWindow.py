Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring

def lengthOfLongestSubstring(self, s: str) -> int:
        inWindow = {}
        start, res = 0,0
        for i, ch in enumerate(s):
            if ch not in inWindow:
                inWindow[ch] = i
                if i-start+1>res:
                    res = i-start+1
            else:
                for j in range(start, inWindow[ch]):
                    del inWindow[s[j]]
                start = inWindow[ch]+1
                inWindow[ch] = i
                
        return res
