package uebungen.leetcode;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {

        int counter = 0;
        int[] numsNoVal;
         
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != val) counter++; 
        }

        numsNoVal = new int[counter];
        System.out.println("NewNums.length: " + numsNoVal.length);

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != val) numsNoVal[i] = nums[i];
        }

        nums = numsNoVal;

        return counter; 
    }
}
