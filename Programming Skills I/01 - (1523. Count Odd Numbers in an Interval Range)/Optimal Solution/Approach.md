## Approach

Here the approach is as follows:

- For any sequence of numbers of n, the number of odd numbers will be n/2 or one greater than n/2
- With this logic, let's try to solve this problem
- Only in the case of low and high bith being the odd numbers, the number of odd numbers in the sequence wil be  1 + n/2
- For any other cases, the result would be computed by n/2
  
### For Examples:

#### 1. Both being odd 
``` 1, 2, 3 ,4, 5``` 
- no of elements = 5
- half = 2 (rounded off)
- no of odds = 3 

Therefore, odds = half + 1

### 2. Any other cases such as both even, odd-even or even-odd
```2,3,4,5,6```
```1,2,3,4,5,6,7```
```2,3,4,5```
odds = half





