/**
 * Problem Link : https://leetcode.com/problems/game-play-analysis-i/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

#include <bits/stdc++.h>
using namespace std;

select player_id,min(event_date) as first_login
from Activity
group by player_id;
