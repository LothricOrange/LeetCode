int min(int a, int b) {
    return a > b ? b : a;
}

int minFallingPathSum(int** matrix, int matrixSize, int* matrixColSize){
    int** dp = (int**)malloc(matrixSize * sizeof(int*));
    for (int i = 0; i < matrixSize; i++) {
        dp[i] = (int*)malloc((*matrixColSize) * sizeof(int));
    }

    for (int i = 0; i < matrixSize; i++) {
        dp[0][i] = matrix[0][i];
    }

    for (int i = 1; i < matrixSize; i++) {
        for (int j = 0; j < matrixSize; j++) {
            int val = matrix[i - 1][j];
            if (j > 0) {
                val = min(val, dp[i - 1][j - 1]);
            }

            if (j < matrixSize - 1) {
                val = min(val, dp[i - 1][j + 1]);
            }
            dp[i][j] = val + matrix[i][j];
        }
    }

    int res = INT_MAX;
    for (int j = 0; j < matrixSize; j++) {
        res = min(res, dp[matrixSize - 1][j]);
    }


    for (int i = 0; i < matrixSize; i++) {
        free(dp[i]);
    }
    free(dp);

    return res;
}