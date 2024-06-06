//  2553. Separate the Digits in an Array
//  https://leetcode.com/problems/separate-the-digits-in-an-array/description/


class Solution {
    public int[] separateDigits(int[] nums) {
        
        int n = 0;
        for (int i : nums) // counting digits
        {
            while (i > 0)
            {
                n++;
                i = i / 10;
            }
        }

        int[] ar = new int[n];
        
        for (int i = nums.length - 1; i >= 0; i--) // traversing backwards as remainder needs to be inserted first
        {
            int temp = nums[i];
            
            while (temp > 0)
            {
                ar[--n] = temp % 10;
                temp = temp / 10;
            }
        }

        return ar;
    }
}

__________________________________________________________________________________

//Other method:

class Solution {
    public int[] separateDigits(int[] nums) {
        
        List<Integer> allNumbers = new ArrayList<>();
        for (int number : nums)
        {
            String string1 = Integer.toString(number);

            for (char alldigits : string1.toCharArray())
            {
                 int digit = Character.getNumericValue(alldigits);
                 allNumbers.add(digit);
            }
        }

        int[] answer = new int[allNumbers.size()];
        for (int i = 0; i < allNumbers.size(); i++)
        {
            answer[i] = allNumbers.get(i);
        }

        System.out.print("[");
        for ( int i = 0; i < answer.length; i++)
        {
            System.out.printf("%d,",answer[i]);
        }

        System.out.print("]");

        return answer;
    }
}

/* String string1 = Integer.toString(number);
for (char alldigits : string1.toCharArray()) {
    int digit = Character.getNumericValue(alldigits);
    allNumbers.add(digit);
}
```

1. Integer to String Conversion:
   - `Integer.toString(number)` converts the integer `number` to a string representation `string1`. For example, if `number` is `123`, then `string1` becomes `"123"`.

2. Separating Digits:
   - `string1.toCharArray()` converts the string `string1` into an array of characters, where each character represents a digit.
   - The for-each loop `for (char alldigits : string1.toCharArray()) { ... }` iterates through each character in the array of characters.
   - Inside the loop:
     - `alldigits` represents each character in the string, which is a digit character.
     - `Character.getNumericValue(alldigits)` converts the digit character `alldigits` back to its numeric value `digit`.
     - For example, if `alldigits` is `'3'`, then `digit` becomes `3`.

3. Adding Digits to List:
   - `allNumbers.add(digit)` adds each separated digit (`digit`) to the `allNumbers` list.
   - After the loop completes for one integer in the `nums` array, all its digits are added to the list.

4. Repeat for Each Integer:
   - This process of converting an integer to a string, separating its digits, and adding them to the list is repeated for each integer in the `nums` array.
   - The final `allNumbers` list contains all the separated digits from all integers in the `nums` array.

Overall, this part of the code efficiently separates the digits of each integer in the `nums` array and stores them in the `allNumbers` list for further processing.
*/