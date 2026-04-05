public class Main {
    public static void main(String[] args) {

        //test case 1:
        EmailAccount email1 = new EmailAccount();
        email1.setEmail("khacctin@gmail.com");
        email1.setPassword("meomeo@123");
        email1.setStorageLimit(10);
        email1.changePassword("meomeo@123", "meomeo@1234");
        email1.uploadFile(2);
        //debug
        System.out.println("Email: " + email1.getEmail());
        System.out.println("Password: " + email1.getPassword());
        System.out.println("Bộ nhớ đã dùng: " + email1.getUsedStorage());
        System.out.println("Bộ nhớ tối đa: " + email1.getStorageLimit());
        System.out.println("% Bộ nhớ đã dùng: " + email1.calculateStoragePercentage() + "%");

        System.out.println("= = = = = = = = = = = = = = = = = = = =");
        //test case 2:
        EmailAccount email2 = new EmailAccount();
        email2.setEmail("khacctingmailcom");
        email2.setPassword("@123");
        email2.setStorageLimit(-1);
        email2.changePassword("meomeo@124", "meomeo@1234");
        email2.uploadFile(2);
        //debug
        System.out.println("Email: " + email2.getEmail());
        System.out.println("Password: " + email2.getPassword());
        System.out.println("Bộ nhớ đã dùng: " + email2.getUsedStorage());
        System.out.println("Bộ nhớ tối đa: " + email2.getStorageLimit());
        System.out.println("% Bộ nhớ đã dùng: " + email2.calculateStoragePercentage() + "%");

        System.out.println("= = = = = = = = = = = = = = = = = = = =");
        //test case 3:
        EmailAccount email3 = new EmailAccount();
        email3.setEmail("khacctin3@gmail.com");
        email3.setPassword("meomeo@124");
        email3.setStorageLimit(-1);
        email3.changePassword("meomeo@124", "");
        email3.uploadFile(-1);
        //debug
        System.out.println("Email: " + email3.getEmail());
        System.out.println("Password: " + email3.getPassword());
        System.out.println("Bộ nhớ đã dùng: " + email3.getUsedStorage());
        System.out.println("Bộ nhớ tối đa: " + email3.getStorageLimit());
        System.out.println("% Bộ nhớ đã dùng: " + email3.calculateStoragePercentage() + "%");
    }
}