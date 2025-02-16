class ProductOfNumbers {

   ArrayList<Integer> prefix;
   int str=1;
    public ProductOfNumbers() {
        prefix=new ArrayList<>();   
    }
    public void add(int num) {
       str=str*num;
       prefix.add(str);
       if(num==0){
        prefix.clear();
         str=1;
       }
    }
    public int getProduct(int k) {
        int cnt=prefix.size()-k;
        if( cnt<0)
          return 0;
        if(cnt==0)
          return prefix.get(prefix.size()-1);
        else
         return prefix.get(prefix.size()-1)/prefix.get(cnt-1);     
    }
}