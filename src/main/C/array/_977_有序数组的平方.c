int* sortedSquares(int* nums, int numsSize, int* returnSize){
    int left = 0;
    int right = numsSize - 1;
    int* arr = (int*)malloc(numsSize * sizeof(int));
    int index = right;
    *returnSize = numsSize;
    while (left <= right) {
        int valL = nums[left] * nums[left];
        int valR = nums[right] * nums[right];
        if (valL > valR) {
            arr[index] = valL;
            ++left;
        } else {
            arr[index] = valR;
            --right;
        }
        --index;
    }
    return arr;
}