import java.util.Stack;
 class Solution {
     public boolean isValid(String s) {
//         Stack<Character> st = new Stack<>();
//         char ar[] = s.toCharArray();
//         for(int i=0;i<ar.length;i++){
//             char c = ar[i];
//             if(c == '(' || c == '[' || c == '{'){
//                 st.push(c);
//             }
//             else{
//                 if(st.isEmpty()){
//                     return false;
//                 }
//                 else{
//                     char t = st.pop();
//                     if(c == ')' && t != '(' || c == ']' && t != '[' || c == '}' && c == '{'){
//                         return false;
//                     }
//                 }
//             }
//         }
//         return st.isEmpty();
//     }
// }
Stack<Character> stack = new Stack<>();
        char ar[] = s.toCharArray();
        for(int i=0;i<ar.length;i++) {
             char ch = ar[i];
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();  
                if ((ch == ')' && top != '(') ||
                (ch == '}' && top != '{') ||
                (ch == ']' && top !='[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
 }