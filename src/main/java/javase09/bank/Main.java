package javase09.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.setTitle("Meli");

        Branch branch1 =
                Branch
                        .builder()
                        .id(1)
                        .address("Shahriare")
                        .build();
             Branch branch2 =
                Branch
                        .builder()
                        .id(1)
                        .address("sadatabade")
                        .build();
             bank.addBranch(branch1,branch2);

        Customer customer1=
                Customer
                        .builder()
                        .name("mobina")
                        .build();
        CardAccount cardAccount=
                CardAccount
                        .builder()
                        .accountNumber(1234)
                        .build();
        cardAccount.setCustomer(customer1);
        cardAccount.setBranch(branch1);
        Customer customer2=
                Customer
                        .builder()
                        .name("zeinab")
                        .build();
        ChekAccount chekAccount=
                ChekAccount
                        .builder()
                        .chekNumber(5678)
                        .build();
        chekAccount.setCustomer(customer2);
        chekAccount.setBranch(branch1);
        Customer customer3=
                Customer
                        .builder()
                        .name("hakimeh")
                        .build();
        SavingAccount savingAccount=
                SavingAccount
                        .builder()
                        .profit(9)
                        .build();
        savingAccount.setCustomer(customer3);
        savingAccount.setBranch(branch2);
        branch1.addAccount(cardAccount,chekAccount);
        branch2.addAccount(savingAccount);


        for (Branch branch : bank.getBranchArrayList()) {
            System.out.println("branch address : "+branch.getAddress());
            for (Account account : branch.getAccountList()) {
                System.out.println("account number : "+account.getAccountNumber());
                System.out.println("costumer name : "+account.getCustomer().getName());
                System.out.println("**");
            }
            System.out.println("-----------------------------------------------");
        }


    }
}
