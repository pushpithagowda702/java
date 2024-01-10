import java.util.*;

class Account {
  int accn;
  String name;
  double balance;

  public Account(int accn, String name, double balance) {
    this.accn = accn;
    this.name = name;
    this.balance = balance;
  }

  public synchronized void deposit(int amt) {
    this.balance += amt;
  }

    public synchronized boolean withdraw(int amt) {
      if(this.balance >= amt) {
        this.balance -= amt;
        return true;
      }
      return false;
    }


}

class AccountManager {
  private final static AccountManager a = new AccountManager();
  private final Map<Integer, Account> accs = new HashMap<>();

  private AccountManager(){}

  public static AccountManager getInstance() {
    return a;
  }

  public synchronized void createAccount(int ac, String name. double bal) {
    if(!aacs.containsKey(ac)) {
      accs.put(new Account(ac, name, bal));
    }
  }
  
  public synchronized void deposit(int ac, int amt) {
    if(!acs.containsKey(ac)) {
      Account anc = accs.get(ac);
      anc.de
    }
  }
}