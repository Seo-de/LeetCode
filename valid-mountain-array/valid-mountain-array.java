class Solution {
    public boolean validMountainArray(int[] arr) {
        
        if(arr.length <= 2) return false;
        
        int index = getMax(arr);
        int temp = arr[index];
        
        // index가 0이거나 arr의 길이의 크기와 같으면 산모양이 안되니 false
        if(index == 0 || index == arr.length-1) return false;
        
        // 최대값의 index번호에서 1씩 작아지는 for문
        // temp보다 arr의 i번째 값이 같거나 작으면 안되니 false
        for(int i=index-1; i>=0; i--){
            if(temp <= arr[i]) return false;
            temp = arr[i];
        }
        
        //temp 값을 다시 선언
        temp = arr[index];
        
        // 최대값의 index에서 1씩 증가하는 for문
        // temp보다 arr의 i번째 값이 같거나 작으면 안되니 false;
        for(int i = index+1; i<arr.length; i++){
            if(temp <= arr[i]) return false;
            temp = arr[i];
        }
        return true;
    }
    
    public int getMax(int[] arr){
        int max = arr[0];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}