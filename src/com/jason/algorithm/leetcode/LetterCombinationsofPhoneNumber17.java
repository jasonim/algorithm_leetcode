package com.jason.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsson on 20/3/1.
 * 17. Letter Combinations of a Phone Number
 Medium

 3188

 366

 Add to List

 Share
 Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.
 A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

 Example:
 Input: "23"
 Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 Note:
 Although the above answer is in lexicographical order, your answer could be in any order you want.
 Accepted
 529,448
 Submissions
 1,179,925


 Seen this question in a real interview before?
 */
public class LetterCombinationsofPhoneNumber17 {
    private ArrayList<String> res = new ArrayList<>();
    private String[] str = {
            "",
            "",
            "adc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        int index = 0;
        findCom(digits, index, "");
        return res;
    }

    private void findCom(String digits, int index, String s) {
        if (digits.length() == index) {
            res.add(s);
        }

        String letter = str[digits.charAt(index) - '0'];

        for (int i = 0; i < letter.length(); i++) {
            findCom(digits, index + 1, s + letter.charAt(i));
        }

    }
}
