abstract class AccountHolder {

    protected int id;
    protected String address;

    public AccountHolder(int id, String address) {
        this.id = id;
        this.address = address;
    }

    public static int getNextId() {
        int min = 1;
        int max = 1000000;
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
}