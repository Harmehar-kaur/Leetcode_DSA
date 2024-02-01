package Leetcode;
// /**
// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false
// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true
 

// Constraints:

// 1 <= nums.length <= 105
// -109 <= nums[i] <= 109

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
        
//     }
// }
// **/

// import java.util.HashSet;

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//       //HashSet<data_type> name = new HashSet (capacity, load factor)
//       //capacity = number of elements stored 
//       //load factor: Suppose a load factor is set to 0.70, the elements of the HashSet will be moved to another hash table that is double the size of the original once it is filled by 70%.accepts a value between 0.00 to 1.00
//         HashSet<Integer> set = new HashSet<>();
        
//         for (int num : nums) {
//           //add is a boolean method that adds an ele only if it is not already present 
//             if (!set.add(num)) {
//                 return true; // Duplicate found
//             }
//         }
        
//         return false; // No duplicates found
//     }
// }


// /**
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

// An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"
// Output: true
// Example 2:

// Input: s = "rat", t = "car"
// Output: false
 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.
 

// Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

// class Solution {
//     public boolean isAnagram(String s, String t) {
        
//     }
// }
// **/

// import java.util.HashMap;
// import java.util.Map;

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         //if the length is not same the words are anagram 
//         if (s.length() != t.length()) {
//             return false;
//         }

//         Map<Character, Integer> frequencyMap = new HashMap<>();

//         // Increment frequency for characters in string s
//         for (char ch : s.toCharArray()) {
//             frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
//         }

//         // Decrement frequency for characters in string t
//         for (char ch : t.toCharArray()) {
//             frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) - 1);

//             // If the frequency becomes zero, remove the entry
//             if (frequencyMap.get(ch) == 0) {
//                 frequencyMap.remove(ch);
//             }
//         }

//         // If the map is empty, it means both strings have the same character frequencies
//         return frequencyMap.isEmpty();
//     }
// }
