package chp08.ex8_8;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.printf("계좌번호를 입력하세요(5자리):");
        String accountNumber = sc1.nextLine();
        System.out.printf("* 성명 입력:");
        String name = sc1.nextLine();
        System.out.printf("* 비밀번호 :");
        String pwd = sc1.nextLine();
        System.out.printf("* 입금할 금액:");
        int balance = sc2.nextInt();

        Account account = new Account(balance,name,pwd,accountNumber);
        System.out.println(account);

//      통장에서 2600000원 입금
        System.out.printf("* 입금할 금액:");
        int deposit = sc2.nextInt();
        account.deposit(deposit);
//      통장에서 2600000원 입금
        System.out.printf("* 출금할 금액:");
        int withrow = sc2.nextInt();
        account.withdraw(withrow);

        System.out.printf("계좌의 현재 잔액은 %d원입니다.\n", account.getBalance());

        System.out.printf("%s님의 통장 잔액은 %d원입니다.\n",account.getName(),account.getBalance());

        sc1.close();
        sc2.close();
    }
}
