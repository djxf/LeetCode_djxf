
public class test{

public static void main(String[] args) {

            
            System.out.println(isSub('9', '1'));
      
    }

    public static  boolean isInterleave(String s1, String s2, String s3) {
        int m = 0;
        int n = 0;
        int i = 0;
        if(s3.length() != s1.length() + s2.length()){
            return false;
        }
        while(m <= s1.length()-1 && n <= s2.length()-1){
            if(s3.charAt(i) == s1.charAt(m)){
                i++;
                m++;
            }else if(s3.charAt(i) == s2.charAt(n)){
                i++;
                n++;
            }else{
                return false;
            }
        }
        System.out.println("======i："+i+"=====m:"+m+"=====n:"+n);
        if(m == s1.length()){
            while(n <= s2.length()-1){
                if(s3.charAt(i) == s2.charAt(n)){
                    i++;
                    n++;
                }else{
                    return false;
                }
            }
        }else if(n == s2.length()){
            while(m <= s1.length() - 1){
                if(s3.charAt(i) == s1.charAt(m)){
                    i++;
                    m++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static String findNumsIndex(String string){

        if(string == null || string.length()== 0) return "-1";
	    String[] strs = string.split(" ");
	    int[] nums = new int[strs.length];
	    for(int i = 0;i < strs.length;i++){
	        nums[i] = Integer.parseInt(strs[i]);
	    }
	    if(nums == null || nums.length <= 1){
	        return "-1";
	    }
	    StringBuilder stringBuilder = new StringBuilder();
	    int max2 = nums[0] > nums[1] ? nums[1] : nums[0];
	    int max1 = nums[0] > nums[1] ? nums[0] : nums[1];
	    if(nums[0] > nums[1]){
	        stringBuilder.append(1+" ");
	    }
	    
	    for(int i = 2;i <= nums.length-1;i++){
	          if(max2 <= nums[i] && nums[i] < max1){
	              //记录索引  
	              stringBuilder.append(i+" ");
	          }
	          //更新最大值和第二大值
	          if(nums[i] > max2){
	              if(nums[i] > max1){
	                  max1 = nums[i];
	              }else{
	                  max2 = nums[i];
	              }
	          }
	    }
	    //返回结果
	    return stringBuilder.length() != 0 ?  stringBuilder.toString() : "-1";
	  }

       //判断两个字符是否相差 1 
    public static boolean isSub(char c1,char c2){
        return Math.abs(c1 - c2) == 1;
    }


    //记录靓号以及价值的map
    Map<String,Integer> map = new LinkedHashMap<>();
    
    public String sortLH(String string){
        if(string == null || string.length()== 0) return "没有靓号呢！";
	    String[] strs = string.split(" ");
	    if(strs == null || strs.length == 0) return "没有靓号呢！";
        //遍历号码进行 计算最大价值并记录
        for(int i = 0;i < strs.length;i++){
            int v1 = isBZHAndRecordVlaue(strs[i]);
            int v2 = isSZHAndRecordVlaue(strs[i]);
            int value = v1 > v2 ? v1 : v2;
            map.put(strs[i],value);
        }
        
        //排序输出
        //...
        
    }
    
    
    //判断是否是豹子号以及记录位数
    public int isBZHAndRecordVlaue(String number){
        if(number.length() < 8) return 0;
        String str = number.substring(4);
        int i;
        int j;
        int max = 0;
        for(i = 0;i < str.length()-1;i++){
            for(j = i + 1;j < str.length()-1;j++){
                if(str.charAt(j) == str.charAt(i) && str.charAt(j) == str.charAt(j + 1)){
                    j++;
                    if(j - i > max){
                        max = j - i;
                    }
                }else{
                    i = j;
                    j += 1;
                }
            }
        }
        return max;
    }
    
    //判断是否是顺子号以及记录位数
    public int isSZHAndRecordVlaue(String number){
        if(number.length() < 8) return 0;
        String str = number.substring(4);
        int i;
        int j;
        int max = 0;
        for(i = 0;i < str.length()-1;i++){
            for(j = i + 1;j < str.length()-1;j++){
                if( isSub(str.charAt(j),str.charAt(i))&& isSub(str.charAt(j),str.charAt(j + 1))){
                    j++;
                    if(j - i > max){
                        max = j -1;
                    }
                }else{
                    i = j;
                    j += 1;
                }
            }
        }
        return max;
    }
    
    //判断两个字符是否相差 1 
    public boolean isSub(char c1,char c2){
        return Math.abs(c1 - c2) == 1;
    }



}