package section1_3.OOP.Encapsulation;

import java.time.LocalDate;

// Sử dụng
public class Main {
    public static void main(String[] args) {
        UserProfile user = new UserProfile.Builder()
                .username("devmaster")
                .email("dev@company.com")
                .dateOfBirth(LocalDate.of(1990, 5, 15))
                .build();

        System.out.println("Hello, " + user.getUsername());
    }
}
