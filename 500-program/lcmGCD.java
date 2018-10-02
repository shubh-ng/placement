public class HelloWorld{

     public static void main(String []args){
        int arr1[] = {
            2,4
        };
        int arr2[] = {
            16,32,96
        };
        int LCM = lcm(arr1);
        int HCF = hcf(arr2);
        System.out.println(LCM);
        System.out.println(HCF);
     }
     
     public static int lcm(int[] arr1){
        int res = arr1[0];
        int size = arr1.length;
        for(int i=1; i<size; i++){
            res = lcm(res, arr1[i]);
        }
        return res;
     }
     
     public static int lcm(int a, int  b){
         return a*(b/gcd(a,b));
     }
     
     public static int gcd(int a, int b){
         if(b==0)
            return a;
         return gcd(b, a%b);
     }
     
     public static int hcf(int[] arr2){
         int res = arr2[0];
         int size = arr2.length;
         for(int i=1; i<size; i++){
             res = gcd(res, arr2[i]);
         }
         return res;
     }
}
