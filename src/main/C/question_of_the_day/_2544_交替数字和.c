
int alternateDigitSum(int n) {
	int count = 0;
	int res = 0;
	while (n > 0) {
		count++;
		int num = n % 10;
		if ((count & 1) == 1) {
			res += num;
		} else {
			res -= num;
		}
		n = n / 10;
	}

	if ((count & 1) == 0) return -res;
	return res;
}