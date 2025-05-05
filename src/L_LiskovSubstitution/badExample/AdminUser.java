package L_LiskovSubstitution.badExample;

public class AdminUser extends User {
    @Override
    public void changePassword(String email, String newPassword) {
        throw new UnsupportedOperationException("Admin password is managed by LDAP");
    }
}
