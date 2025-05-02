package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

// Source: https://leetcode.com/problems/add-two-numbers/description/
//el error es que no manejaba correctamente el acarreo en sumas simples

public class TwoNumbersSum {
    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 0;
        for (int i = 0; i < Math.max(a.size(), b.size()); i++) {
            int digitA = i < a.size() ? a.get(i) : 0;
            int digitB = i < b.size() ? b.get(i) : 0;
            int sum = digitA + digitB + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }
        if (carry > 0) {
            result.add(carry);
        }
        return result;
    }
}