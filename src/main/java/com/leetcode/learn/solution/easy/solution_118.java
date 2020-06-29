package com.leetcode.learn.solution.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class solution_118 {
    public static void main(String[] args) {
        generate(5);
    }

    /**
     * 这叫动态规划不叫暴力法？？？
     * @param numRows
     * @return
     */
    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList();
        for(int i = 1;i <= numRows;i++ ){
            List<Integer> item = new ArrayList();
            for(int j = 1;j <= i;j++){
                //在左右两边，为1
                if(j == 1 || j == i){
                    item.add(1);
                }else{
                    item.add(result.get(i - 1 - 1).get(j - 1 - 1) + result.get(i - 1 - 1).get(j - 1));
                }
            }
            result.add(item);
        }
        return result;
    }
}
