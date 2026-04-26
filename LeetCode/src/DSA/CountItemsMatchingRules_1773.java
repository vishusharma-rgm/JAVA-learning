package DSA;
// // https://leetcode.com/problems/count-items-matching-a-rule/
class Solution {
    // 1773. Count Items Matching a Rule

//     // function jo answer return karega
//     public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

//         // step 1 → ek counter banate hain
//         int count = 0;

//         // step 2 → har item par loop chalega
//         for (List<String> item : items) {

//             /*
//             item ek list hai jisme 3 values hoti hain
//             item.get(0) → type
//             item.get(1) → color
//             item.get(2) → name
//             */

//             // agar ruleKey = "type" hai
//             if (ruleKey.equals("type")) {

//                 // type match ho raha hai kya?
//                 if (item.get(0).equals(ruleValue)) {
//                     count++;   // match mila → count +1
//                 }
//             }

//             // agar ruleKey = "color" hai
//             else if (ruleKey.equals("color")) {

//                 // color match ho raha hai kya?
//                 if (item.get(1).equals(ruleValue)) {
//                     count++;
//                 }
//             }

//             // agar ruleKey = "name" hai
//             else if (ruleKey.equals("name")) {

//                 // name match ho raha hai kya?
//                 if (item.get(2).equals(ruleValue)) {
//                     count++;
//                 }
//             }
//         }

//         // final count return
//         return count;
//     }
}