/**
 * 
 */
package com.learn.dsalgorithms.stringsquestions;

import java.util.HashMap;
import java.util.Map;

/**
 * @author prajosh
 *
 */
public class PalindromeIndexOPTS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String s = "aaab";
		System.out.println(findPalindromeIndex(s));
	}

	private static int findPalindromeIndex(String s) {

		char[] strArr = s.toCharArray();
		int start = 0;
		int length = strArr.length - 1;

		if (length == 0) {
			return -1;
		} else if (length == 1) {
			if (strArr[start] != strArr[length]) {
				return 0;
			} else {
				return -1;
			}
		}

		Map<String, Integer> indexMap = getNonMatchIndex(strArr, start, length);

		if (indexMap.size() > 0) {
			int firstMisIndx = indexMap.get("first");
			int lastMisIndx = indexMap.get("last");
			indexMap = getNonMatchIndex(strArr, firstMisIndx + 1, lastMisIndx);

			if (indexMap.size() > 0) {
				indexMap = getNonMatchIndex(strArr, firstMisIndx, lastMisIndx - 1);
				if (indexMap.size() > 0) {
					return -1;
				} else {
					return lastMisIndx;
				}
			} else {
				return firstMisIndx;
			}

		} else {
			return -1;
		}
	}

	private static Map<String, Integer> getNonMatchIndex(char[] strArr, int start, int length) {

		Map<String, Integer> indexMap = new HashMap<>(2);

		while (start < length) {

			if (strArr[start] != strArr[length]) {
				indexMap.put("first", start);
				indexMap.put("last", length);
				break;
			} else {
				start++;
				length--;
			}
		}
		return indexMap;
	}

}
