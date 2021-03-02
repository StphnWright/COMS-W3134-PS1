public class BigO implements BigOInterface {

	public void cubic(int n) {
        double sum = 0;
        for(int i = 0; i < n; i ++)
            for(int j = 0; j < n; j ++)
                for(int k = 0; k < n; k ++)
                    sum += Math.cos(n);
    }
    
	public void exp(int n) {
        expRecursive(n);   
    }
    
    private void expRecursive(int n){
        if(n != 1){
            expRecursive(n - 1);
            expRecursive(n - 1);
        }
    }
    
	public void constant(int n) {
        //do nothing
    }  
}
