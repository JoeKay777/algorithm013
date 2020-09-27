学习笔记

```
状态定义dp[i][j]:走到坐标为[i,j]的网格的不同路径
状态转移方程:dp[i][j] =  obstacleGrid[i][j] == 1 ? 0 : (dp[i-1][j] + dp[i][j-1])
```