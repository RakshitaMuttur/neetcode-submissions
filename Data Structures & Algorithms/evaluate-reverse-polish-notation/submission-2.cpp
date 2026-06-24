class Solution {
public:
    int evalRPN(vector<string>& tokens) 
    {
        stack<int> num;
        int a; int b; int res;
        for(string t : tokens)
        {
            if(t!="+" &&
               t!="-" &&
               t!="*" &&
               t!="/" ) 
              num.push(std::stoi(t));

            else
            {
                if(t=="+"){
                a=num.top();
                num.pop();
                b=num.top();
                num.pop();
                num.push(a+b);}

                if(t=="-"){
                a=num.top();
                num.pop();
                b=num.top();
                num.pop();
                num.push(b-a);}

                if(t=="*"){
                a=num.top();
                num.pop();
                b=num.top();
                num.pop();
                num.push(a*b);}

                if(t=="/"){
                a=num.top();
                num.pop();
                b=num.top();
                num.pop();
                num.push(b/a);}    
            }
        }
        res=num.top();
        num.pop();
        return res;
    }
};
