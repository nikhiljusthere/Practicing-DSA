
//  Removing element at index remove_index
//  program takes O(n) time

public void removeAt(int remove_index) {
    System.arraycopy(arr, remove_index + 1, arr, remove_index, len - remove_index - 1);
    arr[len - 1] = 0; // Assuming default value is 0
    --len;
    --capacity; // Assuming capacity needs adjustment too
}

/*
In the example, first arr refers to the original array
remove_index + 1 indicates that copying starts from the index 
immediately after the index of the element to be removed.
Second arr is the array to which elements will be copied.
len - remove_index - 1 calculates the number of elements remaining after the element at remove_index is removed.
len - remove_index - 1 is the number of elements to be copied from the source array to the destination array.
*/

//  better approach to remove element

import java.util.ArrayList;

public class array {
    private ArrayList<Integer> arr;
    
    public array() {
        arr = new ArrayList<>(); //assigning array to arraylist
    }
    
    public void removeAt(int rm_index) {
        arr.remove(rm_index);
    }
}

//  binary search

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        
        if (target >= letters[n - 1])
        {
            return letters[0];
        }

        int left = 0;
        int right = n - 1;

        while (left < right)
        {
            int mid = left + (right - left) / 2;
            if (letters[mid] > target)
            {
                right = mid; 
            }

            else
            {
                left = mid + 1; 
            }
        }

        return letters[left];
    }
}

//  reversing array with another array

public void reversing(){
    for (int i = 0; i < n; i++)
        {
            rev[i] = arr[n-i-1];
            System.out.printf("%d ",rev[i]);
        }
}
//  reversing array with temp variable

public void arrayreverse() {
    for (int i = 0; i < len / 2; i++) {
      int tmp = arr[i];
      arr[i] = arr[len - i - 1];
      arr[len - i - 1] = tmp;
    }
  }
