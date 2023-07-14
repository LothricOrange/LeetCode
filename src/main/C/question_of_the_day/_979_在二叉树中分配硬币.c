struct TreeNode {
    int val;
    struct TreeNode *left;
    struct TreeNode *right;
 };


int dfs(struct TreeNode* node, int* move) {
    if (node == NULL) return 0;
    int mLeft = 0;
    int mRight = 0;
    if (node->left != NULL) {
        mLeft = dfs(node->left, move);
    }   
    if (node->right != NULL) {
        mRight = dfs(node->right, move);
    }
    (*move) += abs(mLeft) + abs(mRight);
    return mLeft + mRight + node->val - 1; 

}

int distributeCoins(struct TreeNode* root){
    int move = 0;
    dfs(root, &move);
    return move;
}