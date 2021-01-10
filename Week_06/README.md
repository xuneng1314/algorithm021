第六周学习总结
本周是比较难的动态规划，动态规划的要点主要为三个
1、化繁为简，寻找子问题
2、定义dp数组
3、dp方程
动态规划归根节点也是属于分治的一种特殊状态，通过一定的公式推导出最优解，在推导的过程中淘汰次优解，相比较于贪心算法，动态规划推导出的结果一定是最优解，而贪心算法则不一定，贪心算法值看眼前的最优解，而忽略全局最优解，动态规划则考虑的是全局最优解。
举例说明：解码方法这题目
当首字母为0说明无解
dp[0] = 1  dp[1] = 1
情况如下
1、当第一个数为0时，结果就为0，因为0无法解码，只能和10、20组合才能解码
2、当长度为1时，结果为1，因为肯定可以解码，并且排除了0的情况
3、当字符串长度大于2时，需要额外讨论结果
	1、当前字符为0并且上一个字符为0或者上一个字符不为1或者2时，无法组合成10,20这种可以解码的情况，说明不能解码，直接返回0
	2、当前字符为0，那么当前字符只能与前一个字符组合dp[i] = dp[i-2]
	3、当前字符不为0，但是上一个字符0，这种情况只能单独解dp[i]=dp[i-1]
	4、其他情况，当前字符与上一个字符和大于26时说明没办法解码，dp[i]=dp[i-2],如果小于26说明可以解码，dp[i]=dp[i-1]+dp[i-2]

通过上面的分析可以得到对应的动态转移方程
	
		num0 = (arr[i]-'0')
		num1 = (arr[i-1]-'0')
		num = 10 * num1 + num0
	-- 00 30 40 ...这两种情况 
	if((num0 == 0 && num1==0) || (num0 == 0 &&num1 > 2)) return 0
	else if(num0 == 0) dp[i] = dp[i-2]
	else if(num1 == 0) dp[i] = dp[i-1]
	else if(num >26) dp[i] = dp[i-2]
	else dp[i] = dp[i-1] + dp[i-2]

翻译成代码如下
public int numDecodings(String s) {
        int len = s.length();
        if(len == 0) return 0;
        char[] c = s.toCharArray();
        if(c[0] == '0')return 0;
        if(len == 1) return 1;
        int[] dp = new int[len+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= len; i++) {
            int num0 = (c[i-1]-'0');
            int num1 = (c[i-2]-'0');
            int num = 10 * num1 + num0;
            if((num0 == 0 && num1==0) || (num0 == 0 &&num1 > 2)) return 0;
            else if(num0 == 0) dp[i] = dp[i-2];
            else if(num1 == 0) dp[i] = dp[i-1];
            else if(num >26) dp[i] = dp[i-1];
            else dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[len];
    }



