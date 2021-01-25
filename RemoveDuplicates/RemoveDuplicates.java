// You know you need to keep track of two elements always
// Your first number will always be unique

class Solution {
  public int removeDuplicates(int[] nums) {
    int index = 1; // begin placing after our first element
    for(int i = 0; i < nums.length - 1; i++) {
      // check if two numbers are the same
      if(nums[i] != nums[i + 1]) { // check if two numbers are the same

        nums[index++] = nums[i + 1]; // if they aren't, then place current number @ whatever index we are on
      }
    }

    return index;
  }
}


