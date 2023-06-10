package com.DP;

import java.util.ArrayList;
import java.util.List;

public class LCS {
	public static void main(String[] args)
    {
        String str1 = "AGGTAB";
        String str2 = "GXTXAYB";
        String lcs = longestCommonSubsequence(str1, str2);
        System.out.println("Length of LCS is "
                           + lcs.length());
    }
 
    public static String
    longestCommonSubsequence(String str1, String str2)
    {
        List<String> subsequences1
            = generateSubsequences(str1);
        List<String> subsequences2
            = generateSubsequences(str2);
 
        String lcs = "";
        for (String subsequence1 : subsequences1) {
            for (String subsequence2 : subsequences2) {
                if (subsequence1.equals(subsequence2)
                    && subsequence1.length()
                           > lcs.length()) {
                    lcs = subsequence1;
                }
            }
        }
        return lcs;
    }
 
    public static List<String>
    generateSubsequences(String str)
    {
        List<String> subsequences = new ArrayList<>();
        generateSubsequencesHelper(str, "", 0,
                                   subsequences);
        return subsequences;
    }
 
    public static void generateSubsequencesHelper(
        String str, String subsequence, int index,
        List<String> subsequences)
    {
        if (index == str.length()) {
            subsequences.add(subsequence);
            return;
        }
        generateSubsequencesHelper(str, subsequence,
                                   index + 1, subsequences);
        generateSubsequencesHelper(
            str, subsequence + str.charAt(index), index + 1,
            subsequences);
    }
}
