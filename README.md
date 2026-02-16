# 💻 5 Common Java Programming Test Examples

This repository contains examples of programming test problems implemented using Java.  
These exercises focus on logical thinking, problem-solving skills, and basic algorithm techniques.

---

## 1. Birthday Cake Candles

### 📌 Problem Description

Given an array of integers representing candle heights, determine:

- The highest candle height
- How many candles have that highest height

This problem evaluates:
- Array traversal
- Finding maximum values
- Counting occurrences

---

### 📥 Input : 
{3, 2, 5, 1, 7, 3, 4, 5, 7, 7, 8}
### 📤 Output
- Highest = 8, 
- Total = 1

---

### 💡 Explanation

From the given array:
- The highest value is **8**
- The value **8 appears once**

So the total number of tallest candles is **1**.

---

## 2. Buy Toys

### 📌 Problem Description

Given:
- An amount of money
- A list of toy prices

Determine the maximum number of toys that can be purchased.

To maximize the number of toys:
- The cheapest toys should be purchased first.

This problem evaluates:
- Sorting
- Greedy strategy
- Budget calculation

---

### 📥 Input
- currentMoney = 50000 
- toys price = {20000, 3000, 10000, 40000, 5000, 50000}

### 📤 Output
- total Toys: 4

---

### 💡 Explanation

After sorting the prices in ascending order:

The user can purchase:
- 3000
- 5000
- 10000
- 20000

Total toys purchased: **4**

---

## 3. Fibonacci
### 📌 Problem Description
The Fibonacci sequence is a series of numbers where each number is the sum of the two numbers before it.
This Java program works with Fibonacci numbers in three different ways:
1. Checks if the input number is a Fibonacci number 
2. Print the series of the Fibonacci based on input
3. Create function to calculates a Fibonacci number using iteration 
4. Create function to calculates a Fibonacci number using recursion

---

### 📥 Input
- Fibonacci: 13

### 📤 Output
- 13: is Fibonacci
- series: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233]
- Fibonacci of 13: 233
- Fibonacci Rec of 13: 133

---

## 4. Matching Socks
### 📌 Problem Description
This program counts how many pairs (matches) exist in an integer array.

---

### 📥 Input
- array: {1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 5}
### 📤 Output
- Total: 6 Match

---

## 5. Palindrome
### 📌 Problem Description
This java program check whether an input string is palindrome or not.
String is palindrome only if the string return the same string when reversed.

---

### 📥 Input
- Madam
- Nababan
- Test
### 📤 Output
- Madam: true
- Nababan: true
- Test: false
---

## 6. Valley and Mountain Count
### 📌 Problem Description
This java program check how many mountains and valleys number that walked through.

case e.g:
Felix is a hiker. He carefully records every hike he makes.
During his last hike, he took n steps. For each step, he recorded whether it was:
- U → an uphill step (height increases by 1)
- D → a downhill step (height decreases by 1)

Felix always:
- Starts at height 0 (sea level)
- Ends at height 0
- Each step changes his altitude by 1 unit.

Definitions
1. Mountain: A sequence of consecutive steps above sea level,
starting with an uphill step (U) from sea level
and ending with a downhill step (D) back to sea level.
2. Valley: A sequence of consecutive steps below sea level,
starting with a downhill step (D) from sea level
and ending with an uphill step (U) back to sea level.

Given a string s representing Felix’s steps, determine and print the number of valleys and mountains he walked through.

---

### 📥 Input
- UDDDUDUU
### 📤 Output
- Mountain: 1
- Valley: 1
---
