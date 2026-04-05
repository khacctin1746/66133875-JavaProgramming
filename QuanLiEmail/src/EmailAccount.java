public class EmailAccount {
    private String email;
    private String password;
    private double storageLimit;
    private double usedStorage;

    // constructor default
    public EmailAccount() {
        this.email = "empty";
        this.password = "empty";
        this.storageLimit = 0;
        this.usedStorage = 0;
    }

    // constructor
    public EmailAccount(String email, String password, double storageLimit, double usedStorage) {
        this.setEmail(email);
        this.setPassword(password);
        this.setStorageLimit(storageLimit);
        this.usedStorage = usedStorage;
    }

    //getter
    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public double getStorageLimit() {
        return this.storageLimit;
    }

    public double getUsedStorage() {
        return this.usedStorage;
    }

    //setter
    public void setEmail(String email) {
        if(email != null && !email.trim().isEmpty()) {
            if(email.contains("@") && email.contains(".")) {
                this.email = email;
            } else {
                System.out.println("Định dạng email không hợp lệ (phải chứa @ và .)");
            }
        } else {
            System.out.println("Email không được rỗng");
        }
    }

    public void setPassword(String password) {
        if(password != null && !password.trim().isEmpty()) {
            if(password.length() >= 8) {
                this.password = password;
            } else {
                System.out.println("Mật khẩu phải có ít nhất 8 kí tự");
            }
        } else {
            System.out.println("Mật khẩu không được rỗng");
        }
    }

    public void setStorageLimit(double storageLimit) {
        if(!(storageLimit <= 0)) {
            this.storageLimit = storageLimit;
        } else {
            System.out.println("Dung lượng của bộ nhớ không được >= 0");
        }
    }

    public void setUsedStorage(double usedStorage) {
        if(!(usedStorage >= this.storageLimit)) {
            this.usedStorage += usedStorage;
        } else {
            System.out.println("Bộ nhớ đã đầy");
        }
    }

    public void changePassword(String oldpass, String newpass) {
        if((oldpass.equals(this.password))) {
            if(!(newpass.length() <= 8)) {
                this.password = newpass;
            } else {
                System.out.println("Mật khẩu mới phải tối thiểu 8 kí tự");
            }
        } else {
            System.out.println("Mật khẩu cũ bạn nhập không chính xác");
        }
    }

    public void uploadFile(double sizeGB) {
        setUsedStorage(sizeGB);
    }

    public double calculateStoragePercentage() {
        return (this.usedStorage/this.storageLimit)*100;
    }
}
