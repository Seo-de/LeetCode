class Solution {
    public boolean isValid(String s) {
                
        Stack<Character> stack = new Stack<>();
        
        if(s.length() % 2 != 0) return false;

        else{
                    
            for(int i=0; i<s.length(); i++){

                char bracket = s.charAt(i);

                if(bracket == '(' || bracket == '[' || bracket == '{'){
                    stack.push(bracket);
                }else{
                    
                    if(!stack.isEmpty()){
                        char brac = stack.pop();
                        if(bracket == ')') {
                            if(brac != '(') return false;
                        }
                        if(bracket == ']'){
                            if(brac != '[') return false;
                        }
                        if(bracket == '}'){
                            if(brac != '{') return false;
                        }
                    }else return false;
                }

            }
        }

        if(stack.isEmpty()) return true;
        else return false;
    }
}