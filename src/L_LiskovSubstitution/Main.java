package L_LiskovSubstitution;

import L_LiskovSubstitution.badExample.AdminUser;
import L_LiskovSubstitution.badExample.User;
import L_LiskovSubstitution.goodExample.PasswordChangeable;
import L_LiskovSubstitution.goodExample.RegularUser;

/**
 *  Liskov Substitution Principle (LSP)
 * "Subtypes must be substitutable for their base types."
 * - Focuses on correct inheritance behavior.
 * - If class B extends class A, then B should behave like A in all contexts.
 * - Violation usually occurs when a subclass overrides or disables base behavior in an incompatible way.
 * Key question LSP asks:
 * “Can I replace A with B without breaking anything?”
 */
public class Main {

    //bad example
    public static void resetPasswordBad(User user, String email, String newPassword) {
        user.changePassword(email, newPassword);
    }

    //good example
    public static void resetPasswordGood(PasswordChangeable passwordChangeable, String email, String newPassword) {
        passwordChangeable.changePassword(email, newPassword);
    }


    public static void main(String[] args) {

        //bad example
        AdminUser adminUser = new AdminUser();
        resetPasswordBad(adminUser, "email", "hello123");

        //good example
        AdminUser adminUser1 = new AdminUser();
//        resetPasswordGood(adminUser1,"email","hello123");// will give error because AdminUser class doesn't implement PasswordChangeable interface
        RegularUser regularUser = new RegularUser();
        resetPasswordGood(regularUser, "email", "hello123");
    }


}
