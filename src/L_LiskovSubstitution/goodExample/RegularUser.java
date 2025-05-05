package L_LiskovSubstitution.goodExample;

public class RegularUser implements PasswordChangeable {
    @Override
    public void changePassword(String email, String newPassword) {
        //some logic for changing password
    }
}
