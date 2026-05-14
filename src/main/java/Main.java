    void main() {
        System.out.println(Arrays.toString(TwoSum(new int[]{ 6, 9, 7,2}, 9)));
        System.out.println(containsDuplicate(new int[]{ 6, 9, 7,2}));

    }

    public static int[] TwoSum( int [] array,int target){
        Map<Integer, Integer> map = new HashMap<>();
        int [] newArray = new int[2];
        for(int i=0;i<array.length;i++){
            int seen = target-array[i];
            if(map.containsKey(seen)){
                newArray[0] = map.get(seen);
                newArray[1] = i;
                return newArray;
            }
                map.put(array[i],i);
        }

        return newArray;
    }


    public static boolean containsDuplicate(int [] array){
    Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                return true;
            }
            map.put(array[i],i);
        }
        return false;
    }

