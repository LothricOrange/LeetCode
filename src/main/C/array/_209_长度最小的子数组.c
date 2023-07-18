int minSubArrayLen(int target, int* nums, int numsSize){
    int min = INT_MAX;
    int sum = 0;
    int begin = 0;
    for (int end = 0; end < numsSize; end++) {
        sum += nums[end];
        while (sum >= target) {
            int len = end - begin + 1;
            min = min < len ? min : len;
            sum -= nums[begin];
            begin++;
        }
    }

    return min == INT_MAX ? 0 : min;
}