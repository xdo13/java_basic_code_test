package n.exam03;

import n.exam02.Day;

public class Account {
    private String name;
    private String no;
    private long balance;
    private Day openDay;

    Account(String n, String num, long z,Day d){
        name = n;
        no = num;
        balance = z;
        openDay = new Day(d);
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
    public Day getOpenDay(){
        return new Day(openDay);
    }
    void deposit(long k){
        balance +=k;
    }
    void withdraw(long k){
        balance -= k;
    }
    public String toString(){
        return "{" + name + ", " + no + ", " + balance + "}";
    }
}
