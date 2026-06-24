class Solution {
public:
    bool isValid(string s) 
    {
        stack<char> st;
        for(char c : s)
        {
            if(c=='[' || c=='{' || c=='(' )
            {
                st.push(c);
            }
            //no open brackets have been pushed to the stack.
            else
            {
            if(st.empty()) return false;  

            char top=st.top(); //top() used to get the top of the stack.
            if((c==')' && top!='(') || 
               (c=='}' && top!='{') ||
               (c==']' && top!='[')) return false;
               

            st.pop();
        }
        }
        return st.empty();
    }
};
