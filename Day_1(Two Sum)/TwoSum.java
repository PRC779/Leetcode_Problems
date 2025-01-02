Class Solution{
		public int[] twoSum(int[] num,int target){
		
		int len = num.length;
		int[] res = new int[2];
		
		for(int i=0;i<len;i++){
			for(int j=i+1; j<len; j+){
			if(num[i] + num[j] == target){
			res[0]=i;
			res[1]=j;
			break;
			}
		}
	}
	return res;
}