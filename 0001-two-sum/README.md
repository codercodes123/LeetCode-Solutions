<h2><a href="https://leetcode.com/problems/two-sum">1. Two Sum</a></h2><h3>Easy</h3><hr><p>Given an array of integers <code>nums</code>&nbsp;and an integer <code>target</code>, return <em>indices of the two numbers such that they add up to <code>target</code></em>.</p>

<p>You may assume that each input would have <strong><em>exactly</em> one solution</strong>, and you may not use the <em>same</em> element twice.</p>

<p>You can return the answer in any order.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,7,11,15], target = 9
<strong>Output:</strong> [0,1]
<strong>Explanation:</strong> Because nums[0] + nums[1] == 9, we return [0, 1].
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,2,4], target = 6
<strong>Output:</strong> [1,2]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> nums = [3,3], target = 6
<strong>Output:</strong> [0,1]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= nums.length &lt;= 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= target &lt;= 10<sup>9</sup></code></li>
	<li><strong>Only one valid answer exists.</strong></li>
</ul>

<p>&nbsp;</p>
<strong>Follow-up:&nbsp;</strong>Can you come up with an algorithm that is less than <code>O(n<sup>2</sup>)</code><font face="monospace">&nbsp;</font>time complexity?

1) Brute Force (Nested Loops)
   Try every possible pair (i, j) using two loops (i < j).
   Check if nums[i] + nums[j] == target.
   Return [i, j] if found.


       	time: O(n²) — checks all pairs.
        Space: O(1) — uses no extra memory.


Usage: Great for learning and tiny arrays. In practice, too slow for large inputs. 

2)Two-Pointer (Sorted Arrays)
First, sort the array (keeping original indices separately).
Use two pointers: left at start, right at end.
If sum > target, move right--; if sum < target, move left++.
When sum == target, you have the solution.

     	time: O(n log n) for sorting + O(n) for pointers.
    	Space: O(n) for tracking original indices.

Requires sorted input.

3)Optimized HashMap – One-Pass (Final & Recommended)
    Create a HashMap<Integer, Integer> mapping value → index.
    For each nums[i], compute complement = target - nums[i].
    If complement exists in the map, return [map.get(complement), i].
    Otherwise, add (nums[i], i) to the map.
	   
	    time: O(n) — single pass through nums.
		Space: O(n) — for the hash map.

Why it works: As you scan, you're storing seen values and instantly checking for the needed complement.
