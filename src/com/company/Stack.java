package com.company;
public class Stack {
    private int top;
    private static final int MAX=1000;
    private int a[]=new int[MAX];

    private boolean isEmpty(){
        return (top<0);
    }
    private Stack(){
        top=-1;
    }
    private void push(int x){
        if(top>=MAX-1){
            System.out.println("Stack Overflow");
        }
        else{
            a[++top]=x;
            System.out.println(x+"Pushed");
        }
    }
    private int pop(){
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            int x=a[top--];
            return x;
        }
    }
    private int peek(){
        if(top<0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            return a[top];
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        int y=s.peek();
        int z=s.pop();
        System.out.println(y+" "+z);

    }

}
