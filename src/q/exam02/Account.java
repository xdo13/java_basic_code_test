package q.exam02;

import n.exam02.Day;

public class Account {
    protected String name;
    protected String no;
    protected long balance;

    Account(String n, String num, long z){
        name = n;
        no = num;
        balance = z;
    }

    String getName(){
        return name;
    }
    String getNo(){
        return no;
    }
    long getBalance(){
        return balance;
    }
    protected void deposit(long k){
        balance +=k;
    }
    void withdraw(long k){
        balance -= k;
    }
    public String toString(){
        return "{" + name + ", " + no + ", " + balance + "}";
    }
}
