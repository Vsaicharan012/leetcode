#include <unordered_map>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> numMap; // Map to store the numbers and their indices
        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums[i];
            // Check if the complement exists in the map
            if (numMap.find(complement) != numMap.end()) {
                return {numMap[complement], i};
            }
            // Add the current number and its index to the map
            numMap[nums[i]] = i;
        }
        return {}; // This line is unreachable given the problem's assumption
    }
};
