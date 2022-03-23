class Solution {
    public String kthDistinct(String[] arr, int k) {
        String [] already = new String[arr.length];
        String [] distinct = new String[arr.length];
        int x=0;
        Map<String,Integer> hello = new HashMap<>(); //hashmap introducing
        for(int i=0;i<arr.length;i++){
            if(!hello.containsKey(arr[i])){ //adding values to hashmap
                hello.put(arr[i],1); //set the key
            }
            else{
                already[x]=arr[i]; //already exists add to another string
                x++;
            }
        }
        
        for(String str: already)
        {
                hello.remove(str); //removing the values that are present in already string
        }
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            for(String str : hello.keySet()) //setting the key
            {
                if(arr[i]==str) //matching the values with unique values in the hashmap
                {
                    distinct[j]=arr[i]; //adding to new string
                    j++;
                }
            }
        }
        if(distinct[k-1]==null)
        {
            return ""; //no distinct values return empty
        }
        return distinct[k-1];
    }
}
