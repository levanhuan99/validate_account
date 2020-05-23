public class Test {
    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };
    public static AccountExample accountExample;

    public static void main(String[] args) {
        accountExample=new AccountExample();
        for (int i=0;i<invalidAccount.length;i++){
            boolean isNotValid=accountExample.validAccount(invalidAccount[i]);
            System.out.println("account "+invalidAccount[i]+" "+isNotValid);
        }
    }
}
