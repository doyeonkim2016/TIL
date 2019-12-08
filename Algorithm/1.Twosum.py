#Given an array of integers, return indices of the two numbers such that they add up to a #specific target.
#You may assume that each input would have exactly one solution, and you may not use the same #element twice.

class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        dic = {}
        for i, n in enumerate(nums): 
            if n in dic:
                return [dic[n], i]
            dic[target-n] = i
            
#For this question, enumerate function is used
#Create new dictionary (Hash table)
#First get the index and the value from the nums list.
#if the value is not in the dictionary,set the index value as dict value for target -n
#if n is in dic, return it as a second index in the list.


            
        
